package com.sample.registration_project.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sample.registration_project.model.userModel;

@Repository
public class RegistrationRepository {

	@Autowired
	private JdbcTemplate temp;

	private static final String INSERT_QUERY = "INSERT INTO public.students(name, age, gender, country)	VALUES (?, ?, ?, ?)";
	private static final String SELECT_ALL_QUERY = "SELECT name, age, gender, country, id FROM public.students";

	public int register(userModel um) {
		return temp.update(INSERT_QUERY, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, um.getName());
				ps.setInt(2, um.getAge());
				ps.setString(3, um.getGender());
				ps.setString(4, um.getCountry());

			}
		});
	}

	public List<userModel> selectData() {
		return temp.query(SELECT_ALL_QUERY, new RowMapper<userModel>() {

			@Override
			public userModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new userModel (rs.getString("id"),rs.getString("name"),rs.getInt("age"),rs.getString("gender"), rs.getString("country"));
			}
		});
	}

}
