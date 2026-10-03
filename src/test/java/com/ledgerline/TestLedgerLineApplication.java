package com.ledgerline;

import org.springframework.boot.SpringApplication;

public class TestLedgerLineApplication {

	public static void main(String[] args) {
		SpringApplication.from(LedgerLineApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
