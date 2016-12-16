package Gui;

import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Toolbar extends JPanel{
	
	private static Toolbar theInstance = new Toolbar(); 
	
	public Toolbar() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(createGarageActions());
		add(createCarActions()); 
	}

	private JPanel createCarActions() {
		JPanel panel = new JPanel(new FlowLayout());
		panel.setBorder(new TitledBorder(new EtchedBorder(), "CarActions"));
		
		JButton editButton = new JButton();
		editButton.setHorizontalTextPosition(AbstractButton.CENTER);
		editButton.setVerticalTextPosition(AbstractButton.BOTTOM);
		editButton.setText("Edit");
		
		panel.add(editButton);

		JButton serviceButton = new JButton();
		serviceButton.setHorizontalTextPosition(AbstractButton.CENTER);
		serviceButton.setVerticalTextPosition(AbstractButton.BOTTOM);
		serviceButton.setText("Service");
		
		panel.add(serviceButton);
		
		JButton infoButton = new JButton();
		infoButton.setHorizontalTextPosition(AbstractButton.CENTER);
		infoButton.setVerticalTextPosition(AbstractButton.BOTTOM);
		infoButton.setText("Info");
		
		panel.add(infoButton);
		
		return panel; 
	}

	private JPanel createGarageActions() {
		
		JPanel panel = new JPanel(new FlowLayout());
		panel.setBorder(new TitledBorder(new EtchedBorder(), "GarageActions"));
		
		JButton newButton = new JButton();
		newButton.setHorizontalTextPosition(AbstractButton.CENTER);
		newButton.setVerticalTextPosition(AbstractButton.BOTTOM);
		newButton.setText("Add Vehicle");
		
		panel.add(newButton);

		JButton removeButton = new JButton();
		removeButton.setHorizontalTextPosition(AbstractButton.CENTER);
		removeButton.setVerticalTextPosition(AbstractButton.BOTTOM);
		removeButton.setText("Remove Vehicle");
		
		panel.add(removeButton);
		
		return panel; 
		
	}
	public Toolbar getInstance() {
		return theInstance;
	}
	
}
