package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffectsMachine implements ActionListener {
	 public void showButton() {
         JFrame frame = new JFrame ();
         frame.setVisible(true);
       
         
         JButton button = new JButton ();
         frame.add(button);
         frame.pack();
         button.addActionListener(this);
         
         JButton button1 = new JButton ();
         frame.add(button);
         frame.pack();
         button.addActionListener(this);
         
         JButton button2 = new JButton ();
         frame.add(button);
         frame.pack();
         button.addActionListener(this);
         
         JPanel panel = new JPanel ();
         frame.add(panel);
         panel.add(button);
         panel.add(button1);
         panel.add(button2);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}


}
