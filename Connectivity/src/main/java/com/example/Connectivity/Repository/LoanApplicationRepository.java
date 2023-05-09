package com.example.Connectivity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Connectivity.model.LoanApplicationModel;



@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplicationModel, Integer>{

}

