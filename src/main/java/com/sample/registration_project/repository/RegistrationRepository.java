package com.sample.registration_project.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.sample.registration_project.model.userModel;

@Repository
public class RegistrationRepository {
	
	@Autowired
	private JdbcTemplate temp;
	
	private final String INSERT_QUERY = "INSERT INTO public.students(name, age, gender, country)	VALUES (?, ?, ?, ?)";
	
	public int register(userModel ud) {
		return temp.update(INSERT_QUERY, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, ud.getName());
				ps.setInt(2, ud.getAge());
				ps.setString(3, ud.getGender());
				ps.setString(4, ud.getCountry());
				
			}
		});
	}
}
