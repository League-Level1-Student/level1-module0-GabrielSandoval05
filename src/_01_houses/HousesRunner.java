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
String color2 = JOptionPane.showInputDialog("What color would you like them? Teal, Green, Magenta, or Mystery?");



drawHouse(house,color2);


	}
	public static void drawHouse(String height2, String color) {
		int height = 0;
		if(height2.equalsIgnoreCase("small")) {
			height=60;
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
		if(color.equalsIgnoreCase("green")) {
		meme.setPenColor(66, 255, 90);
		}
		else if(color.equalsIgnoreCase("Teal")) {
			meme.setPenColor(17, 240, 177);
		}
		else if(color.equalsIgnoreCase("Magenta")) {
			meme.setPenColor(245, 7, 205);
		}
		else if(color.equalsIgnoreCase("Mystery")) {
			meme.setRandomPenColor();
		}
		else {
			System.out.println("ok funny joke but there aren't any more colors");
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
		meme.setPenColor(0,0,0);
		if(color.equalsIgnoreCase("green")) {
			meme.setPenColor(66, 255, 90);
			}
			else if(color.equalsIgnoreCase("Teal")) {
				meme.setPenColor(17, 240, 177);
			}
			else if(color.equalsIgnoreCase("Magenta")) {
				meme.setPenColor(245, 7, 205);
			}
			else if(color.equalsIgnoreCase("Mystery")) {
				meme.setRandomPenColor();
			}
			else {
				System.out.println("ok funny joke but there aren't any more colors");
			}
	}

	}

}
