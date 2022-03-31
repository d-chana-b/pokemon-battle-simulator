package demo.list;

import java.util.ArrayList;


import demo.model.pokemon.*;


//temporary class muna to
public class Generation1List {

	private ArrayList<String> pokemonList = new ArrayList<>();
	
	public Generation1List() {
		super();
		pokemonList.add(new Arbok().getName());
		pokemonList.add(new Pikachu().getName());
	}

	public ArrayList<String> getPokemonList() {
		return pokemonList;
	}

	public void setPokemonList(ArrayList<String> pokemonList) {
		this.pokemonList = pokemonList;
	}

}
