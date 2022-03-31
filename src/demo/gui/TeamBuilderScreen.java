package demo.gui;

import java.awt.BorderLayout;

import javax.swing.*;

public class TeamBuilderScreen {
	
	JFrame frame = new JFrame();
	HeaderPanel headerPanel = new HeaderPanel();
	RightPanel rightPanel = new RightPanel();
	MainPanel mainPanel = new MainPanel();
	PokemonBuilderPanel pokemonBuilderPanel = new PokemonBuilderPanel();
	
	public TeamBuilderScreen() {
		super();
		
		frame.add(headerPanel,BorderLayout.NORTH);
		frame.add(rightPanel,BorderLayout.WEST);
		frame.add(mainPanel);
		frame.add(pokemonBuilderPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,600);
		frame.setVisible(true);
	}
	


}
