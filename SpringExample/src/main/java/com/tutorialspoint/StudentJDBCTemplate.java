package com.tutorialspoint;

import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class StudentJDBCTemplate implements StudentDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void create(int id, String name, Integer age) {

		String SQL = "insert into Student (id,name,age) values ( " + id + ",'"
				+ name + "','" + age + "')";
		jdbcTemplateObject.update(SQL);
		System.out.println("Created Record Name = " + name + " Age = " + age);

		int id1 = 123;
		String name1 = "kala";
		Integer age1 = 12;
		String SQL1 = "insert into Student (id,name,age) values ( " + id1
				+ ",'" + name1 + "','" + age1 + "')";
		jdbcTemplateObject.update(SQL1);
		System.out.println("Created Record Name = " + name + " Age = " + age);

		if (false)
			throw new RuntimeException("## Runtime exception ###");

		return;
	}
//	public Student getStudent(int id)
//	{
//		SqlRowSet queryForRowSet = jdbcTemplateObject.queryForRowSet("select * from student where id="+id);
//		System.out.println(queryForRowSet);
//		return null; 
//	}

	public Student getStudent(Integer id) {
		String SQL = "select id,name,age from Student where id = ? for update";
		Student student = (Student) jdbcTemplateObject.queryForObject(SQL,new Object[]{id}, new StudentMapper());
		return student;
	}

	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List<Student> students = (List<Student>) jdbcTemplateObject.query(SQL,
				new StudentMapper());
		return students;
	}

	public void delete(Integer id) {
		String SQL = "delete from Student where id = ?";
		// jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}

	public void update(Integer id, Integer age) {
		String SQL = "update Student set age = ? where id = ?";
		// jdbcTemplateObject.update(SQL, age, id);
		System.out.println("Updated Record with ID = " + id);
		return;
	}

}