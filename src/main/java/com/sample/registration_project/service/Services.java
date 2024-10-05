package com.sample.registration_project.service;

import java.util.List;

import com.sample.registration_project.model.userModel;

public interface Services {

	public int register(userModel um);
	public List<userModel> selectData();
}
