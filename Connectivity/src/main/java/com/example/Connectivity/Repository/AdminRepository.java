package com.example.Connectivity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Connectivity.model.AdminModel;

public interface AdminRepository extends JpaRepository<AdminModel, Integer> {

}
