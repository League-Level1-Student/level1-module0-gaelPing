package _05_body_part_quiz;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {


	// You can use the celebrity photos we have placed in the default java
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the default package, and change the names below.

	String firstImage = "arnold.jpeg";
	String secondImage = "leonardo.jpeg";
	String thirdImage = "morgan.jpeg";
	String fourthImage = "jack.jpeg";

	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	

	public void run() {
		
		initializeGui();
		startQuiz();
		
	}

	private void initializeGui() {
		initializeImageList();
		window.setSize(300, 300);
		window.setVisible(true);
		imageIterator = imageList.iterator();
		panel.add(getNextImage());
		window.add(panel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 500)

		// 3. Change the size of the window so that you can only see part of the
		// image.
		;
         
		showNextImage();

	}

	private void startQuiz() {

		// 1. Make an int variable to hold the score.
int points = 0;
		// 2. Set the size of the window in the initializeGui() method 

		// 4. Ask the user who this person is and store their answer
		String guess = JOptionPane.showInputDialog("who is this?");

		// 5. Check their answer. If they guessed correctly:
		// -- Tell them they are right and increase the score by 1
if (guess.contains("arnold")) {
	System.out.println("correct");
	points++;
	
}
else {
	System.out.println("incorect that is arnold");
	showNextImage();
}

		// 6. Otherwise:
		// -- Tell them they are wrong and who the person is

		// 7. Use the showNextImage() method below to get the next image
		

		// 8. .... repeat 4-7 for all your images.....

		// 9. Show them their current score

	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		window.setVisible(true);
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}