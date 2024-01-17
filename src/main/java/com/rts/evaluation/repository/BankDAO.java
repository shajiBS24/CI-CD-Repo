package com.rts.evaluation.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rts.evaluation.model.Bank;

@Repository
public class BankDAO {

	List<Bank> accList = new ArrayList<Bank>();

	public boolean addAccount(Bank account) {
		accList.add(account);
		return true;
	}
}
