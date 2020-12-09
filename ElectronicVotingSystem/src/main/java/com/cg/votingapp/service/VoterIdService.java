package com.cg.votingapp.service;

import com.cg.votingapp.dto.VoterId;
import com.cg.votingapp.exceptions.*;

public interface VoterIdService {
	VoterId findByUserId(int user_id) throws UserNotFoundException;
	VoterId findByReqId(int request_id)throws ReqNotFoundException;
}
