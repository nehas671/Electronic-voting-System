package com.cg.votingapp.presentation;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.votingapp.entity.RegisterUser;
import com.cg.votingapp.exceptions.InsertQueryException;

public class RegisterUserControllerTest {
	
private static RegisterUserController registeruserController;
	
	private static Logger logger;
	
	@BeforeClass
	public static void setUp() {
		logger = LogManager.getLogger(RegisterUserControllerTest.class.getName());
		registeruserController = new RegisterUserController();
}
	
	/*----add RegisterUser = Success----*/
	@Test
	public void addElectionSuccess() throws  InsertQueryException{
		logger.info("[START] addRegisterUserSuccess()");
		
		RegisterUser r1 = new RegisterUser(1,"rahul",01/02/95,"male",2020306050,"civil line karanja","washim");
		RegisterUser r2 = new RegisterUser(9,"meena",03/06/93 ,"female",1160306062,"main line akola","akola");
	
		Set<RegisterUser> users = new HashSet<RegisterUser>();
		users.add(r1);
		users.add(r2);
		
		
		logger.info("[END] addRegisterUserSuccess()");
		
}
}
