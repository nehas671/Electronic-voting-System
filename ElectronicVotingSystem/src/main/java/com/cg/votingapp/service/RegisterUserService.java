package com.cg.votingapp.service;

import com.cg.votingapp.entity.RegisterUser;
import com.cg.votingapp.exceptions.InsertQueryException;

public interface RegisterUserService {
	void addUser(RegisterUser entity) throws InsertQueryException;

}
