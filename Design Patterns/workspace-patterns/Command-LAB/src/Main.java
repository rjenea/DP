import java.awt.event.ActionEvent;

public class Main {
	public static void main(String[] args) {

//		JFrame frame;
//		frame = new JFrame("Command Pattern Example");
//		frame.setSize(200, 100);
//		JButton button = new JButton("Click On");
//		frame.add(button);
//		frame.setVisible(true);
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Command command = (Command) e.getSource();
//				command.execute();
//			}
//		});
		
		FileOpenMenuItem fileOpenMenuItem = new FileOpenMenuItem();
		ActionEvent actionEvent = new ActionEvent(fileOpenMenuItem, 1, "run");
		MyClass class1 = new MyClass();
		class1.actionPerformed(actionEvent);

	}

}
