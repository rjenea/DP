public class DeviceDAORelationalForMySql implements DeviceDAORelational {

	// @Override
	// public Device fetch(String aId) throws DataAccessException {
	// System.out.println(" Fetch from Data Base ");
	// return null;
	// }

	@Override
	public void add(Device aDevice) throws DataAccessException {
		System.out
				.println("RELATIONAL DAO :: OPEN SOURCE :: Add into Data Base ");

	}

	@Override
	public void change(Device aDevice) throws DataAccessException {
		System.out
				.println("RELATIONAL DAO :: OPEN SOURCE ::  Change in Data Base ");

	}

	@Override
	public void delete(Device aDevice) throws DataAccessException {
		System.out
				.println("RELATIONAL DAO :: OPEN SOURCE ::  Delete from Data Base ");

	}

}
