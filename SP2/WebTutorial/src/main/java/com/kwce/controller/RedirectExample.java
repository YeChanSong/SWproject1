package com.kwce.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectExample{
	private static final Logger logger=LoggerFactory.getLogger(RedirectExample.class);
	
	@RequestMapping("/urlD")
	public String doD(RedirectAttributes rttr) {
		logger.info("doD called but redirect to /urlE....");
		rttr.addFlashAttribute("msg","This is the Message!! with redirectd");
		return "redirect:/urlE";
	}
	
	@RequestMapping("/urlE")
	public void doE(@ModelAttribute("msg") String msg) {
		logger.info("doE called....."+msg);
	}
	
	@RequestMapping(value="/urlF",method=RequestMethod.GET)
	public String get(Model model) {
		logger.info("urlF get called....");
		return "GetandPost";
	}
	
	@RequestMapping(value="/urlF", method=RequestMethod.POST)
	public String post(String StudentID, String name) {
		logger.info("urlF post called......");
		System.out.println(StudentID);
		System.out.println(name);
		return "redirect:/";
	}
	
}
