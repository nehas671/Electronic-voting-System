package com.cg.votingapp.utils;

import com.cg.votingapp.dto.VoterId;
import com.cg.votingapp.entity.VoterIdEntity;

public class VoterIdUtils {
	public static VoterIdEntity convertVoterIdIntoVoterIdEntity(VoterId VoterId) {
		return new VoterIdEntity(VoterId.getUser_id(), VoterId.getConstituency(),VoterId.getVoter_id());
	}
	public static VoterId convertVoterIdEntityIntoVoterId(VoterIdEntity VoterIdEntity) {
		return new VoterId(VoterIdEntity.getUser_id(), VoterIdEntity.getConstituency(), VoterIdEntity.getVoter_id());
	}
}
