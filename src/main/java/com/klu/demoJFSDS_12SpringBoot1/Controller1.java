package com.klu.demoJFSDS_12SpringBoot1;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller1 
{
	@GetMapping("/demo1")
	public String method1() {
		return "demo1";
	}
	@GetMapping("/demo2")
	public String method2() {
		return "form";
	}
	@GetMapping("/details")
	public String method3(@RequestParam("name") String name, @RequestParam("mobile") String mobile, Model model){
		model.addAllAttributes(Map.of("name", name, "mobile", mobile));
		return "details";
	}
	@GetMapping("/input/{name}")
	public String method4(@PathVariable("name") String name, Model model)
	{
		model.addAttribute("name", name);
		return "input";
	}
}
