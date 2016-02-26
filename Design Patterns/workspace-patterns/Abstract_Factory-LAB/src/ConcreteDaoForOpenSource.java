
public class ConcreteDaoForOpenSource extends DAOFactory {

	@Override
	public DeviceDAOFileSystem getInstanceForFileSystem() {
		return new DeviceDAOFileSysForLinux();
	}

	@Override
	public DeviceDAORelational getInstanceForRelational() {
		return new DeviceDAORelationalForMySql();
	}


}
