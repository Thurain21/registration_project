package com.sample.registration_project.service;

import java.util.ArrayList;
import java.util.List;

import com.sample.registration_project.model.userModel;

public interface Services {

	public int register(userModel um);
	public List<userModel> delete(String id);
	public userModel updatedata(String id);
	public ArrayList<userModel> datachange(userModel um);
}
