package demo.model.pokemon;

import java.util.ArrayList;

import demo.model.Move;
import demo.model.Pokemon;
import demo.model.move.*; //import all the move in the move package

public class Arbok extends Pokemon {

	private final int baseHP = 60, baseAtk = 85, baseDef = 69, baseSpAtk = 65, baseSpDef = 79, baseSpeed = 80;

	private ArrayList<Move> levelUpMoves;

	public Arbok() {
		super();
		this.setName("Arbok");
		this.setBaseHP(baseHP);
		this.setBaseHP(baseAtk);
		this.setBaseHP(baseDef);
		this.setBaseHP(baseSpAtk);
		this.setBaseHP(baseSpDef);
		this.setBaseHP(baseSpeed);
		levelUpMoves = new ArrayList<>();
		this.levelUpMoves.add(new Tackle());
		this.levelUpMoves.add(new Bite());
		this.levelUpMoves.add(new IceFang());
		this.levelUpMoves.add(new GunkShot());
	}

	public ArrayList<Move> getLevelUpMoves() {
		return levelUpMoves;
	}

	public void setLevelUpMoves(ArrayList<Move> levelUpMoves) {
		this.levelUpMoves = levelUpMoves;
	}

	public int getBaseHP() {
		return baseHP;
	}

	public int getBaseAtk() {
		return baseAtk;
	}

	public int getBaseDef() {
		return baseDef;
	}

	public int getBaseSpAtk() {
		return baseSpAtk;
	}

	public int getBaseSpDef() {
		return baseSpDef;
	}

	public int getBaseSpeed() {
		return baseSpeed;
	}

}
