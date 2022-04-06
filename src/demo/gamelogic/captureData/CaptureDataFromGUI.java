package demo.gamelogic.captureData;

import demo.gui.AbilityAndNaturePanel;
import demo.gui.LevalAndGenderPanel;
import demo.gui.StatsPanel;

public class CaptureDataFromGUI {
	
	
	public void capturePokemonDetail() {
		int level = Integer.valueOf(LevalAndGenderPanel.levelField.getText());
		String nature = (String) AbilityAndNaturePanel.natureDropDown.getSelectedItem();
		
		int HPIV = Integer.parseInt(StatsPanel.hpIV.getText());
		int HPEV = (int) Math.floor( Integer.parseInt(StatsPanel.hpEV.getText())/4);
		int atkIV = Integer.parseInt(StatsPanel.atkIV.getText());
		int atkEV = (int) Math.floor( Integer.parseInt(StatsPanel.atkEV.getText())/4);
		int defIV = Integer.parseInt(StatsPanel.defIV.getText());
		int defEV = (int) Math.floor( Integer.parseInt(StatsPanel.defEV.getText())/4);
		int spAtkIV = Integer.parseInt(StatsPanel.spAtkIV.getText());
		int spAtkEV = (int) Math.floor( Integer.parseInt(StatsPanel.spAtkEV.getText())/4);
		int spDefIV = Integer.parseInt(StatsPanel.spDefIV.getText());
		int spDefEV = (int) Math.floor( Integer.parseInt(StatsPanel.spDefEV.getText())/4);
		int speedIV = Integer.parseInt(StatsPanel.speedIV.getText());
		int speedEV = (int) Math.floor( Integer.parseInt(StatsPanel.speedEV.getText())/4);

	}

}
