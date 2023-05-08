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
	
	@GetMapping("/sortStudent/{field}")
	public List<Student> sortStudent(@PathVariable String field)
	{
		return d.sortAll(field);
	}
	
	//pagination
	@GetMapping(value="/pageStudents/{field}/{size}")
	public List<Student> pagingBillboard(@PathVariable("field") int offset,@PathVariable("size") int  pageSize)
	
	{
	 return d.pagingStudent(offset, pageSize);	
	}
	
	//pagination and sorting
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<Student> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)
	{
		return d.paginate(num,size,name);
		
	}
	@GetMapping("/fetchCustomersByArea/{name}/{address}")
	 public List<Student> fetchCustomersByArea(@PathVariable String name,@PathVariable String address)
	 {
	 	return d.getCustomersByName(name, address);
	 }
	 @DeleteMapping("/deleteCustomerByName/{name}")
	 public String deleteCustomerByName(@PathVariable String name) {
		 int result=d.deleteCustomerByname(name);
		 if(result>0)
			 return "Customer record deleted";
		 else
			 return "Problem occured while deleting";
	 }
	 
	 @PutMapping("/updateCustomerByName/{name}/{address}")
	 public String updateCustomerByName(@PathVariable String name,@PathVariable String address) {
		 int result=d.updateCustomerByname(name,address);
		 if(result>0)
			 return "Customer record updated";
		 else
			 return "Problem occured while updating";

}
}
