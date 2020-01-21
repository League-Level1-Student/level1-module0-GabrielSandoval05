package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import _06_duelling_buttons.DuelingButtons;

public class fortuneCookie implements ActionListener {
	public void showButton() {
	JFrame frame = new JFrame ();
	frame.setVisible(true);
	
	JButton button = new JButton ();
	frame.add(button);
	frame.pack();
	
	button.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woo-HOO!");
		int random = new Random().nextInt(5);
		System.out.println(random);
		
	}
	
	
}
