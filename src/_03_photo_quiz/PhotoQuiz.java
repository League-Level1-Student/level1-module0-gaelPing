package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */
// Are you still there?
import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JOptionPane.showMessageDialog(null, "Wellcom to the ''totaly normal'' images quiz"
		+ "\n Let's begin shall we?");
		String image = "https://images.boredomfiles.com/wp-content/uploads/2017/06/spooky-2.jpg";
		
		Component cursed;
	
		cursed = createImage(image);
		
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)

		// 2. create a variable of type "Component" that will hold your image

		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		quizWindow.add(cursed);
		
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image

		
		
		
		
String respons=JOptionPane.showInputDialog("whats wrong with this image");
		// 7. print "CORRECT" if the user gave the right answer
// if( respons.contains( "child" ) && respons.contains( "doorway" ) ){
if (respons.contains("child") || respons.contains("doorway")) {
	System.out.println("CORRECT");
}
else {
	System.out.println("INCORRECT");
	
}
		// 8. print "INCORRECT" if the answer is wrong
		String image2 ="https://i.kym-cdn.com/entries/icons/original/000/028/924/cover2.jpg";
			Component cursed2;
		cursed2 = createImage(image2);
		quizWindow.remove(cursed);
		quizWindow.add(cursed2);
		quizWindow.pack();
		String respons2=JOptionPane.showInputDialog("what animal is this?");
		if (respons2.contains("cat")) {
			System.out.println("CORRECT");
		}
		else {
			System.out.println("INCORRECT");
			
		}
		String image3 ="https://i.imgur.com/tFMy8D9.jpg";
		Component cursed3;
	cursed3 = createImage(image3);
	quizWindow.remove(cursed2);
	quizWindow.add(cursed3);
	quizWindow.pack();
	String respons3=JOptionPane.showInputDialog("what would you call this?");
	if (respons3.contains("octo")||respons3.contains("dog")) {
		System.out.println("CORRECT");
	}
	else {
		System.out.println("INCORRECT");
		
	}
	String image4 ="https://d2r8r0qhs4bt8m.cloudfront.net/wp-content/uploads/2019/10/18161018/desktop-1429735617.jpg";
	Component cursed4;
cursed4 = createImage(image4);
quizWindow.remove(cursed3);
quizWindow.add(cursed4);
quizWindow.pack();
String respons4=JOptionPane.showInputDialog("what is wrong in this image?");
if (respons4.contains("girl")||respons4.contains("child")||respons4.contains("ghost")) {
	System.out.println("CORRECT");
}
else {
	System.out.println("INCORRECT");
	
}
String image5 ="https://d2r8r0qhs4bt8m.cloudfront.net/wp-content/uploads/2019/10/18161017/desktop-1429735500.jpg" ; 

Component cursed5;
cursed5 = createImage(image5);
quizWindow.remove(cursed4);
quizWindow.add(cursed5);
quizWindow.pack();
String respons5=JOptionPane.showInputDialog("what is wrong in this image?");
if (respons5.contains("person")||respons5.contains("dark")||respons5.contains("falling")) {
System.out.println("CORRECT");
}
else {
System.out.println("INCORRECT");

}

String image6 ="https://d2r8r0qhs4bt8m.cloudfront.net/wp-content/uploads/2019/10/18161016/desktop-1429734366.jpg";
Component cursed6;
cursed6 = createImage(image6);
quizWindow.remove(cursed5);
quizWindow.add(cursed6);
quizWindow.pack();
String respons6=JOptionPane.showInputDialog("what is wrong in this image?"
		+ "\n hint:you may need to move the message");
if (respons6.contains("under")||respons6.contains("couch")||respons6.contains("person")) {
System.out.println("CORRECT");
}
else {
System.out.println("INCORRECT");

}
String image7 ="https://d2r8r0qhs4bt8m.cloudfront.net/wp-content/uploads/2019/10/18161011/desktop-1429735379.jpg";
Component cursed7;
cursed7 = createImage(image7);
quizWindow.remove(cursed6);
quizWindow.add(cursed7);
quizWindow.pack();
String respons7=JOptionPane.showInputDialog("what is wrong in this image?");
if (respons7.contains("standing")||respons7.contains("man")||respons7.contains("person")) {
System.out.println("CORRECT");
}
else {
System.out.println("INCORRECT");

}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.
		

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
