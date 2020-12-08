package com.cg.votingapp.service;


import com.cg.votingapp.exceptions.ResultNotFoundException;

public interface ResultService {
	
	void declareResult() throws ResultNotFoundException;
	
	
}

