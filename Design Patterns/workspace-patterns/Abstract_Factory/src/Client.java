
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DAOFactory daoFactory = DAOFactory.getDAOFactory();
		 
		// Create a DAO
		CustomerDAO custDAO = daoFactory.getCustomerDAO();
		Customer customer = new Customer(1,"FName","LName","","");
		
		// create a new customer
		custDAO.insertCustomer(customer);
		 
		// Find a customer
		Customer cust = custDAO.findCustomer(customer);		 	
		 
		// delete a customer
		custDAO.deleteCustomer(cust);	
	}

}
