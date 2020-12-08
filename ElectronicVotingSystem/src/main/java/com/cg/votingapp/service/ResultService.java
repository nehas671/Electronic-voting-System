package com.cg.votingapp.service;



public interface ResultService {

	Item findById(int itemId) throws ItemNotFoundException;
	
}
