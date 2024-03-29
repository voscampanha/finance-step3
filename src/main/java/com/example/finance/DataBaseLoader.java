package com.example.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.finance.Account;
import com.example.finance.AccountRepository;

@Component
public class DataBaseLoader implements CommandLineRunner {

	private final AccountRepository accounts;
	private final UserAppRepository users;

	@Autowired
	public DataBaseLoader(AccountRepository accountRepository,
			UserAppRepository userRepository) {

		this.accounts = accountRepository;
		this.users = userRepository;
	}

	@Override
	public void run(String... strings) throws Exception {

		UserApp vanessa = this.users.save(new UserApp("vanessa","teste@email.com", "123",
							"ROLE_ADMIN"));
		UserApp diogo = this.users.save(new UserApp("diogo", "test@email.com", "123",
							"ROLE_USER"));

		this.accounts.save(new Account("Nubank", 1, vanessa));
		this.accounts.save(new Account("CC Banco do Brasil", 1, vanessa));
		this.accounts.save(new Account("PP Banco do Brasil", 1, vanessa));

		this.accounts.save(new Account("Nubank", 1, diogo));
		this.accounts.save(new Account("Itau", 1, diogo));
		this.accounts.save(new Account("Carteira", 1, diogo));

	}
}