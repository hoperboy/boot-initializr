package net.zhaoqing.shopmall.aspect;

import net.zhaoqing.shopmall.util.AspectUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DaoAspect {

    @Around("execution(public * net.zhaoqing.shopmall.dao.mybatisplus.*Mapper.*(..)))")
    public Object around(ProceedingJoinPoint pjp) throws  Throwable{
        System.out.println("[DaoAspect] around advise start");
        Object o = AspectUtil.logAround(pjp);
        System.out.println("[DaoAspect] around advise end");

        return o;
    }

}
