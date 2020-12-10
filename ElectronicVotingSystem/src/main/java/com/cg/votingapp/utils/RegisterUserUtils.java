package com.cg.votingapp.utils;

import com.cg.votingapp.dto.Register_user;
import com.cg.votingapp.entity.RegisterUser;

public class RegisterUserUtils {
	
	public static RegisterUser convertRegister_userIntoRegisteruser(Register_user register_user) {
		return new RegisterUser(register_user.getApplication_id(), register_user.getName(), register_user.getDob(), register_user.getGender(), register_user.getMobile_number(), register_user.getAddress(), register_user.getDistrict());
	}
	public static Register_user convertRegisterUserIntoRegister_user(RegisterUser registeruser) {
		return new Register_user(registeruser.getApplication_id(), registeruser.getName(), registeruser.getDob(), registeruser.getGender(), registeruser.getMobile_number(), registeruser.getAddress(), registeruser.getDistrict());
	}
	

}
