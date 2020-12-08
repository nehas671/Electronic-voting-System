package com.cg.votingapp.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.cg.votingapp.dao.ResultDAO;
import com.cg.votingapp.dao.ResultDAOImpl;
import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.exceptions.ResultNotFoundException;


public class ResultServiceImpl implements ResultService {

	private static Logger logger = LogManager.getLogger(ResultServiceImpl.class.getName());
	ResultDAO resultDao = new ResultDAOImpl();

	
	public void declareResult() throws ResultNotFoundException {	
		{			
			logger.info("Declaring Result");
			 resultDao.declareResult();
		}
		
		
	}

}
