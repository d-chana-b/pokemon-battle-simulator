package demo.gui;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class HeaderPanel extends JPanel{

	public HeaderPanel() {
		super();
		this.setBackground(Color.white);
		ImageIcon pokemonlogo = new ImageIcon("image/pokemonlogo.png");
		JLabel pokemonlogoLabel = new JLabel();
		pokemonlogoLabel.setIcon(pokemonlogo);
		this.add(pokemonlogoLabel);
	}

	public HeaderPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public HeaderPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public HeaderPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	
	
}
