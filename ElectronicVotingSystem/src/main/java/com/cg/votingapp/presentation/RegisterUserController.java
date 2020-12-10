package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.entity.RegisterUser;
import com.cg.votingapp.exceptions.InsertQueryException;
import com.cg.votingapp.service.RegisterUserService;
import com.cg.votingapp.service.RegisterUserServiceImpl;

public class RegisterUserController {
	

	private static Logger logger = LogManager.getLogger(RegisterUserController.class.getName());
	RegisterUserService userService = new RegisterUserServiceImpl();
	
	public void addUser(RegisterUser entity ) throws  InsertQueryException { 
		logger.info("Adding user: " + entity.getName());
		 
		try {
			userService.addUser(entity);
		}
		catch(InsertQueryException e) {
			logger.error("InsertQueryException: " + e);
			throw new InsertQueryException(e.getMessage());
		}
		
		
		
	}

}
