package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_cookie implements ActionListener {
	JFrame frame=new JFrame();
	JButton button = new JButton();
	public void showButton() {
         frame.setVisible(true);
         frame.add(button);
         frame.pack();
         button.addActionListener(this);
	} 
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int rand = new Random().nextInt(5);
		if (rand==0) {
			JOptionPane.showMessageDialog(button, "you will have a good day");
		}
		if (rand==1) {
			JOptionPane.showMessageDialog(button, "you will not have a good day");
		}
		if (rand==2) {
			JOptionPane.showMessageDialog(button, "you will be lucky today");
		}
		if (rand==3) {
			JOptionPane.showMessageDialog(button, "you will be unlucky today");
		}
		if (rand==4) {
			JOptionPane.showMessageDialog(button, "you will have an amazing day");
		}
		
	}   
}
