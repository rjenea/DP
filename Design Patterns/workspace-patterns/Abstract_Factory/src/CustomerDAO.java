import javax.sql.RowSet;

public interface CustomerDAO {

	public int insertCustomer(Customer customer);

	public boolean deleteCustomer(Customer customer);

	public Customer findCustomer(Customer customer);

	public boolean updateCustomer(Customer customer);

	public RowSet selectCustomersRS(Customer customer);

}
