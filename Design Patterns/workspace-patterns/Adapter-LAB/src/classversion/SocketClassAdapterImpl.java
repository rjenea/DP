package classversion;

// Adapter is a 240V Socket with added ability
public class SocketClassAdapterImpl extends Socket_240V implements Socket_120V {

	@Override
	public Volt get120Volt() {
		return convertVolt(getVolt(),2);
	}

	
//	@Override
//	public Volt get12Volt() {
//		Volt v = getVolt();
//		return convertVolt(v, 10);
//	}
//
//	@Override
//	public Volt get3Volt() {
//		Volt v = getVolt();
//		return convertVolt(v, 40);
//	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}

}
