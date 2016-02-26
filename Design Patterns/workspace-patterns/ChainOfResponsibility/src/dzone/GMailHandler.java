package dzone;

public class GMailHandler implements EmailHandler {
	private EmailHandler next;

	public void setNext(EmailHandler handler) {
		next = handler;
	}

	public void handleRequest(Email email) {
		if(!email.getFrom().endsWith("@gmail.com")) {
		    next.handleRequest(email);
		}
		else {
			System.out.println("Request handled by GMailHandler.");
		}
	}
}