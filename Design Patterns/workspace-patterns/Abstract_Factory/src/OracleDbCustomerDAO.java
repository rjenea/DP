import javax.sql.RowSet;

public class OracleDbCustomerDAO implements  CustomerDAO {
 
  public OracleDbCustomerDAO () {
    // initialization
	  System.out.println("OracleDbCustomerDAO created");
  }
 
  // The following methods can use
  // OracleDbCustomerDAOFactory.createConnection() 
  // to get a connection as required
 
  public int insertCustomer(Customer customer) {
    // Implement insert customer here.
    // Return newly created customer id
    // or a -1 on error
	  System.out.println("OracleDbCustomerDAO --> insertCustomer()");
	  return -1;
  }
 
  public boolean deleteCustomer( Customer customer) {
    // Implement delete customer here
    // Return true on success, false on failure
	  System.out.println("OracleDbCustomerDAO --> deleteCustomer()");
	  return true;
  }
 
  public Customer findCustomer(Customer customer) {
    // Implement find a customer here using supplied
    // argument values as search criteria
    // Return a Transfer Object if found,
    // return null on error or if not found
	  System.out.println("OracleDbCustomerDAO --> findCustomer()");
	  return null;
  }
 
  public boolean updateCustomer(Customer customer) {
    // implement update record here using data
    // from the customer Transfer Object
    // Return true on success, false on failure or error
	  System.out.println("OracleDbCustomerDAO --> updateCustomer()");
	  return true;
  }
 
  public RowSet selectCustomersRS(Customer customer) {
    // implement search customers here using the
    // supplied criteria.
    // Return a RowSet. 
	  return null;
  }

}