package com.tutorialspoint;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper {
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		return student;
	}
}

class ResultSetExtractorTest implements ResultSetExtractor {

	@Override
	public Object extractData(ResultSet rs) throws SQLException,
			DataAccessException {
		int row = rs.getRow();
		List<Student> list = new ArrayList<Student>();
		for (int i = 0; i < row; i++) {
			Student student = new Student();
			student.setId(rs.getInt("id"));
			student.setName(rs.getString("name"));
			student.setAge(rs.getInt("age"));
			list.add(student);
		}

		return list;
	}

}