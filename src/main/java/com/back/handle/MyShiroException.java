package com.back.handle;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouwenquan
 * @date 2020/7/23 13:42
 * description 自定义异常
 */
@ControllerAdvice
public class MyShiroException {

    /**
     * 处理Shiro权限拦截异常
     * 如果返回JSON数据格式请加上 @ResponseBody注解
     *
     * @Author Sans
     * @CreateTime 2019/6/15 13:35
     * @Return Map<Object> 返回结果集
     */
    @ResponseBody
    @ExceptionHandler(value = AuthorizationException.class)
    public Map<String, Object> defaultErrorHandler() {
        Map<String, Object> map = new HashMap<>();
        map.put("403", "权限不足");
        return map;
    }

}
