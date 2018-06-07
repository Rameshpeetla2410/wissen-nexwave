package com.oo.patterns.creational;

interface Connection {
	String getName();
}

class OracleConnection implements Connection {
	@Override
	public String getName() {
		return "oracle";
	}
}

class MongoConnection implements Connection {
	public String getName() {
		return "mongodb";
	}
}

// Factory for connections
class ConnectionFactory {
	public static Connection getConnection(String dbName, String url, String userName, String password) {
		if (dbName.equals("oracle")) {
			//
			return new OracleConnection();
		}
		if (dbName.equals("mongo")) {
			// ..
			return new MongoConnection();
		}
		return null;
	}
}

public class Factory_Method_Ex {
	public static void main(String[] args) {

		// module-1, uses oracle-db
		// -------------------------------------------------
		Connection connection1 = ConnectionFactory.getConnection("oracle", "", "", "");
		System.out.println(connection1.getName());
		// -------------------------------------------------

		// module-2 uses mongo
		// -------------------------------------------------
		Connection connection2 = ConnectionFactory.getConnection("mongo", "", "", "");
		System.out.println(connection2.getName());
		// -------------------------------------------------

	}
}
