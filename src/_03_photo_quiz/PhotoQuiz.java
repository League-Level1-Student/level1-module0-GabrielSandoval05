package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

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

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
String URL = "https://www.allaboutbirds.org/guide/assets/photo/60021831-480px.jpg";	
// 2. create a variable of type "Component" that will hold your image
Component hi;
//step 2 and 3 could also be combined into Component hi = createImage(URL);
		// 3. use the "createImage()" method below to initialize your Component
hi= createImage(URL);
		// 4. add the image to the quiz window
quizWindow.add(hi);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String response = JOptionPane.showInputDialog("Is this duck a male?");
		// 7. print "CORRECT" if the user gave the right answer
if(response.equalsIgnoreCase("Yes")) {
	System.out.println("CORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
else if(response.equalsIgnoreCase("No")) {
	System.out.println("INCORRECT");
}
else {
	System.out.println("k that's not an answer");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(hi);
		// 10. find another image and create it (might take more than one line
		// of code)
String link = "https://i.ytimg.com/vi/0-qTxEjYENQ/maxresdefault.jpg";
Component lol = createImage(link);
		// 11. add the second image to the quiz window
quizWindow.add(lol);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String answer = JOptionPane.showInputDialog("Is this art?");
		// 14+ check answer, say if correct or incorrect, etc.
if(answer.equalsIgnoreCase("yes")) {
	System.out.println("CORRECT");
}
else if(answer.equalsIgnoreCase("No")) {
	System.out.println("Hrmmmm...Incorrect and uncultured");
}
else {
	System.out.println("k");
}
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
