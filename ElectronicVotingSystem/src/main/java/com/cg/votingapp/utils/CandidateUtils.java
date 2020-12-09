package com.cg.votingapp.utils;

import com.cg.votingapp.dto.Candidate;
import com.cg.votingapp.entity.CandidateEntity;

public class CandidateUtils {
	public static CandidateEntity convertCandidateIntoCandidateEntity(Candidate candidate) {
		CandidateEntity entity = new CandidateEntity();
		return new CandidateEntity(candidate.getCandidate_id(), candidate.getCandidate_name(), candidate.getAddress(), candidate.getAge(), candidate.getContact_number(), candidate.getCount(), entity.getParty());
	}
	public static Candidate convertCandidateEntityIntoCandidate(CandidateEntity candidateEntity) {
		Candidate candidate = new Candidate();
		return new Candidate(candidateEntity.getCandidate_id(),candidateEntity.getCandidate_name(), candidateEntity.getAddress(), candidateEntity.getAge(), candidateEntity.getContact_number(), candidateEntity.getCount(), candidate.getParty());
	}
}
