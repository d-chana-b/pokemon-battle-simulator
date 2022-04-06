package demo.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.*;

public class PokemonBuilderPanel extends JPanel {

	DisplayPokemonDetailsPanel panel1;
	DisplayPokemonMoveListPanel panel2;

	public PokemonBuilderPanel() {
		super();
		panel1 = new DisplayPokemonDetailsPanel();
		panel2 = new DisplayPokemonMoveListPanel();
		panel1.setBackground(Color.yellow);
		panel2.setBackground(Color.red);

		this.setBackground(Color.green);
		this.setLayout(new GridLayout());
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
