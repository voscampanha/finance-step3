package com.example.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.finance.Account;
import com.example.finance.AccountRepository;

@Component
public class DataBaseLoader implements CommandLineRunner {

	private final AccountRepository accounts;

	@Autowired
	public DataBaseLoader(AccountRepository accountRepository) {

		this.accounts = accountRepository;
	}

	@Override
	public void run(String... strings) throws Exception {

		this.accounts.save(new Account("Nubank", 1));
		this.accounts.save(new Account("CC Banco do Brasil", 1));
		this.accounts.save(new Account("PP Banco do Brasil", 1));
		this.accounts.save(new Account("Itau", 1));
		this.accounts.save(new Account("Carteira", 1));

	}
}