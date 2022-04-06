package demo.model.pokemon;

import java.util.ArrayList;

import demo.model.Move;
import demo.model.Pokemon;
import demo.model.move.*;

public class Pikachu extends Pokemon {

	private final int baseHP = 35, baseAtk = 55, baseDef = 30, baseSpAtk = 50, baseSpDef = 40, baseSpeed = 90;

	private ArrayList<Move> levelUpMoves;

	public Pikachu() {
		super();
		this.setName("Pikachu");
		this.setBaseHP(baseHP);
		this.setBaseHP(baseAtk);
		this.setBaseHP(baseDef);
		this.setBaseHP(baseSpAtk);
		this.setBaseHP(baseSpDef);
		this.setBaseHP(baseSpeed);
		levelUpMoves = new ArrayList<>();
		levelUpMoves.add(new Tackle());
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
