package com.bank.mts.repository;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.bank.mts.model.Account;

public class JdbcAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger("mts");

	private DataSource dataSource;

	public JdbcAccountRepository(DataSource dataSource) {
		logger.info("JdbcAccountRepository instance created");
		this.dataSource = dataSource;
	}

	public Account load(String num) {
		logger.info("loading account : " + num);
		try {
			Connection connection=dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void update(Account account) {
		logger.info("updating an account");
	}

}
