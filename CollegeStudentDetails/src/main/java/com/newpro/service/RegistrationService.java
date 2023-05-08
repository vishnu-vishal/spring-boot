package com.newpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newpro.model.Registration;
import com.newpro.repository.RegistrationRepository;
@Service
public class RegistrationService {

	@Autowired
	RegistrationRepository regRep ;

	public Registration saveRegistration(Registration r) {
		return regRep.save(r) ;
		
	}

	public List<Registration> getAllUsers() {
		List<Registration> smList = regRep.findAll() ;
		return smList;
	}
}
