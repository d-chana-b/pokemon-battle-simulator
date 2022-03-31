package demo.model.move;

import demo.model.Move;

public class GunkShot extends Move{

	public GunkShot() {
		super();
		this.setName("Gunk Shot");
		this.setPower(120);
		this.setAccuracy(70);
	}

	public GunkShot(String name, int power, int accuracy, int criticalHitRatio, int priority, int basePP, int maxPP) {
		super(name, power, accuracy, criticalHitRatio, priority, basePP, maxPP);
		// TODO Auto-generated constructor stub
	}

}
