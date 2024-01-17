package com.rts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rts.evaluation.model.Bank;
import com.rts.evaluation.repository.BankDAO;

@SpringBootTest
class SbBankApplicationTests {
	
	@Autowired
	static BankDAO dao;
	Bank account=new Bank();
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testPerformInsert() {
		dao=new BankDAO();
		boolean value =dao.addAccount(account);
		assertEquals(value,true);
		
	}

}
