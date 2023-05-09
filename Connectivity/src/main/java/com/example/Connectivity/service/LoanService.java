package com.example.Connectivity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Connectivity.Repository.AdminRepository;
import com.example.Connectivity.Repository.LoanApplicationRepository;
import com.example.Connectivity.Repository.LoginRepository;
import com.example.Connectivity.Repository.UserRepository;
import com.example.Connectivity.model.AdminModel;
import com.example.Connectivity.model.LoanApplicationModel;
import com.example.Connectivity.model.LoginModel;
import com.example.Connectivity.model.UserModel;

@Service
public class LoanService {
	@Autowired
	public UserRepository urep;
	public List <UserModel> getInfo()
	{
		return urep.findAll();
	}
	public UserModel saveInfo(UserModel ob)
	{
		return urep.save(ob);
	}
	public UserModel UpdateInfo(UserModel io)
	{
		return urep.saveAndFlush(io);
	}
	public void deleteInfo(int id)
	{
		urep.deleteById(id);
	}
	
	//login
	@Autowired
	public LoginRepository lrep;
	public void saveLogin(LoginModel o)
	{
		lrep.save(o);
	}
	public List <LoginModel> getLogin()
	{
		return lrep.findAll();
	}
	public LoginModel UpdateLogin(LoginModel i)
	{
		return lrep.saveAndFlush(i);
	}
	public void deleteLogin(String email)
	{
		lrep.deleteAll();
	}
	
	//admin
	@Autowired
	public AdminRepository arep;
	public AdminModel saveAdmin(AdminModel ab)
	{
		return arep.save(ab);
	}
	public List <AdminModel> getAdmin()
	{
		return arep.findAll();
	}
	public AdminModel UpdateAdmin(AdminModel oi)
	{
		return arep.saveAndFlush(oi);
	}
	public void deleteAdmin(String email)
	{
		lrep.deleteAll();
	}
	//loan
	@Autowired
	public LoanApplicationRepository lorep;
	public LoanApplicationModel saveLoan(LoanApplicationModel lm)
	{
		return lorep.save(lm);
	}
	public List <LoanApplicationModel> getLoan()
	{
		return lorep.findAll();
	}
	public LoanApplicationModel UpdateLoan(LoanApplicationModel i)
	{
		return lorep.saveAndFlush(i);
	}
	public void deleteLoan(int loanId)
	{
		lorep.deleteAll();
	}

}
