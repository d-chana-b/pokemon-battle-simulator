package demo.model.move;

import demo.model.Move;

public class Tackle extends Move{

	public Tackle() {
		super();
		this.setName("Tackle");
		this.setPower(40);
		this.setAccuracy(100);
	}

	public Tackle(String name, int power, int accuracy, int criticalHitRatio, int priority, int basePP, int maxPP) {
		super(name, power, accuracy, criticalHitRatio, priority, basePP, maxPP);
		// TODO Auto-generated constructor stub
	}

	
	
}
