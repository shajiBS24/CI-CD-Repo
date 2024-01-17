package com.rts.evaluation.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rts.evaluation.model.Bank;
import com.rts.evaluation.service.BankService;

@RestController
@RequestMapping("/bankRest/api")
public class BankController {

	@Autowired
	private BankService accountService;

	@PostMapping("/account")
	public boolean performInsert(@RequestBody Bank account) {
		return accountService.addAccount(account);
	}

}
