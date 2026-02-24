package com.spring.Spring_JDBC_DATASOURCE;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDaoImpl implements StudentDao{
	
	 private JdbcTemplate jdbcTemplate;

	    // Setter injection
	    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;
	    }

	    @Override
	    public void insert(Student s) {
	        String sql = "insert into student values (?,?)";
	        jdbcTemplate.update(sql, s.getSid(), s.getSname());
	        System.out.println("Inserted Successfully");
	    }

	    @Override
	    public Student get() {
	    	String sql = "select * from student limit 1";
	    	return jdbcTemplate.query(sql, rs -> {
	    	    if (rs.next()) {
	    	        Student s = new Student();
	    	        s.setSid(rs.getInt("sid"));
	    	        s.setSname(rs.getString("sname"));
	    	        return s;
	    	    }
	    	    return null;
	    	});
	    }

	    @Override
	    public void update(Student s) {
	        String sql = "update student set sname=? where sid=?";
	        jdbcTemplate.update(sql, s.getSname(), s.getSid());
	        System.out.println("Updated Successfully");
	    }

	    @Override
	    public void delete() {
	        String sql = "delete from student";
	        jdbcTemplate.update(sql);
	        System.out.println("Deleted Successfully");
	    }
}
