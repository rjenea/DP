public enum DBType {
// List of DB types that will be supported by the factory

	ORACLE(1), MYSQL(2);

	private final int factoryType;

	private DBType(final int newFactoryType) {
		factoryType = newFactoryType;
	}

	public int getValue() {
		return factoryType;
	}
}