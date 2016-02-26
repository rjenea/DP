
public class ConcreteDaoForNonOpenSource extends DAOFactory{

	@Override
	public DeviceDAOFileSystem getInstanceForFileSystem() {
		
		return new DeviceDAOFileSysForWindows();
	}

	@Override
	public DeviceDAORelational getInstanceForRelational() {
		// TODO Auto-generated method stub
		return new DeviceDAORelationalForOracle();
	}

	

}
