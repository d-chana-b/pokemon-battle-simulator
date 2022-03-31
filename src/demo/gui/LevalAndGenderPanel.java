package demo.gui;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.*;

public class LevalAndGenderPanel extends JPanel {

	JComboBox genderDropDown;
	JTextField levelField;
	
	public LevalAndGenderPanel() {
		super();
		JLabel levelLabel = new JLabel("Level: ");
		levelField = new JTextField("100");
		JLabel genderLabel = new JLabel("Gender: ");
		String[] genderList = { "Male", "Female", "Genderless" };
		genderDropDown = new JComboBox(genderList);
		this.setBackground(Color.cyan);
		this.add(levelLabel);
		this.add(levelField);
		this.add(genderLabel);
		this.add(genderDropDown);
	}

	public LevalAndGenderPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public LevalAndGenderPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public LevalAndGenderPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

}
