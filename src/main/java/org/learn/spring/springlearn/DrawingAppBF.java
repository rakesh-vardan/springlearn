package org.learn.spring.springlearn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingAppBF {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle(); -- normal way of creating an object
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("springBF.xml")); 
		TriangleBF triangle = (TriangleBF) factory.getBean("triangle");
		triangle.draw();
	}
}
