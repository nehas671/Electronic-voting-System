package com.cg.votingapp.utils;

import com.cg.votingapp.dto.Candidate;
import com.cg.votingapp.entity.CandidateEntity;

public class VotingAppUtils {
	public static CandidateEntity convertCandidateIntoCandidateEntity(Candidate candidate) {
		CandidateEntity entity = new CandidateEntity();
		return new CandidateEntity(candidate.getCandidate_name(), candidate.getAddress(), candidate.getAge(), candidate.getContact_details(), candidate.getCount(), entity.getParty());
	}
	public static Candidate convertCandidateEntityIntoCandidate(CandidateEntity candidateEntity) {
		Candidate candidate = new Candidate();
		return new Candidate(candidateEntity.getCandidate_name(), candidateEntity.getAddress(), candidateEntity.getAge(), candidateEntity.getContact_details(), candidateEntity.getCount(), candidate.getParty());
	}
}
