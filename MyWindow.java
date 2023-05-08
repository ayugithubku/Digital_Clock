package Digital_Clock;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class MyWindow extends JFrame{
	private JLabel heading;
	private JLabel clockLabel;
	private Font font = new Font(" ", Font.BOLD, 35);
	
	MyWindow(){
		super.setTitle("My Clock.....");
		super.setSize(600, 600);
		super.setLocation(200, 100);
		super.setVisible(true);
		this.createGUI();
		this.startTimer();
	}
	public void createGUI() {
		heading = new JLabel("Digital Clock");
		clockLabel = new JLabel("Clock");
		heading.setFont(font);
		clockLabel.setFont(font);
		this.setLayout(new GridLayout(2, 1));
		this.add(heading);
		this.add(clockLabel);
	}
	public void startTimer() {
		Timer timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			String dateTime = new Date().toString();
			clockLabel.setText(dateTime);
			}
		});
		timer.start();
	}
	
			
		
	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
