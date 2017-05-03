package spring.beanfactory.lchawla.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring2.xml"});
		BeanFactory factory = context;
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
		}

}
