package demo.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.*;

import demo.gamelogic.contoller.PokemonDetailsController;
import demo.list.PokemonList;
import demo.model.Pokemon;

public class DisplayPokemonDetailsPanel extends JPanel {

	public static JComboBox pokemonDropDown;
	public static JLabel pokemonLabel;
	MovePanel moveSlotPanel;
	StatsPanel statsPanel;
	LevalAndGenderPanel miscPanel;
	AbilityAndNaturePanel misc2Panel;

	public DisplayPokemonDetailsPanel() {
		super();
		this.setLayout(new GridBagLayout());

		moveSlotPanel = new MovePanel();
		statsPanel = new StatsPanel();
		miscPanel = new LevalAndGenderPanel();
		misc2Panel = new AbilityAndNaturePanel();

		pokemonLabel = new JLabel();
		ImageIcon pokemonIcon = new ImageIcon("image/sprites/resize/pokeball.png");
		pokemonLabel.setBackground(Color.blue);
		pokemonLabel.setOpaque(true);
		pokemonLabel.setIcon(pokemonIcon);
		pokemonLabel.setText("Pokemon Name");
		pokemonLabel.setHorizontalTextPosition(JLabel.CENTER);
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		
		ArrayList<Pokemon> list = new PokemonList().getPokemonList();
		pokemonDropDown = new JComboBox(new PokemonList().getPokemonNames(list).toArray());

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.weighty = 1;
		//gbc.weightx = 2;

		//gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		this.add(pokemonDropDown, gbc);

		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 1;
		this.add(pokemonLabel, gbc);

		
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(moveSlotPanel, gbc);

		gbc.gridwidth = 2;
		gbc.gridx = 0;
		gbc.gridy = 2;
		this.add(miscPanel, gbc);

		
		gbc.gridx = 0;
		gbc.gridy = 3;
		this.add(misc2Panel, gbc);

		// gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 4;
		this.add(statsPanel, gbc);
		
		new PokemonDetailsController();
		

	}

	public DisplayPokemonDetailsPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public DisplayPokemonDetailsPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public DisplayPokemonDetailsPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

}
