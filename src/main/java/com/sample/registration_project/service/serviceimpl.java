package com.sample.registration_project.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.sample.registration_project.model.userModel;

@Service
public class serviceimpl implements Services{

	private ArrayList<userModel> datalist = new ArrayList<userModel>();
	
	@Override
	public ArrayList<userModel> register(userModel um) {
		um.setId(String.valueOf(datalist.size()+1));
		datalist.add(um);
		return datalist;
	}

}
