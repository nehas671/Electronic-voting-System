package com.cg.votingapp.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dao.RegisterUserDAO;
import com.cg.votingapp.dao.RegisterUserDAOImpl;
import com.cg.votingapp.entity.RegisterUser;
import com.cg.votingapp.exceptions.InsertQueryException;

public class RegisterUserServiceImpl implements RegisterUserService {
	
	private static Logger logger = LogManager.getLogger(RegisterUserServiceImpl.class.getName());
	
	RegisterUserDAO registeruserDAO = new RegisterUserDAOImpl();
	
	public void addUser(RegisterUser entity) throws InsertQueryException {
		
		logger.info("Adding User..");
		registeruserDAO.addUser(entity);
		
		
	}
}
