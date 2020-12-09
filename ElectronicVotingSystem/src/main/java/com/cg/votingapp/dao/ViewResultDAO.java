package com.cg.votingapp.dao;

import com.cg.votingapp.exceptions.ResultNotFoundException;

public interface ViewResultDAO {
	public boolean viewResult() throws ResultNotFoundException ;
		
	
}
