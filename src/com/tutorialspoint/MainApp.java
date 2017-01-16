package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      HelloInterface obj = (HelloInterface) context.getBean("helloWorld");

      obj.setMessage("Hello singleton");
      obj.getMessage();
      
      HelloInterface obj2 = (HelloInterface) context.getBean("helloWorld");
      
      obj2.getMessage();
   }
}