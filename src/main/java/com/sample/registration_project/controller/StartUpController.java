package com.sample.registration_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sample.registration_project.model.userModel;
import com.sample.registration_project.service.serviceimpl;

@Controller
public class StartUpController {

	@Autowired
	serviceimpl sip ;
	
	@RequestMapping(value="/registration",method=RequestMethod.GET)
	public ModelAndView register() {
		List<userModel> datalist  = sip.selectData();
		ModelAndView model = new ModelAndView();
		model.addObject("datalist",datalist);
		model.setViewName("registration");
		return model;
	}
}
