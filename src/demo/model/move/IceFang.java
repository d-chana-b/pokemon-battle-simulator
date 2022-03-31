package demo.model.move;

import demo.model.Move;

public class IceFang extends Move {

	public IceFang() {
		super();
		this.setName("Ice Fang");
		this.setPower(65);
		this.setAccuracy(95);
	}

	public IceFang(String name, int power, int accuracy, int criticalHitRatio, int priority, int basePP, int maxPP) {
		super(name, power, accuracy, criticalHitRatio, priority, basePP, maxPP);
		// TODO Auto-generated constructor stub
	}

}
