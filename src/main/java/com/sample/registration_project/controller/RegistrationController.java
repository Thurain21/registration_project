package com.sample.registration_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sample.registration_project.model.userModel;
import com.sample.registration_project.service.serviceimpl;

@Controller
public class RegistrationController {

	@Autowired
	serviceimpl sip ;
	
	@RequestMapping(value="/dataRegister",method=RequestMethod.GET)
	public ModelAndView dataRegister(@ModelAttribute userModel um) {		
		int result = sip.register(um);
		ModelAndView model = new ModelAndView();
		model.addObject("result",result);
		model.setViewName("redirecte:/registration");
		return model;
	}
	
}
