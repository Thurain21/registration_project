package com.sample.registration_project.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.sample.registration_project.model.userModel;

@Service
public class serviceimpl implements Services{

	private ArrayList<userModel> datalist = new ArrayList<userModel>();
	
	@Override
	public ArrayList<userModel> register(userModel um) {
		um.setId(String.valueOf(datalist.size()));
		datalist.add(um);
		return datalist;
	}

	@Override
	public ArrayList<userModel> delete(String id) {
		datalist.remove(Integer.parseInt(id));
		return datalist;
	}

	@Override
	public userModel updatedata(String id) {
		userModel um = datalist.get(Integer.parseInt(id));
		return um;
	}

	@Override
	public ArrayList<userModel> datachange(userModel um) {
		datalist.set(Integer.parseInt(um.getId()), um);
		return datalist;
	}

}
