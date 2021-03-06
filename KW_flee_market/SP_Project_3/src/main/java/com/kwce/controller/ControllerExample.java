package com.kwce.controller;
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kwce.domain.ExampleVO;


@Controller
public class ControllerExample {
	
	private static final Logger Logger = LoggerFactory.getLogger(ControllerExample.class);
	
	@RequestMapping("/controller/urlA")
	public String doA( @ModelAttribute("msg") String msg) {
		msg=" urlA Test";
		Logger.info("urlA Called...." + msg);
		return "resultA";
	}
	
	@RequestMapping("/controller/urlB")
	public String doB(Model model) {
		Logger.info("urlB Called....");
		ExampleVO ex= new ExampleVO("TEST",5);
		model.addAttribute(ex);
		return "resultB";
	}	
	
	@RequestMapping("/controller/urlC")
	public String doC(Model model) {
		Logger.info("urlC Called....");
		String msg2="urlC Test";
		model.addAttribute("msg", msg2);
		return "resultC";
	}		
	
	
	@RequestMapping(value = "/controller/urlF", method = RequestMethod.GET)
	public String get(Model model) {
		Logger.info("urlF get Called....");
		return "GetandPost";
	}		
	
	@RequestMapping(value = "/controller/urlF", method = RequestMethod.POST)
	public String post(String StudentID, String name) {
		Logger.info("urlF post Called....");		
		System.out.println(StudentID);
		System.out.println(name);

		return "redirect:/";
	}	
	

	
	@RequestMapping(value="/controller/exec_jstl", method=RequestMethod.GET)
	public String jstl(RedirectAttributes rttr) throws Exception{
	
		Logger.info("remove page post....");
		rttr.addFlashAttribute("msg","SUCCESS");
		return "exec_jstl"; 
	}
	
	
	
	
	
	
}
