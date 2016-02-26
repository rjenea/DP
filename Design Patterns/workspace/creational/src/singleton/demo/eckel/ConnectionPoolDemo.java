package singleton.demo.eckel;

import org.junit.Test;

//: singleton:ConnectionPoolDemo.java

public class ConnectionPoolDemo {
	static {
		ConnectionPool.addConnections(5);
	}

	@Test
	public void test() {
		Connection c = null;
		try {
			c = ConnectionPool.getConnection();
		} catch (PoolManager.EmptyPoolException e) {
			throw new RuntimeException(e);
		}
		c.set(new Object());
		c.get();
		ConnectionPool.releaseConnection(c);
	}

	@Test
	public void test2() {
		Connection c = null;
		try {
			c = ConnectionPool.getConnection();
		} catch (PoolManager.EmptyPoolException e) {
			throw new RuntimeException(e);
		}
		c.set(new Object());
		c.get();
		ConnectionPool.releaseConnection(c);
	}
}