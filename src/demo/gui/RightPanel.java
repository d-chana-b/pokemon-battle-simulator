package demo.gui;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.*;

public class RightPanel extends JPanel {

	JLabel label = new JLabel("Pokemon Slot 1");
	
	public RightPanel() {
		super();
		this.setBackground(Color.blue);
		this.add(label);
	}

	public RightPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public RightPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public RightPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

}
