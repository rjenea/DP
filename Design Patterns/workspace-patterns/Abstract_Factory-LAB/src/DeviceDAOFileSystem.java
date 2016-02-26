public interface DeviceDAOFileSystem {

	void add(Device aDevice) throws DataAccessException;

	void change(Device aDevice) throws DataAccessException;

	void delete(Device aDevice) throws DataAccessException;

}
