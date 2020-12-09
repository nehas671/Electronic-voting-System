package com.cg.votingapp.utils;


import com.cg.votingapp.dto.VoterRequest;
import com.cg.votingapp.entity.VoterRequestEntity;

	public class VoterRequestUtils {
		public static VoterRequestEntity convertVoterRequestIntoVoterRequestEntity(VoterRequest VoterRequest) {
			return new VoterRequestEntity(VoterRequest.getUserId(),VoterRequest.getName(),VoterRequest.getDistrict(),VoterRequest.getConstituency(),VoterRequest.getVoterId(),VoterRequest.getContactNumber(),VoterRequest.getApplicationStatus());
		}
		public static VoterRequest convertVoterRequestEntityIntoVoterRequest(VoterRequestEntity VoterRequestEntity) {
			return new VoterRequest(VoterRequestEntity.getUserId(),VoterRequestEntity.getName(),VoterRequestEntity.getDistrict(),VoterRequestEntity.getConstituency(),VoterRequestEntity.getVoterId(),VoterRequestEntity.getContactNumber(),VoterRequestEntity.getApplicationStatus());
		}

}
