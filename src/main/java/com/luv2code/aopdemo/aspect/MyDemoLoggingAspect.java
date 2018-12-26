package com.luv2code.aopdemo.aspect;

import com.luv2code.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

	@Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
        MethodSignature methodSig = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method: " + methodSig);
		System.out.println("Day la method ko get set");
//		get args Lay nhieu tham so
        Object[] args = joinPoint.getArgs();
        for (Object tempArg : args) {
            System.out.println(tempArg);
            if (tempArg instanceof Account) {
                Account theAccount = (Account) tempArg;
                System.out.println(" Account name: " + theAccount.getName());
                System.out.println("Account level: " + theAccount.getLevel());
            }
        }

	}





}










