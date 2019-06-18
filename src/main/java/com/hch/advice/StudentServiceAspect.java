package com.hch.advice;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class StudentServiceAspect {

    public void doBefore(JoinPoint jp){
        System.out.println("类名:"+jp.getTarget().getClass().getName());
        System.out.println("方法名:"+jp.getSignature().getName());
//        System.out.println("开始添加学生:"+jp.getArgs()[0]);
    }

    public void doAfter(JoinPoint jp){
        System.out.println("类名:"+jp.getTarget().getClass().getName());
        System.out.println("方法名:"+jp.getSignature().getName());
//        System.out.println("添加学生结束:"+jp.getArgs()[0]);
    }

    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        //定义调用前通知
        System.out.println("环绕通知前。。。");
        Object retVal=pjp.proceed();//相当调用业务，retVal就是切点执行返回的值
        //定义调用后通知
        System.out.println("环绕通知后。。。");
        return retVal;
    }

    public void doAfterReturning(JoinPoint jp){
        System.out.println("返回通知");
    }

    public void doAfterThrow(JoinPoint jp,Throwable ex){
        System.out.println("异常通知");
        System.out.println("异常信息："+ex.getMessage());
    }
}
