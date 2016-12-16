package Gui;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class CarTrakker extends JFrame{
	
	private Toolbar toolbar;
	
	public CarTrakker()
	{
		setTitle("CarTrakker");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		
		createComponents();
		
	}
	
	private void createComponents() {
		toolbar= new Toolbar();
		add(toolbar, BorderLayout.NORTH);
		
	}






	public static void main(String[] args) {
		CarTrakker trakker = new CarTrakker();
		trakker.pack();
		trakker.setVisible(true);
	}

}
