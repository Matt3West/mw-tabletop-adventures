package race;

import java.util.HashMap;

import tabletop.Ability;
import tabletop.AgeProgression;
import tabletop.EntitySize;
import tabletop.Language;
import tabletop.Proficiency;
import tabletop.Sense;
import tabletop.Trait;

public class Race {
	
	private HashMap<Ability, Integer> racial_bonuses;
	private EntitySize size;
	private int speed;
	private AgeProgression age_prog;
	private Trait[] traits;
	private Proficiency[] proficiencies;
	private Sense[] senses;
	private Language[] languages;
	private String description;
	
	public Race() {
		this.racial_bonuses = new HashMap<Ability, Integer>();
	}
	
	public HashMap<Ability, Integer> getRacialBonuses() {
		return racial_bonuses;
	}
	public void setRacialBonuses(HashMap<Ability, Integer> racial_bonuses) {
		this.racial_bonuses = racial_bonuses;
	}
	public EntitySize getSize() {
		return size;
	}
	public void setSize(EntitySize size) {
		this.size = size;
	}
	public AgeProgression getAgeProg() {
		return age_prog;
	}
	public void setAgeProg(AgeProgression age_prog) {
		this.age_prog = age_prog;
	}
	public Trait[] getTraits() {
		return traits;
	}
	public void setTraits(Trait[] traits) {
		this.traits = traits;
	}
	public Proficiency[] getProficiencies() {
		return proficiencies;
	}
	public void setProficiencies(Proficiency[] proficiencies) {
		this.proficiencies = proficiencies;
	}
	public Sense[] getSenses() {
		return senses;
	}
	public void setSenses(Sense[] senses) {
		this.senses = senses;
	}
	public Language[] getLanguages() {
		return languages;
	}
	public void setLanguages(Language[] languages) {
		this.languages = languages;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
