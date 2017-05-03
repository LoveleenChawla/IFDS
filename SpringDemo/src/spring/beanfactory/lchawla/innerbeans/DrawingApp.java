package spring.beanfactory.lchawla.innerbeans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springinnerbeans.xml"});
		BeanFactory factory = context;
		Triangle triangle = (Triangle) factory.getBean("trianglealias");
		triangle.draw();
		}

}
