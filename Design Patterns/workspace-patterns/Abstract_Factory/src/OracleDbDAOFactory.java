import java.sql.Connection;

public class OracleDbDAOFactory extends DAOFactory {
	public static final String DRIVER = "oracle.jdbc.OracleDriver";
	public static final String DBURL = "jdbc:oracle:thin:@[host]:[port]:[sid]";

	public OracleDbDAOFactory() {
		System.out.println("OracleDbDAOFactory object created");
	}
	
	public static Connection createConnection() {
		// Use DRIVER and DBURL to create a connection
		return null;
	}

	public CustomerDAO getCustomerDAO() {
		// OracleDbCustomerDAO implements CustomerDAO
		
		return new OracleDbCustomerDAO();
	}

	public OrderDAO getOrderDAO() {
		// OracleDbOrderDAO implements OrderDAO
		return new OracleDbOrderDAO();
	}

	public AccountDAO getAccountDAO() {
		// OracleDbAccountDAO implements AccountDAO
		return new OracleDbAccountDAO();
	}

}
