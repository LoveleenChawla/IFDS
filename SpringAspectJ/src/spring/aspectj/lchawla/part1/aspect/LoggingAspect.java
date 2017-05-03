package spring.aspectj.lchawla.part1.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
/*	@Before("execution(public String getName())")
	public void loggingAdvice() {
		System.out.println("logging Advice method of LoggingAspect is called");
	}
	@Before("execution(public String spring.aspectj.lchawla.part1.model.Circle.getName())")
	public void loggingAdvice() {
		System.out.println("logging Advice method of LoggingAspect is called");
	}
*/
//	@Before("execution(public * get*())")
//	public void loggingAdvice() {
//		System.out.println("logging Advice method of LoggingAspect is called");
//	}
/*	@Before("execution(public * get*(*))")
	public void loggingAdvice() {
		System.out.println("logging Advice method of LoggingAspect is called");
	}
*/
//	@Before("execution(public * get*(..))")
//	public void loggingAdvice() {
//		System.out.println("logging Advice method of LoggingAspect is called");
//	}

/*	@Before("allGetters()")
	public void loggingAdvice() {
		System.out.println("logging Advice method of LoggingAspect is called");
	}
	@Before("allGetters()")
	public void loggingSecondAdvice() {
		System.out.println("logging Second Advice method of LoggingAspect is called");
	}
	@Pointcut("execution(public * get*(..))")
	public void allGetters() {
	}
*/
 	@Pointcut("within(string.aspectj.lchawla.part1.model.*)")
	public void loggingAdviceForPackage() {
	}
}
