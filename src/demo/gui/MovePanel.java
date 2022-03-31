package demo.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.*;

public class MovePanel extends JPanel {

	JTextField move1,move2,move3,move4;
	
	public MovePanel() {
		super();
		JLabel moveSlot1 = new JLabel("move 1: ");
		JLabel moveSlot2 = new JLabel("move 2: ");
		JLabel moveSlot3 = new JLabel("move 3: ");
		JLabel moveSlot4 = new JLabel("move 4: ");
		
		move1 = new JTextField();
		move2 = new JTextField();
		move3 = new JTextField();
		move4 = new JTextField();
		
		
		
		this.setBackground(Color.gray);
		this.setLayout(new GridLayout(4,2,10,10));
		this.add(moveSlot1);
		this.add(move1);
		this.add(moveSlot2);
		this.add(move2);
		this.add(moveSlot3);
		this.add(move3);
		this.add(moveSlot4);
		this.add(move4);
		
	}

	public MovePanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public MovePanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public MovePanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

}
