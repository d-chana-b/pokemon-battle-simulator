package demo.list;

import java.util.ArrayList;

import demo.model.Pokemon;
import demo.model.pokemon.*;


//class for the list of pokemon
public class PokemonList {

	private ArrayList<Pokemon> pokemonList = new ArrayList<>();
	
	private static ArrayList<String> pokemonNames = new ArrayList<>();

	public PokemonList() { // add all pokemon here
		super();
		pokemonList.add(new Arbok());
		pokemonList.add(new Pikachu());
	}

	public ArrayList<Pokemon> getPokemonList() {
		return pokemonList;
	}

	public void setPokemonList(ArrayList<Pokemon> pokemonList) {
		this.pokemonList = pokemonList;
	}

	public ArrayList<String> getPokemonNames(ArrayList<Pokemon> list) {
		
		for(Pokemon x: list) {
			pokemonNames.add(x.getName());
		}
		
		return pokemonNames;
	}

	public void setPokemonNames(ArrayList<String> pokemonNames) {
		PokemonList.pokemonNames = pokemonNames;
	}
	
	
	


}
