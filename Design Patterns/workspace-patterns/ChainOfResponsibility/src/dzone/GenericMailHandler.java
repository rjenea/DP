package dzone;

public class GenericMailHandler implements EmailHandler {
	private EmailHandler next;

	public void setNext(EmailHandler handler) {
		next = handler;
	}

	public void handleRequest(Email email) {
		 System.out.println("Request handled by GenericMailHandler.");
	}
}