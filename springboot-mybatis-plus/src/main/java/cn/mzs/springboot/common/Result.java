package cn.mzs.springboot.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 结果封装对象
 */
@Data
public class Result implements Serializable {
    private String code;
    private String msg;
    private Object data;

    public Result() {
    }

    public Result(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 操作成功
     *
     * @param data
     * @return
     */
    public static Result success(Object data) {
        Result result = new Result("200", "操作成功", data);
        return result;
    }

    /**
     * 操作成功
     *
     * @param data
     * @param msg
     * @return
     */
    public static Result success(Object data, String msg) {
        Result result = new Result("200", "操作成功", data);
        return result;
    }

    /**
     * 操作失败
     *
     * @param data
     * @param msg
     * @return
     */
    public static Result fail(Object data, String msg) {
        Result result = new Result("400", "操作成功", data);
        return result;
    }


}
