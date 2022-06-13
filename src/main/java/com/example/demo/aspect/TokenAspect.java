package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author qtx
 * @date 2022/6/13 20:35
 */
@Aspect
@Component
public class TokenAspect {

    @Pointcut("execution(* com.example.demo.controller.*.*(..))")
    public void allController() {}

    @Pointcut("execution(* com.example.demo.controller.test3.test(..)))")
    public void login() {}

    /** 切面+排除指定某个方法 */
    @Before("allController()&&!login()")
    public void tokenBefore() {}
}
