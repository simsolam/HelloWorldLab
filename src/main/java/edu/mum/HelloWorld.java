package edu.mum;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.mum.component.MessageDisplay;

public class HelloWorld {
    public static void main(String[] args) {
   	 ApplicationContext applicationContext = new AnnotationConfigApplicationContext( JavaConfiguration.class );
 
    	MessageDisplay messageDisplay = (MessageDisplay) applicationContext.getBean("standardOutMessageDisplay");
		MessageDisplay messageDisplay1 = (MessageDisplay) applicationContext.getBean("fileMessageDisplay");
          try {
			messageDisplay.display();
			messageDisplay1.display();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
