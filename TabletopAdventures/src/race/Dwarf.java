package race;

import java.io.IOException;

import tabletop.Ability;
import tabletop.AgeProgression;
import tabletop.Dice;
import tabletop.EntitySize;
import utils.IOHelper;

public class Dwarf extends Race {

	public Dwarf () {
		super();
		
		// Get Dwarf Description
		try {
			setDescription(IOHelper.readFileToString("race_desc/dwarf.txt"));
		} catch (IOException e) {
			setDescription("No description found.");
			e.printStackTrace();
		}
		
		// Set Racial Bonuses
		getRacialBonuses().put(Ability.CONSTITUTION, 2);
		
		// Set Entity Size
		setSize(EntitySize.MEDIUM);
		
		// Set Age Progression
		AgeProgression age_prog = new AgeProgression();
		age_prog.put("Adult", 40);
		age_prog.put("Middle Aged", 125);
		age_prog.put("Old", 188);
		age_prog.put("Venerable", 250);
		age_prog.put("Death", 250 + (Dice.roll(2, 10) * 10) + Dice.roll(2, 10));
		setAgeProg(age_prog);
		
		// Set Speed
		setSpeed(25);
	}
	
}
