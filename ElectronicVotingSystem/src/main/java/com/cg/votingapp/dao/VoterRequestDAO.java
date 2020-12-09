package com.cg.votingapp.dao;

public interface VoterRequestDAO {

	VoterRequestEntity addVoterRequest(VoterRequestEntity entity);
	VoterRequestEntity checkId(int userId) throws NullValueFoundException;
	VoterRequestEntity checkName(String userName) throws NullValueFoundException;
	VoterRequestEntity viewVoterRequest(int user_id) throws RecordNotFoundException;;
}
