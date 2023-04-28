package com.madmay;

import com.entities.*;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Ctrl {
	@Autowired	
	ServletContext context;
	   @RequestMapping("/home")
	   public String homes(Model m){
		   String str = "home";
		   m.addAttribute("page", str);
		   
		   List<ToDo> list =(List<ToDo>) context.getAttribute("list");
		   m.addAttribute("todos", list);
		   return "home";
	   }
	   
	   @RequestMapping("/add")
	   public String add(Model m) {
		   ToDo t = new ToDo();
		   m.addAttribute("page", "add");
		   m.addAttribute("todo", t);
		   return "home";
	   }
	   
	   @RequestMapping(value="/saveTodo",method=RequestMethod.POST)
	   public String save(@ModelAttribute("todo") ToDo t, Model m) {
		   System.out.println(t);
		   t.setTodoDate(new Date());
		   //get todo list from context
		   List<ToDo> list =(List<ToDo>) context.getAttribute("list");
		   list.add(t);
		   m.addAttribute("msg","Successfully created.....");
		   return "home";
	   }
}
