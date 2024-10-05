package com.sample.registration_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.registration_project.model.userModel;
import com.sample.registration_project.repository.RegistrationRepository;

@Service
public class serviceimpl implements Services{
	
	@Autowired
	private RegistrationRepository repo;
	
	@Override
	public int register(userModel um) {
		
		return repo.register(um);
	}

	@Override
	public List<userModel> selectData() {
		repo.selectData();
		return null;
	}

}
