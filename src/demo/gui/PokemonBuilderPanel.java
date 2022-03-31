package demo.gui;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.*;

public class PokemonBuilderPanel extends JPanel {

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	
	public PokemonBuilderPanel() {
		super();
		
		panel1.setBackground(Color.yellow);
		panel2.setBackground(Color.red);
		
		this.setBackground(Color.green);
		this.add(panel1);
		this.add(panel2);
	}

	public PokemonBuilderPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public PokemonBuilderPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public PokemonBuilderPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

}
