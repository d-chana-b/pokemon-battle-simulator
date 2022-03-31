package demo.gui;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.*;

public class AbilityAndNaturePanel extends JPanel {

	JComboBox genderDropDown;
	JComboBox abilityDropDown;
	JComboBox natureDropDown;

	public AbilityAndNaturePanel() {
		super();
		
		JLabel abilityLabel = new JLabel("Ability: ");
		JLabel natureLabel = new JLabel("Nature: ");

		// tska ko na pagisipan kung panu ko madidisplay yung list
		
		String[] abilityList = { "Ability 1", "Ability 2", "Hidden" };
		String[] natureList = { "Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish",
				"Lax", "Timid", "Hasty", "Serious", "Jolly", "Naive", "Modest", "Mild", "Quiet", "Bashful", "Rash",
				"Calm", "Gentle", "Sassy", "Careful", "Quirky" };

		
		abilityDropDown = new JComboBox(abilityList);
		natureDropDown = new JComboBox(natureList);
		this.setBackground(Color.red);
		this.add(abilityLabel);
		this.add(abilityDropDown);
		this.add(natureLabel);
		this.add(natureDropDown);
	}

	public AbilityAndNaturePanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public AbilityAndNaturePanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public AbilityAndNaturePanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

}
