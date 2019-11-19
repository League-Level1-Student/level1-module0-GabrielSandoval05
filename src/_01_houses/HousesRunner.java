package _01_houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class HousesRunner {
	static Robot meme = new Robot();
	public static void main(String[] args) {
		//Here we call the run() method from the Houses class
		Houses houseBuilder = new Houses();
		houseBuilder.run();

meme.setX(50);
meme.setY(500);
meme.setPenWidth(4);
meme.setSpeed(10);
meme.penDown();
String house = JOptionPane.showInputDialog("What height would you like your houses? Small Medium or Large");
 //int hi = Integer.parseInt(house);



drawHouse(house);


	}
	public static void drawHouse(String height2) {
		int height = 0;
		if(height2.equalsIgnoreCase("small")) {
			height=50;
		}
		else if(height2.equalsIgnoreCase("medium")) {
			height=120;
		}
		else if (height2.equalsIgnoreCase("large")) {
			height=250;
		}
		else {
			JOptionPane.showMessageDialog(null, "K thx");
		}
	for(int i = 0; i<9;i++) {
		meme.move(height);
		meme.turn(90);
		meme.move(50);
		meme.turn(90);
		meme.move(height);
		meme.turn(-90);
		meme.setPenColor(59, 130, 49);
		meme.move(30);
		meme.turn(-90);
		meme.setPenColor(0, 0, 0);
	}

	}

}
