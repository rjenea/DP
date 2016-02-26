public class DeviceDAOFileSysForWindows implements DeviceDAOFileSystem {

	@Override
	public void add(Device aDevice) throws DataAccessException {
		System.out.println("FileSystem :: NON OPEN SOURCE ::   Add to file system ");

	}

	@Override
	public void change(Device aDevice) throws DataAccessException {
		System.out.println("FileSystem :: NON OPEN SOURCE ::   Change in file system ");

	}

	@Override
	public void delete(Device aDevice) throws DataAccessException {
		System.out.println("FileSystem :: NON OPEN SOURCE ::   Delete from file system ");

	}

}
