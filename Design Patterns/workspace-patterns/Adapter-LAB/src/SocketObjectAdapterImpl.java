public class SocketObjectAdapterImpl implements Socket_120V {

	// Using Composition for adapter pattern
	private Socket_240V sock = new Socket_240V();

	@Override
	public Volt get120Volt() {
		Volt v = sock.getVolt();
		return convertVolt(v, 2);
	}

//	@Override
//	public Volt get12Volt() {
//		Volt v = sock.getVolt();
//		return convertVolt(v, 10);
//	}
//
//	@Override
//	public Volt get3Volt() {
//		Volt v = sock.getVolt();
//		return convertVolt(v, 40);
//	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}
}
