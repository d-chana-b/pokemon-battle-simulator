package demo.list;

import java.util.ArrayList;

import demo.model.Pokemon;
import demo.model.pokemon.*;


//temporary class muna to
public class Generation1List {

	private ArrayList<Pokemon> pokemonList = new ArrayList<>();
	
	public Generation1List() {
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

	

}
