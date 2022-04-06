package demo.model;

public class Move {

	private String name, type, category;
	private int power, accuracy, criticalHitRatio, priority, basePP, maxPP;

	public Move() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Move(String name, int power, int accuracy, int criticalHitRatio, int priority, int basePP, int maxPP) {
		super();
		this.name = name;
		this.power = power;
		this.accuracy = accuracy;
		this.criticalHitRatio = criticalHitRatio;
		this.priority = priority;
		this.basePP = basePP;
		this.maxPP = maxPP;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getCriticalHitRatio() {
		return criticalHitRatio;
	}

	public void setCriticalHitRatio(int criticalHitRatio) {
		this.criticalHitRatio = criticalHitRatio;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getBasePP() {
		return basePP;
	}

	public void setBasePP(int basePP) {
		this.basePP = basePP;
	}

	public int getMaxPP() {
		return maxPP;
	}

	public void setMaxPP(int maxPP) {
		this.maxPP = maxPP;
	}

}
