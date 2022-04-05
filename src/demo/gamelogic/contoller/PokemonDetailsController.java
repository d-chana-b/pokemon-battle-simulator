package demo.gamelogic.contoller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import demo.gamelogic.compute.Compute;
import demo.gui.DisplayPokemonDetailsPanel;
import demo.gui.StatsPanel;
import demo.model.Pokemon;
import demo.model.pokemon.*;

public class PokemonDetailsController {

	public PokemonDetailsController() {
		super();
		setUpPokemonDetailsEvent();
	}

	private void setUpPokemonDetailsEvent() {

		DisplayPokemonDetailsPanel.pokemonDropDown.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println(DisplayPokemonDetailsPanel.pokemonDropDown.getSelectedItem());
				
				//Pokemon pokemonSelected = (Pokemon) DisplayPokemonDetailsPanel.pokemonDropDown.getSelectedItem();
				displayPokemonDetails((String) DisplayPokemonDetailsPanel.pokemonDropDown.getSelectedItem());

			}

		});
	}

	//create ka na lang ng separate class dito pag naisip mo na kung ano yun
	void displayPokemonDetails(String name) {
		
		Pokemon pokemon;
		ImageIcon icon;
		
		switch(name) {
		
		case "Pikachu":
			pokemon = new Pikachu();
			icon = new ImageIcon("image/sprites/resize/" + pokemon.getName() + ".png");
			DisplayPokemonDetailsPanel.pokemonLabel.setIcon(icon);
			DisplayPokemonDetailsPanel.pokemonLabel.setText(pokemon.getName());
			StatsPanel.bHP.setText(String.valueOf(pokemon.getBaseHP()));
			StatsPanel.bAtk.setText(String.valueOf(pokemon.getBaseAtk()));
			StatsPanel.bDef.setText(String.valueOf(pokemon.getBaseDef()));
			StatsPanel.bSpAtk.setText(String.valueOf(pokemon.getBaseSpAtk()));
			StatsPanel.bSpDef.setText(String.valueOf(pokemon.getBaseSpDef()));
			StatsPanel.bSpeed.setText(String.valueOf(pokemon.getBaseSpeed()));
			new Compute().computeStats(pokemon);			
			break;
		case "Arbok":
			pokemon = new Arbok();
			icon = new ImageIcon("image/sprites/resize/" + pokemon.getName() + ".png");
			DisplayPokemonDetailsPanel.pokemonLabel.setIcon(icon);
			DisplayPokemonDetailsPanel.pokemonLabel.setText(pokemon.getName());
			StatsPanel.bHP.setText(String.valueOf(pokemon.getBaseHP()));
			StatsPanel.bAtk.setText(String.valueOf(pokemon.getBaseAtk()));
			StatsPanel.bDef.setText(String.valueOf(pokemon.getBaseDef()));
			StatsPanel.bSpAtk.setText(String.valueOf(pokemon.getBaseSpAtk()));
			StatsPanel.bSpDef.setText(String.valueOf(pokemon.getBaseSpDef()));
			StatsPanel.bSpeed.setText(String.valueOf(pokemon.getBaseSpeed()));
			new Compute().computeStats(pokemon);
			break;
		}
			
		
		

	}
	
	

}
