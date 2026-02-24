package com.spring.Spring_JDBC_DATASOURCE;

public interface StudentDao{
	
	void insert(Student s);
	Student get();
	void update(Student s);
	void delete();
}