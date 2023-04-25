package com.newpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newpro.model.Student;
import com.newpro.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService d;
	@GetMapping(value="/fetch")
	public List<Student> getAllValue(){
		List<Student> g=d.getAll();
		return g;
	}
	@PostMapping(value="/post")
	public Student saveFile(@RequestBody Student s)
	{
		return d.saveFile(s);
		
	}
	@PutMapping(value="/put")
	public Student updateFile(@RequestBody Student s)
	{
		
		return d.updateFile(s);
	}
	@DeleteMapping(value="/delete/{x}")
	public void del(@PathVariable("x") Integer regno)
	{
		d.del(regno);
	}

}
