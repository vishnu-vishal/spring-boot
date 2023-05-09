package com.example.Connectivity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Connectivity.model.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel, Integer> {

}
