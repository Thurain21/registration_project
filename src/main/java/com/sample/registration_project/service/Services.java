package com.sample.registration_project.service;

import java.util.ArrayList;

import com.sample.registration_project.model.userModel;

public interface Services {

	public ArrayList<userModel> register(userModel um);
	public ArrayList<userModel> delete(String id);
	public userModel updatedata(String id);
	public ArrayList<userModel> datachange(userModel um);
}
