package com.cg.votingapp.service;

import com.cg.votingapp.exceptions.ResultNotFoundException;

public interface ViewResultService {
	Boolean ViewResult() throws ResultNotFoundException;
}
