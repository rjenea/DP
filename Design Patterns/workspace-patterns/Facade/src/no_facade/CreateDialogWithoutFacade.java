package no_facade;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CreateDialogWithoutFacade {

	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Press OK to continue");
		JButton OKButton = new JButton("OK");
		final JDialog customDialog = new JDialog();
		panel.add(label);
		panel.add(OKButton);
		customDialog.getContentPane().add(panel,BorderLayout.CENTER);
		customDialog.pack();
		
		OKButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				customDialog.dispose();
			}
		});
		
		customDialog.setVisible(true);
	}
}
