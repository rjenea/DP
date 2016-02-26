package dzone;

//email client 

public class EmailClient {
	private EmailProcessor processor;

	public EmailClient() {
		createProcessor();
	}

	private void createProcessor() {
		processor = new EmailProcessor();
		processor.addHandler(new BusinessMailHandler());
		//processor.addHandler(new PersonalMailHandler());
		processor.addHandler(new GMailHandler());
		// When the handler is added is important!  Handle generics last.
		processor.addHandler(new GenericMailHandler());
	}

	public void addRule(EmailHandler handler) {
		processor.addHandler(handler);
	}

	public void emailReceived(Email email) {
		processor.handleRequest(email);
	}

	public static void main(String[] args) {
		EmailClient client = new EmailClient();
		client.emailReceived(new Email("greg@gmail.com"));
		client.emailReceived(new Email("terry@businessaddress.com"));
		// However, a chance of no handler, which may not work in some cases.  Could add generic Handler.
		client.emailReceived(new Email("@yahoo.com"));
	}
}