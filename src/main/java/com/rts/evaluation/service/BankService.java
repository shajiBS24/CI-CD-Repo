package com.rts.evaluation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rts.evaluation.model.Bank;
import com.rts.evaluation.repository.BankDAO;

@Service
public class BankService {
	
	@Autowired
	private BankDAO dao;
	
	public boolean addAccount(Bank account) {
		dao.addAccount(account);
		return true;
	}

}
