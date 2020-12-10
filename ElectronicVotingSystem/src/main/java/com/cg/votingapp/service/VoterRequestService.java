package com.cg.votingapp.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.dto.VoterRequest;
import com.cg.votingapp.entity.VoterIdEntity;
import com.cg.votingapp.entity.VoterRequestEntity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public interface VoterRequestService {

	VoterRequest addVoterRequest(VoterRequest entity );
	VoterRequestEntity viewVoterRequest(int user_id) throws RecordNotFoundException;
	VoterRequestEntity approveVoterRequest(int userId)throws NullValueFoundException;
}
