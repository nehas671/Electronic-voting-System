package com.cg.votingapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import com.cg.votingapp.entity.VoterIdEntity;
import com.cg.votingapp.entity.VoterRequestEntity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public interface VoterRequestDAO {

	VoterRequestEntity addVoterRequest(VoterRequestEntity entity);
	VoterRequestEntity checkById(int userId) throws NullValueFoundException;
	VoterRequestEntity checkByName(String userName) throws NullValueFoundException;
	VoterRequestEntity viewVoterRequest(int user_id) throws RecordNotFoundException;;
}
