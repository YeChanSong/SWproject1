package com.kwce.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class RedirectExample {
	public static final Logger Logger = LoggerFactory.getLogger(RedirectExample.class);
	
	@RequestMapping("/controller/urlD")
	public String doD(RedirectAttributes rttr) {
		
		Logger.info("doD called but redirect to /urlE......");
		rttr.addFlashAttribute("msg", "This is the Message !! with redirectd");
		return "redirect:/controller/urlE";
		
	}
	
	@RequestMapping("/controller/urlE")
	public void doE(@ModelAttribute("msg") String msg) {
		Logger.info("doE called......" + msg);
		
	}
	
	
}
