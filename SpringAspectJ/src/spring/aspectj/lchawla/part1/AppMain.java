package spring.aspectj.lchawla.part1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aspectj.lchawla.part1.service.ShapeService;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springaoppart1.xml"});
		BeanFactory factory = context;
		ShapeService shapeService = (ShapeService)factory.getBean("shapeService");
		System.out.println(shapeService.getCircle().getName());
		System.out.println(shapeService.getTriangle().getName());
	}

}
