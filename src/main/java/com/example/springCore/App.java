package com.example.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Context working fine");
        User user1 = (User)context.getBean("user1");

        System.out.println(user1);
        User user2 = (User)context.getBean("user2");
        System.out.println(user2);
    }
}
