package com.work.leavemanagement.aspect;

import com.work.leavemanagement.entities.Employee;
import com.work.leavemanagement.response.EmployeeResponse;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("within(com.work.leavemanagement.controllers.*)")
    public void forControllers(){}

    @Pointcut("within(com.work.leavemanagement.services.*)")
    public void forServices(){}

    @Before("forControllers() || forServices()")
    public void startingLog(JoinPoint joinPoint){
        String controllerName = joinPoint.getSignature().getDeclaringType().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.out.println("----- " + controllerName + "  @" + methodName + " -- START" );

        if(joinPoint.getArgs().length > 0){
            System.out.println("=> Parameter");
            for (int i=0; i<joinPoint.getArgs().length; i++){
                System.out.println(joinPoint.getArgs()[i].toString());
            }
        }
    }

    @After("forControllers() || forServices()")
    public void endingLog(JoinPoint joinPoint){
        String controllerName = joinPoint.getSignature().getDeclaringType().getSimpleName();
        String methodName = joinPoint.getSignature().getName();

        System.out.println("----- " + controllerName + "  @" + methodName + " -- END" );
    }

//    @Before("within(com.work.leavemanagement.controllers.*) || args(Long)")
//    public void test(JoinPoint joinPoint, Long id){
//        System.out.println("testtttttttttttt.....");
//    }

    @AfterReturning(pointcut = "forControllers() || forServices()", returning = "returning")
    public void returningValues(Object returning){
        System.out.println("=> Returning value");

        if(returning instanceof EmployeeResponse)
            System.out.println(((EmployeeResponse) returning).getName());
    }

    @AfterThrowing(pointcut = "forControllers() || forServices()", throwing = "ex")
    public void throwingException(Exception ex){
        System.out.println("*****************************\n\n");
        System.out.println("=> Exception ");
        System.out.println(ex.getMessage());
        System.out.println("\n\n*********************************");

    }
}
