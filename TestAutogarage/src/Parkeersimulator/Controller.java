package Parkeersimulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Controller extends JPanel implements ActionListener{
	
	private JButton run;
	private Simulator simulator;
	
	public Controller() {
			
			
		setSize(450, 50);
		run = new JButton("Run");
		run.addActionListener(this);
		
		this.setLayout(null);
		add(run);
		run.setBounds(319, 10, 70, 30);

		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource()==run) {
			simulator.run();
		}
	}
	
}

