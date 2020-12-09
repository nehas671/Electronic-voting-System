package com.cg.votingapp.service;

import com.cg.votingapp.dao.ViewResultDAO;
import com.cg.votingapp.dao.ViewResultDAOImpl;
import com.cg.votingapp.exceptions.ResultNotFoundException;

public class ViewResultServiceImpl implements ViewResultService{

	ViewResultDAO viewresultDAO = new ViewResultDAOImpl();
	public Boolean ViewResult() throws ResultNotFoundException {
		
		viewresultDAO.viewResult();
		
		return true;
	}

}
