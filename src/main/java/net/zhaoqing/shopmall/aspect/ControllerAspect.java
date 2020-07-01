package net.zhaoqing.shopmall.aspect;

import net.zhaoqing.shopmall.util.AspectUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class ControllerAspect {


    @Around("execution(public * net.zhaoqing.shopmall.controller.*Controller.*(..)))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("[ControllerAspect] around advise start");
        Object o = AspectUtil.logAround(pjp);
        System.out.println("[ControllerAspect] around advise end");
        return o;
    }


//    /**
//     * 定义切入点，切入点为com.example.demo.aop.AopController中的所有函数
//     * 通过@Pointcut注解声明频繁使用的切点表达式
//     */
//    @Pointcut("execution(public * net.zhaoqing.shopmall.controller.*Controller.*(..)))")
//    public void BrokerAspect() {
//
//    }
//
//    /**
//     * @description 在连接点执行之前执行的通知
//     */
//    @Before("BrokerAspect()")
//    public void doBeforeGame() {
//        System.out.println("doBeforeGame！");
//    }
//
//    /**
//     * @description 在连接点执行之后执行的通知（返回通知和异常通知的异常）
//     */
//    @After("BrokerAspect()")
//    public void doAfterGame() {
//        System.out.println("doAfterGame！");
//    }
//
//    /**
//     * @description 在连接点执行之后执行的通知（返回通知）
//     */
//    @AfterReturning("BrokerAspect()")
//    public void doAfterReturningGame() {
//        System.out.println("doAfterReturningGame");
//    }
//
//    /**
//     * @description 在连接点执行之后执行的通知（异常通知）
//     */
//    @AfterThrowing("BrokerAspect()")
//    public void doAfterThrowingGame() {
//        System.out.println("doAfterThrowingGame");
//    }

}