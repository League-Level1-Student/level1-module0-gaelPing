package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JackInTheBox implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	int time = 0;

	public void showButton() {
		frame.setVisible(true);
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	private void showPicture(String jackInTheBox) {
		try {
			JLabel imageLabel = createLabelImage(jackInTheBox);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String jackInTheBox) {
		try {
			URL imageURL = getClass().getResource(jackInTheBox);
			if (imageURL == null) {
				System.err.println("Could not find image " + jackInTheBox);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + jackInTheBox);
			return new JLabel();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		time++;
		if (time == 5) {
			showPicture("jackInTheBox.png");
		}
	}
}