package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.exceptions.ResultNotFoundException;
import com.cg.votingapp.service.ViewResultService;
import com.cg.votingapp.service.ViewResultServiceImpl;

public class ViewResultController {
	
	private static Logger logger = LogManager.getLogger(ElectionController.class.getName());
	ViewResultService viewresultService = new ViewResultServiceImpl();

	public Boolean ViewResult() throws ResultNotFoundException{
		Boolean viewresult =  null ;
		try {
			viewresult = viewresultService.ViewResult();
		}
		catch(Exception e){
			logger.error("Result not found Exception" +e);
			throw new ResultNotFoundException(e.getMessage());
		}
		return viewresult;
	}
}
