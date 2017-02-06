package cn.yifan.cloud.controller;

import cn.yifan.cloud.exception.UnknownResourceException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Default controller that exists to return a proper REST response for unmapped requests.
 */
@RestController
public class FilterController {

    @RequestMapping("*/*")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void unmappedRequest(HttpServletRequest request) throws Exception {
        String uri = request.getRequestURI();
        throw new UnknownResourceException("url is invalid： " + uri);
    }
}
