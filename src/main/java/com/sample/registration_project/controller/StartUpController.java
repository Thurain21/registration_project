package com.sample.registration_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sample.registration_project.model.userModel;

@Controller
public class StartUpController {

	@RequestMapping(value="/registration",method=RequestMethod.GET)
	public ModelAndView register() {
		userModel um = new userModel(null,null,0,null,null);
		ModelAndView model = new ModelAndView();
		model.addObject(um);
		model.setViewName("registration");
		return model;
	}
}
