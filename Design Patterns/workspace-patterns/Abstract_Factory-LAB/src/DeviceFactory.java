

public class DeviceFactory {
	
	private static DAOFactory pf = null;

	static DAOFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("NonOpen")) {
			pf = new ConcreteDaoForNonOpenSource();
		} else if (choice.equalsIgnoreCase("open")) {
			pf = new ConcreteDaoForOpenSource();
		}else{
			throw new RuntimeException("No Choice of device");
		}
		return pf;
	}

}
