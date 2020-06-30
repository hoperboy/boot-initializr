package net.zhaoqing.shopmall.util;

import org.aspectj.lang.ProceedingJoinPoint;

public class AspectUtil {
    public static Object logAround(ProceedingJoinPoint pjp) throws  Throwable
    {
        return pjp.proceed();
    }
}
