package demo.gui;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.*;

public class LeftPanel extends JPanel {

	JLabel label = new JLabel("Pokemon Slot 1");
	
	public LeftPanel() {
		super();
		this.setBackground(Color.blue);
		this.add(label);
	}

	public LeftPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public LeftPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public LeftPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

}
