package demo.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.*;

public class StatsPanel extends JPanel {

	public static JLabel bHP, bAtk, bDef, bSpAtk, bSpDef, bSpeed;
	public static JLabel mHP, mAtk, mDef, mSpAtk, mSpDef, mSpeed;
	public static JTextField hpIV, atkIV, defIV, spAtkIV, spDefIV, speedIV;
	public static JTextField hpEV, atkEV, defEV, spAtkEV, spDefEV, speedEV;

	public StatsPanel() {
		super();
		this.setBackground(Color.ORANGE);
		this.setLayout(new GridLayout(5, 7, 8, 8));

		JLabel stats = new JLabel("Stats: ");
		JLabel max = new JLabel("Max: ");
		JLabel base = new JLabel("Base: ");
		JLabel IV = new JLabel("IV: ");
		JLabel EV = new JLabel("EV: ");
		JLabel hp = new JLabel("HP",JLabel.CENTER);
		JLabel atk = new JLabel("ATK",JLabel.CENTER);
		JLabel def = new JLabel("DEF",JLabel.CENTER);
		JLabel spAtk = new JLabel("Sp. ATK",JLabel.CENTER);
		JLabel spDef = new JLabel("Sp. DEF",JLabel.CENTER);
		JLabel speed = new JLabel("SPEED",JLabel.CENTER);
		bHP = new JLabel("999",JLabel.CENTER);
		bAtk = new JLabel("999",JLabel.CENTER);
		bDef = new JLabel("999",JLabel.CENTER);
		bSpAtk = new JLabel("999",JLabel.CENTER);
		bSpDef = new JLabel("999",JLabel.CENTER);
		bSpeed = new JLabel("999",JLabel.CENTER);
		mHP = new JLabel("999",JLabel.CENTER);
		mAtk = new JLabel("999",JLabel.CENTER);
		mDef = new JLabel("999",JLabel.CENTER);
		mSpAtk = new JLabel("999",JLabel.CENTER);
		mSpDef = new JLabel("999",JLabel.CENTER);
		mSpeed = new JLabel("999",JLabel.CENTER);

		hpIV = new JTextField("31");
		atkIV = new JTextField("31");
		defIV = new JTextField("31");
		spAtkIV = new JTextField("31");
		spDefIV = new JTextField("31");
		speedIV = new JTextField("31");
		hpEV = new JTextField("0");
		atkEV = new JTextField("0");
		defEV = new JTextField("0");
		spAtkEV = new JTextField("0");
		spDefEV = new JTextField("0");
		speedEV = new JTextField("0");

		this.add(stats);
		this.add(hp);
		this.add(atk);
		this.add(def);
		this.add(spAtk);
		this.add(spDef);
		this.add(speed);
		this.add(max);
		this.add(mHP);
		this.add(mAtk);
		this.add(mDef);
		this.add(mSpAtk);
		this.add(mSpDef);
		this.add(mSpeed);
		this.add(base);
		this.add(bHP);
		this.add(bAtk);
		this.add(bDef);
		this.add(bSpAtk);
		this.add(bSpDef);
		this.add(bSpeed);
		this.add(IV);
		this.add(hpIV);
		this.add(atkIV);
		this.add(defIV);
		this.add(spAtkIV);
		this.add(spDefIV);
		this.add(speedIV);
		this.add(EV);
		this.add(hpEV);
		this.add(atkEV);
		this.add(defEV);
		this.add(spAtkEV);
		this.add(spDefEV);
		this.add(speedEV);

	}

	public StatsPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public StatsPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public StatsPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

}
