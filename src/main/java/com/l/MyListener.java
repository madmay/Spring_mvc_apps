package com.l;

import com.entities.*;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context created....");
		List<ToDo> list = new ArrayList<ToDo>();
		ServletContext context = sce.getServletContext();
		context.setAttribute("list",list);
		
	}
	
}
