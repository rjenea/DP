public final class Application {

	public static void main(String[] args) throws DataAccessException {
		
		DeviceFactory.getFactory("open").getInstanceForFileSystem().add(new Device());
		DeviceFactory.getFactory("nonopen").getInstanceForFileSystem().add(new Device());
		
		DeviceFactory.getFactory("open").getInstanceForRelational().add(new Device());
		DeviceFactory.getFactory("nonopen").getInstanceForRelational().add(new Device());
		
	}
}
