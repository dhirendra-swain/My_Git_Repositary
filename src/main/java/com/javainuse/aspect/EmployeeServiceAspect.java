package com.javainuse.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceAspect.class);
	@Before(value = "execution(* com.javainuse.service.EmployeeService.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		
		System.out.println("Before method::::::::::::::" + joinPoint.getSignature());
		LOGGER.info("===================================================================");
		

		//System.out.println("Creating Employee with name - " + name + " and id - " + empId);
	}

//	@After(value = "execution(* com.javainuse.service.EmployeeService.*(..)) and args(name,empId)")
//	public void afterAdvice(JoinPoint joinPoint, String name, String empId) {
//		System.out.println("After method::::::::::::::::" + joinPoint.getSignature());
//
//		System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
//	}
}
