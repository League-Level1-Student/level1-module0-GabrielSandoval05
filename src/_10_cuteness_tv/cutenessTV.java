package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
	int times = 0;
	int times1 = 0;
	int times2 = 0;
	
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	  public void showButton() {
          JFrame frame = new JFrame();
          frame.setVisible(true);
          
         
          frame.add(button);
          frame.pack();
          button.addActionListener(this);
          
           
          frame.add(button);
          frame.pack();
          button1.addActionListener(this);
          
          
          frame.add(button);
          frame.pack();
          button2.addActionListener(this);
          
          JPanel panel = new JPanel ();
          frame.add(panel);
          panel.add(button);
          panel.add(button1);
          panel.add(button2);
     }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	if(arg0.getSource() == button) {
		System.out.println("AP ");
		showDucks();
	}
		if(arg0.getSource()==button1) {
		showFrog();
		}
		if(arg0.getSource()==button2) {
		showFluffyUnicorns();
		}
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}



}
