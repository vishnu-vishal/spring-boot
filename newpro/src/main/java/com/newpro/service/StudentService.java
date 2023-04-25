package com.newpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newpro.model.Student;
import com.newpro.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository c;
	public List<Student> getAll() {
		List<Student> f=c.findAll();
		return f;
	}
	public Student saveFile(Student s)
	{
		Student d=c.save(s);
		return d;
	}
	public Student updateFile(Student s)
	{
		Student d=c.save(s);
		return d;
	}
	public void del(int regno)
	{
		c.deleteById(regno);
	}

}
