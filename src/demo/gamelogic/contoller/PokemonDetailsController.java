package demo.gamelogic.contoller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
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
				// System.out.println(DisplayPokemonDetailsPanel.pokemonDropDown.getSelectedItem());
				Pokemon pokemonSelected = (Pokemon) DisplayPokemonDetailsPanel.pokemonDropDown.getSelectedItem();
				displayPokemonDetails(pokemonSelected);

			}

		});
	}

	void displayPokemonDetails(Pokemon pokemon) {
		// System.out.println("image/sprites/resize/"+pokemon.getName()+".png");
		ImageIcon icon = new ImageIcon("image/sprites/resize/" + pokemon.getName() + ".png");
		DisplayPokemonDetailsPanel.pokemonLabel.setIcon(icon);
		DisplayPokemonDetailsPanel.pokemonLabel.setText(pokemon.getName());
		

	}

}
