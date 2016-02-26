package proxy.demo.eckel;

public interface Connection {

	Object get();
	void set(Object x);
	void release();
}