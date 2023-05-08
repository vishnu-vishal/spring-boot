package com.newpro.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.newpro.model.User;
@Repository
public interface UserRepository extends JpaRepository <User,Integer> {

	User findByusername(String uname);



}
