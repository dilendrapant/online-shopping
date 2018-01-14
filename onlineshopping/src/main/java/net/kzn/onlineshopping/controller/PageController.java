package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to new spring mvc page !!!!!!!");
		return mv;
	}
	
	@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam (value="greeting",required=false) String gt){
		
		if(gt==null){
			gt="Hello There !!!!";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", gt);
		return mv;
	}
	
	
	@RequestMapping(value="/test1/{greeting}")
	public ModelAndView test1(@PathVariable (value="greeting",required=false) String gt){
		
		if(gt==null){
			gt="Hello There !!!!";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", gt);
		return mv;
	}
}
