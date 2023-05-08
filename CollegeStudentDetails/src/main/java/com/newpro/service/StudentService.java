package com.newpro.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.newpro.model.Student;
import com.newpro.repository.StudentRepository;

import jakarta.transaction.Transactional;

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

	//sorting
		public List<Student> sortAll(String field)
		{
			return c.findAll(Sort.by(Direction.DESC, field)) ;
		}
		
		//pagination
		public List<Student>pagingStudent(int offset,int  pageSize)
		{
			Page<Student>   obj= c.findAll(PageRequest.of(offset, pageSize));
			return obj.getContent();
		}
		
		//pagination and sorting
		public List<Student> paginate(int offset, int pageSize, String username) 
		{
			Page<Student> obj=c.findAll(PageRequest.of(offset, pageSize,Sort.by(username).ascending()));
			return obj.getContent();
		}
		public List<Student> getCustomersByName(String name,String address)
		  {
			  return c.getCustomersByName(name, address);
		  }

		//DML 
		@Transactional
		public int deleteCustomerByname(String name) {
			return c.deleteCustomersByName(name);
		}
		
		@Transactional
		public int updateCustomerByname(String name,String address) {
			return c.updateCustomersByName(name, address);
		}
}
