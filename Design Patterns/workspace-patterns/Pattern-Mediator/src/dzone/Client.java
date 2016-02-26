package dzone;

public class Client {
	public static void main(String[] args) {
		ApplicationMediator appMediator = new ApplicationMediator();

		Colleague desktop = new DesktopColleague(appMediator);
		Colleague mobile = new MobileColleague(appMediator);

		appMediator.addColleague(desktop);
		appMediator.addColleague(mobile);

		desktop.send("Hello World");
		mobile.send("Hello");

	}
}