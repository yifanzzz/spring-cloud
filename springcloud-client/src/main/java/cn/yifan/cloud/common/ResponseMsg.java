package cn.yifan.cloud.common;

/**
 * Created by hopezzz on 2016/11/30.
 */
public class ResponseMsg implements  java.io.Serializable{

    private static final long serialVersionUID = 4313823726870379509L;

    private static final String OK="ok";
    private static final String ERROR="error";

    private Meta meta;
    private Object data;

    public ResponseMsg(){
        this.meta=new Meta(true);
        this.data=null;
    }

    public  ResponseMsg success(){
        this.meta=new Meta(true,OK);
        return this;
    }

    public  ResponseMsg success(Object data){
        this.meta=new Meta(true,OK);
        this.data=data;
        return this;
    }

    public  ResponseMsg failure(){
        this.meta=new Meta(false,ERROR);
        return this;
    }

    public  ResponseMsg failure(String  message){
        this.meta=new Meta(false,message);
        return this;
    }

    public Meta getMeta(){
        return meta;
    }

    public Object getData(){
        return data;
    }



    public class Meta  implements java.io.Serializable{
        /**
         *
         */
        private static final long serialVersionUID = -3255526230221389968L;
        private boolean success;
        private String  message;

        public Meta(){
            this.success=true;
            this.message=OK;
        }

        public Meta(boolean success){
            this.success=success;
        }

        public Meta(boolean success,String  message){
            this.success=success;
            this.message=message;
        }

        public boolean isSuccess(){
            return success;
        }

        public String getMessage(){
            return message;
        }

    }
}
