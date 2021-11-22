package com.ankit.SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung samsung=applicationContext.getBean(Samsung.class);
        samsung.config();
    }
}
