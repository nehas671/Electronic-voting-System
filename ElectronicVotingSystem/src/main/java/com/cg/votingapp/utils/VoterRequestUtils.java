package com.cg.votingapp.utils;

import com.cg.votingapp.dto.VoterId;
import com.cg.votingapp.dto.VoterRequest;
import com.cg.votingapp.entity.VoterIdEntity;
import com.cg.votingapp.entity.VoterRequestEntity;

public class VoterRequestUtils {
	public static VoterRequestEntity convertVoterRequestIntoVoterRequestEntity(VoterRequest voterRequest) {
		return new VoterRequestEntity(voterRequest.getUser_id(), voterRequest.getName(), voterRequest.getDistrict(), voterRequest.getConstituency(), voterRequest.getVoter_id(),
				voterRequest.getContact_no(), voterRequest.getApplication_status(),voterRequest.getAge());
	}
	public static VoterRequest convertVoterRequestEntityIntoVoterRequest(VoterRequestEntity voterRequestEntity) {
		return new VoterRequest(voterRequestEntity.getUser_id(), voterRequestEntity.getName(), voterRequestEntity.getDistrict(), voterRequestEntity.getConstituency(), voterRequestEntity.getVoterId(),
				voterRequestEntity.getContact_no(), voterRequestEntity.getApplication_status(),voterRequestEntity.getAge());
}
}