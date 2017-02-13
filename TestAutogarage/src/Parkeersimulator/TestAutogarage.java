package Parkeersimulator;

import javax.swing.*;


public class TestAutogarage{

	private JFrame frame;
	private SimulatorView view;
	private Controller controller;
	
	
	
	
	public TestAutogarage()
	{
		frame = new JFrame("TestAutogarage");
		controller= new Controller();
		
		frame.getContentPane().add(controller);
		frame.getContentPane().add(view);
		
		frame.setVisible(true);
		
		
		
	}
}

