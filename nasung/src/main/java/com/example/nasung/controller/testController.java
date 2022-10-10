package com.example.nasung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import com.example.nasung.service.TestService;
import com.example.nasung.vo.TestVo;

@Controller
public class testController {

	 @RequestMapping("/a")
	 public String index(Model model) {
 		model.addAttribute("message", "좋은 아침1");
 		return "index1";
	 }
	 
	 @RequestMapping("/b")
	 public String index2(Model model) {
 		model.addAttribute("message", "좋은 아침2");
 		return "index2";
	 }
	 
	 @Autowired
	 TestService testService;

	 @RequestMapping(value = "/mtest")
	 public ModelAndView test() throws Exception{
	     ModelAndView mav = new ModelAndView("mybatisTest");

	     List<TestVo> testList = testService.selectTest();
	     mav.addObject("list", testList);

	     return mav;
	 }
}