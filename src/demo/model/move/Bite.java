package demo.model.move;

import demo.model.Move;

public class Bite extends Move {

	public Bite() {
		super();
		this.setName("Bite");
		this.setPower(60);
		this.setAccuracy(100);
	}

	public Bite(String name, int power, int accuracy, int criticalHitRatio, int priority, int basePP, int maxPP) {
		super(name, power, accuracy, criticalHitRatio, priority, basePP, maxPP);
		// TODO Auto-generated constructor stub
	}

}
