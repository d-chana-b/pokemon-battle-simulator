package demo.model;

public class Pokemon {

	// basic properties
	private String name, type1, type2, ability1, ability2, hiddenAbility, heldItem;
	private int HP, atk, def, spAtk, spDef, speed; // max stats na ito pre
	private int baseHP, baseAtk, baseDef, baseSpAtk, baseSpDef, baseSpeed;

	// misc properties
	private double weight;
	private int happiness;

	//user define properties
	private String gender, ability, nature;
	private int level;
	
	// for user define moveset
	Move move1 = new Move();
	Move move2 = new Move();
	Move move3 = new Move();
	Move move4 = new Move();

	public Pokemon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public String getAbility1() {
		return ability1;
	}

	public void setAbility1(String ability1) {
		this.ability1 = ability1;
	}

	public String getAbility2() {
		return ability2;
	}

	public void setAbility2(String ability2) {
		this.ability2 = ability2;
	}

	public String getHiddenAbility() {
		return hiddenAbility;
	}

	public void setHiddenAbility(String hiddenAbility) {
		this.hiddenAbility = hiddenAbility;
	}

	public String getHeldItem() {
		return heldItem;
	}

	public void setHeldItem(String heldItem) {
		this.heldItem = heldItem;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getSpAtk() {
		return spAtk;
	}

	public void setSpAtk(int spAtk) {
		this.spAtk = spAtk;
	}

	public int getSpDef() {
		return spDef;
	}

	public void setSpDef(int spDef) {
		this.spDef = spDef;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getBaseHP() {
		return baseHP;
	}

	public void setBaseHP(int baseHP) {
		this.baseHP = baseHP;
	}

	public int getBaseAtk() {
		return baseAtk;
	}

	public void setBaseAtk(int baseAtk) {
		this.baseAtk = baseAtk;
	}

	public int getBaseDef() {
		return baseDef;
	}

	public void setBaseDef(int baseDef) {
		this.baseDef = baseDef;
	}

	public int getBaseSpAtk() {
		return baseSpAtk;
	}

	public void setBaseSpAtk(int baseSpAtk) {
		this.baseSpAtk = baseSpAtk;
	}

	public int getBaseSpDef() {
		return baseSpDef;
	}

	public void setBaseSpDef(int baseSpDef) {
		this.baseSpDef = baseSpDef;
	}

	public int getBaseSpeed() {
		return baseSpeed;
	}

	public void setBaseSpeed(int baseSpeed) {
		this.baseSpeed = baseSpeed;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public Move getMove1() {
		return move1;
	}

	public void setMove1(Move move1) {
		this.move1 = move1;
	}

	public Move getMove2() {
		return move2;
	}

	public void setMove2(Move move2) {
		this.move2 = move2;
	}

	public Move getMove3() {
		return move3;
	}

	public void setMove3(Move move3) {
		this.move3 = move3;
	}

	public Move getMove4() {
		return move4;
	}

	public void setMove4(Move move4) {
		this.move4 = move4;
	}

}
