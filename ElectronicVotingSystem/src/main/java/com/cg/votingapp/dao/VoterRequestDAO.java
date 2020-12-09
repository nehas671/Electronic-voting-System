package com.cg.votingapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public interface VoterRequestDAO {

	VoterRequestEntity addVoterRequest(VoterRequestEntity entity);
	VoterRequestEntity checkId(int userId) throws NullValueFoundException;
	VoterRequestEntity checkName(String userName) throws NullValueFoundException;
	VoterRequestEntity viewVoterRequest(int user_id) throws RecordNotFoundException;;
}
