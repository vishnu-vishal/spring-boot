package com.newpro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.newpro.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	 //	positional parameter
	@Query("select s from Student s where s.name=?1 and s.address=?2" )
	public List<Student> getCustomersByName(String name,String address);
	
	//named parameter+
	@Query("select s from Student s where s.name=:name")
	public List<Student> getCustomersByName(String name);
	
	//DML
	@Modifying
	@Query("delete from Student s where s.name=?1")
	public int deleteCustomersByName(String name);
	
	@Modifying
	@Query("update Student s set s.name=?1 where s.address=?2")
	public int updateCustomersByName(String name,String address);
	
	//MySql Query
	@Query(value="select * from Student s where s.name=?1",nativeQuery=true)
	public List<Student> fetchStudentsByName(String name);
	

	

}
