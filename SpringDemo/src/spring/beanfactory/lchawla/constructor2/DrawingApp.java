package spring.beanfactory.lchawla.constructor2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring3.xml"});
		BeanFactory factory = context;
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
		}

}
