package com.easyai.forfree.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @Author Mark li
 * @Date 2023/7/26 0026 15:19
 * @ProjectName easyai
 */

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> {

    public static final String SUCCESS_MSG = "success";

    public static final String FAIL_MSG = "fail";

    /**
     * 状态码
     */
    private int status = 200;

    /**
     * 描述
     */
    private String message;

    /**
     * 返回数据实体
     */
    private T obj;

    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public T getObj()
    {
        return obj;
    }

    public void setObj(T obj)
    {
        this.obj = obj;
    }

    public static <T> Result<T> success()
    {
        Result<T> result = new Result<>();
        result.setStatus(200);
        result.setMessage(SUCCESS_MSG);
        result.setSuccess(Boolean.TRUE);
        return result;
    }

    public static <T> Result<T> success(T data)
    {
        Result<T> result = Result.success();
        result.setObj(data);
        result.setSuccess(Boolean.TRUE);
        return result;
    }



    public static <T> Result<T> fail(int code, String msg)
    {
        Result<T> result = new Result<>();
        result.setStatus(code);
        result.setMessage(msg);
        result.setSuccess(Boolean.FALSE);
        return result;
    }

    public static <T> Result<T> fail(String code, String msg)
    {
        return fail(Integer.valueOf(code),msg);
    }

    public static <T> Result<T> fail(int code)
    {
        return Result.fail(code, FAIL_MSG);
    }
    public static <T> Result<T> fail(T data, int code, String message)
    {
        Result<T> result = Result.fail(code, message);
        result.setObj(data);
        return result;
    }

    public static <T> Result<T> failUnkow()
    {
        return Result.fail("9999", "未知错误");
    }
}

