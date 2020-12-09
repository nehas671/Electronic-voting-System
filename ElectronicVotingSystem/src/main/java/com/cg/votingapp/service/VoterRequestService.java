package com.cg.votingapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.entity.VoterRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public interface VoterRequestService {

	VoterRequest addVoterRequest(VoterRequest voterRequest );
	VoterRequest checkById(int userId) throws NullValueFoundException;
	VoterRequest checkByName(String userName) throws NullValueFoundException;
	VoterRequest viewVoterRequest(int user_id) throws RecordNotFoundException;;
}
