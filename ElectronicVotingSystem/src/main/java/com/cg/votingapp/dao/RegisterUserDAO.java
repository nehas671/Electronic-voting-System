package com.cg.votingapp.dao;

import com.cg.votingapp.entity.RegisterUser;
import com.cg.votingapp.exceptions.InsertQueryException;

public interface RegisterUserDAO {
	public void addUser(RegisterUser entity) throws InsertQueryException;

}
