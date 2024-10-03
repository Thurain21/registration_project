package com.sample.registration_project.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.registration_project.model.userModel;
import com.sample.registration_project.repository.RegistrationRepository;

@Service
public class serviceimpl implements Services{

	private ArrayList<userModel> datalist = new ArrayList<userModel>();
	
	@Autowired
	private RegistrationRepository repo;
	
	@Override
	public int register(userModel um) {
		
		return repo.register(um);
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
