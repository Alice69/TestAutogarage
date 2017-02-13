package Parkeersimulator;

import javax.swing.*;


public class TestAutogarage{

	private JFrame frame;
	private SimulatorView view;
	

	public TestAutogarage()
	{
		frame = new JFrame("TestAutogarage");
		view =new SimulatorView();
		frame.add(view);
		frame.setVisible(true);
		
		
		
	}
}

