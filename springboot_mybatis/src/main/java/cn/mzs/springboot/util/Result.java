package cn.mzs.springboot.util;

import lombok.Data;

@Data
public class Result {
    /**
     * 200-请求成功
     * 400-请求失败
     */
    private String code;
    private String message;
    private Object data;

    public Result(){

    }

    public Result(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 操作成功
     * @return
     */
    public static Result success(){
        return new Result("200","操作成功",null);
    }

    /**
     * 操作成功
     * @param data
     * @return
     */
    public static Result success(Object data){
        return new Result("200","操作成功",data);
    }

    /**
     * 操作失败
     * @param message
     * @param data
     * @return
     */
    public static Result fail(String message,Object data){
        return new Result("400",message,data);
    }

    /**
     * 操作失败
     * @param message
     * @return
     */
    public static Result fail(String message){
        return new Result("400",message,null);
    }

}
