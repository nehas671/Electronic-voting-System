package com.cg.votingapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public interface VoterRequestService {

	VoterRequest addVoterRequest(VoterRequest voterRequest );
	VoterRequest checkId(int userId) throws NullValueFoundException;
	VoterRequest checkName(String userName) throws NullValueFoundException;
	VoterRequest viewVoterRequest(int user_id) throws RecordNotFoundException;;
}
