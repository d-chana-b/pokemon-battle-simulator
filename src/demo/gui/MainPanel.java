package demo.gui;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.*;

public class MainPanel extends JPanel {
	
	public MainPanel() {
		super();
		this.setBackground(Color.GRAY);
	}

	public MainPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public MainPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public MainPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

}
