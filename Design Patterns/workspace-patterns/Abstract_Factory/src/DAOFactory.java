public abstract class DAOFactory {

	// There will be a method for each DAO that can be
	// created. The concrete factories will have to
	// implement these methods.
	public abstract CustomerDAO getCustomerDAO();

	public abstract OrderDAO getOrderDAO();

	public static DAOFactory getDAOFactory() {

		switch (getDBType()) { // read a configuration file to find which type
								// of database to connect to
		case ORACLE:
			return new OracleDbDAOFactory();
		case MYSQL:
			return new MySQLDbDAOFactory();

		default:
			return null;
		}
	}

	private static DBType getDBType() {
		// you will ideally read a config file
		return DBType.ORACLE;
	}

}
