
public abstract class DAOFactory {

	public abstract DeviceDAOFileSystem getInstanceForFileSystem();
	public abstract DeviceDAORelational getInstanceForRelational();

}
