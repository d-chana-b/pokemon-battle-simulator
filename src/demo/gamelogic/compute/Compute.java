package demo.gamelogic.compute;

import demo.gui.AbilityAndNaturePanel;
import demo.gui.LevalAndGenderPanel;
import demo.gui.StatsPanel;
import demo.model.Pokemon;

public class Compute {

	public void computeStats(Pokemon pokemon) {

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

		double atkNature = 1, defNature = 1, spAtkNature = 1, spDefNature = 1, speedNature = 1;

		if (nature.equals("Lonely")) {
			atkNature = 1.1;
			defNature = 0.9;
		}
		if (nature.equals("Brave")) {
			atkNature = 1.1;
			speedNature = 0.9;
		}
		if (nature.equals("Adamant")) {
			atkNature = 1.1;
			spAtkNature = 0.9;
		}
		if (nature.equals("Naughty")) {
			atkNature = 1.1;
			spDefNature = 0.9;
		}
		if (nature.equals("Bold")) {
			defNature = 1.1;
			atkNature = 0.9;
		}
		if (nature.equals("Relaxed")) {
			defNature = 1.1;
			speedNature = 0.9;
		}
		if (nature.equals("Impish")) {
			defNature = 1.1;
			spAtkNature = 0.9;
		}
		if (nature.equals("Lax")) {
			defNature = 1.1;
			spDefNature = 0.9;
		}
		if (nature.equals("Timid")) {
			speedNature = 1.1;
			atkNature = 0.9;
		}
		if (nature.equals("Hasty")) {
			speedNature = 1.1;
			defNature = 0.9;
		}
		if (nature.equals("Jolly")) {
			speedNature = 1.1;
			spAtkNature = 0.9;
		}
		if (nature.equals("Naive")) {
			speedNature = 1.1;
			spDefNature = 0.9;
		}
		if (nature.equals("Modest")) {
			spAtkNature = 1.1;
			atkNature = 0.9;
		}
		if (nature.equals("Mild")) {
			spAtkNature = 1.1;
			defNature = 0.9;
		}
		if (nature.equals("Quiet")) {
			spAtkNature = 1.1;
			speedNature = 0.9;
		}
		if (nature.equals("Rash")) {
			spAtkNature = 1.1;
			spDefNature = 0.9;
		}
		if (nature.equals("Calm")) {
			spDefNature = 1.1;
			atkNature = 0.9;
		}
		if (nature.equals("Gentle")) {
			spDefNature = 1.1;
			defNature = 0.9;
		}
		if (nature.equals("Sassy")) {
			spDefNature = 1.1;
			speedNature = 0.9;
		}
		if (nature.equals("Careful")) {
			spDefNature = 1.1;
			spAtkNature = 0.9;
		}
		int maxHP = (int) Math.floor((2 * pokemon.getBaseHP() + HPIV + HPEV) * level / 100 + level + 10);

		int maxAtk = (int) Math.floor(Math.floor((2 * pokemon.getBaseAtk() + atkIV + atkEV) * level / 100 + 5) * atkNature);
		int maxDef = (int) Math.floor(Math.floor((2 * pokemon.getBaseDef() + defIV + defEV) * level / 100 + 5) * defNature);
		int maxSpAtk = (int) Math
				.floor(Math.floor((2 * pokemon.getBaseSpAtk() + spAtkIV + spAtkEV) * level / 100 + 5) * spAtkNature);
		int maxSpDef = (int) Math
				.floor(Math.floor((2 * pokemon.getBaseSpDef() + spDefIV + spDefEV) * level / 100 + 5) * spDefNature);
		int maxSpeed = (int) Math
				.floor(Math.floor((2 * pokemon.getBaseSpeed() + speedIV + speedEV) * level / 100 + 5) * speedNature);
		
		StatsPanel.mHP.setText(String.valueOf(maxHP));
		StatsPanel.mAtk.setText(String.valueOf(maxAtk));
		StatsPanel.mDef.setText(String.valueOf(maxDef));
		StatsPanel.mSpAtk.setText(String.valueOf(maxSpAtk));
		StatsPanel.mSpDef.setText(String.valueOf(maxSpDef));
		StatsPanel.mSpeed.setText(String.valueOf(maxSpeed));
	}
}
