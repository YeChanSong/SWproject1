package com.kwce.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kwce.domain.ExampleVO;

@Controller
public class ControllerExample{
	private static final Logger logger = LoggerFactory.getLogger(ControllerExample.class);
	
	@RequestMapping("/urlA")
	public String doA(@ModelAttribute("msg") String msg) {
		msg="urlA Test";
		logger.info("urlA called......"+msg);
		return "resultA";
	}
	
	@RequestMapping("/urlB")
	public String doB(Model model) {
		logger.info("urlB called....");
		ExampleVO ex = new ExampleVO("TEST",5);
		model.addAttribute(ex);
		return "resultB";
	}	
	@RequestMapping("/urlC")
	public String doC(Model model) {
		logger.info("urlC called....");
		String msg2="urlC Test";
		model.addAttribute("msg",msg2);
		return "resultC";
	}
	
	
	
}
