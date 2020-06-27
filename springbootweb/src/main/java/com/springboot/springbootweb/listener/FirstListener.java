package com.springboot.springbootweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author tianq
 */
@WebListener
public class FirstListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent){

    }
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent){
        System.out.println("Listener...Init.....");
    }
}
