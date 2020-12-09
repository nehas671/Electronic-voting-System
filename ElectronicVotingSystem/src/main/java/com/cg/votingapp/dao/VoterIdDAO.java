package com.cg.votingapp.dao;

import com.cg.votingapp.exceptions.ReqNotFoundException;
import com.cg.votingapp.entity.VoterIdEntity;

import com.cg.votingapp.exceptions.UserNotFoundException;

public interface VoterIdDAO {
	VoterIdEntity findByUserId(int user_id) throws UserNotFoundException;
	VoterIdEntity findByReqId(int request_id) throws ReqNotFoundException;
}

