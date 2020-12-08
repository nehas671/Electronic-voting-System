package com.cg.votingapp.dao;

import javax.persistence.EntityManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.VotingApp.exceptions.ResultNotFoundException;



public interface ResultDAO {
	
public void declareResult() throws ResultNotFoundException;
}
