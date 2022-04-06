package demo.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.*;

public class DisplayPokemonMoveListPanel extends JPanel {

	// sample langs
	String data[][] = { { "BITE", "DARK", "60", "100", "25" }, { "BITE", "DARK", "60", "100", "25" },
			{ "BITE", "DARK", "60", "100", "25" } };
	String column[] = { "NAME", "TYPE", "POWER", "ACCURACY", "PP" };
	JTable jt = new JTable(data, column);
	JScrollPane sp = new JScrollPane(jt);


	public DisplayPokemonMoveListPanel() {
		super();
		
		//table, linisin mo na lang pag ok na
		jt.setFillsViewportHeight(true);
		
		JPanel levelUpMovesPanel = new JPanel();
		levelUpMovesPanel.setBackground(Color.red);
		levelUpMovesPanel.setLayout(new BorderLayout());
		levelUpMovesPanel.add(sp,BorderLayout.CENTER);

		JPanel TMMovesPanel = new JPanel();
		TMMovesPanel.setBackground(Color.blue);

		JPanel eggMovesPanel = new JPanel();
		eggMovesPanel.setBackground(Color.yellow);

		JTabbedPane tp = new JTabbedPane();
		tp.add("level up Moves", levelUpMovesPanel);
		tp.add("TM/HM Moves", TMMovesPanel);
		tp.add("egg Moves", eggMovesPanel);

		this.setLayout(new BorderLayout());
		this.add(tp, BorderLayout.CENTER);
	}

	public DisplayPokemonMoveListPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public DisplayPokemonMoveListPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public DisplayPokemonMoveListPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

}
