package cn.yifan.cloud.exception;

import cn.yifan.cloud.common.ResponseMsg;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.sql.SQLException;
import java.util.Set;



@ControllerAdvice
public class GlobalHandlerAdvice {
	// 定义全局异常处理，value属性可以过滤拦截条件，此处拦截所有的Exception
	
	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public ResponseMsg exception(Exception exception) {
		return new ResponseMsg().failure(exception.getMessage());
	}
	
	@ExceptionHandler(value = UnknownResourceException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public ResponseMsg unknownResourceException(UnknownResourceException exception) {
		return new ResponseMsg().failure(exception.getMessage());
	}
	
	@ExceptionHandler(value = SQLException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public ResponseMsg sqlException(SQLException exception) {
		return new ResponseMsg().failure(exception.getMessage());
	}

	@ExceptionHandler(value = ConstraintViolationException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ResponseMsg paremeterExcption(ConstraintViolationException exception) {

		StringBuilder sb = new StringBuilder();
		Set<ConstraintViolation<?>> exp = exception.getConstraintViolations();
		for (ConstraintViolation<?> cv : exp) {
			sb.append(cv.getMessage());
			sb.append(",");
		}
		return new ResponseMsg().failure(sb.toString());

	}
}