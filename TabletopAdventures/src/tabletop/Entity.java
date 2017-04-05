package tabletop;

import race.Race;

public class Entity {
	
	private String name;
	private String hit_dice;
	private int current_hp;
	private int max_hp;
	private int temporary_hp;
	private int strength;
	private int constitution;
	private int dexterity;
	private int wisdom;
	private int intelligence;
	private int charisma;
	private int speed;
	private int ac;
	private EntitySize size;
	private Skillset skills;
	private Language[] languages;
	private Sense[] senses;
	private EntityAction[] actions;
	private Race race;
	private Alignment alignment;
	private DamageType[] dmg_resistances;
	private DamageType[] dmg_immunities;
	private Condition[] con_immunities;
	private Trait[] traits;
	private Feat[] feats;
	private String description;
	private Gait gait;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHitDice() {
		return hit_dice;
	}
	public void setHitDice(String hitDice) {
		hit_dice = hitDice;
	}
	public int getCurrentHp() {
		return current_hp;
	}
	public void setCurrentHp(int current_hp) {
		this.current_hp = current_hp;
	}
	public int getMaxHp() {
		return max_hp;
	}
	public void setMaxHp(int max_hp) {
		this.max_hp = max_hp;
	}
	public int getTemporaryHp() {
		return temporary_hp;
	}
	public void setTemporaryHp(int temporary_hp) {
		this.temporary_hp = temporary_hp;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getConstitution() {
		return constitution;
	}
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getWisdom() {
		return wisdom;
	}
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getCharisma() {
		return charisma;
	}
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getAc() {
		return ac;
	}
	public void setAc(int ac) {
		this.ac = ac;
	}
	public EntitySize getSize() {
		return size;
	}
	public void setSize(EntitySize size) {
		this.size = size;
	}
	public Skillset getSkills() {
		return skills;
	}
	public void setSkills(Skillset skills) {
		this.skills = skills;
	}
	public Language[] getLanguages() {
		return languages;
	}
	public void setLanguages(Language[] languages) {
		this.languages = languages;
	}
	public Sense[] getSenses() {
		return senses;
	}
	public void setSenses(Sense[] senses) {
		this.senses = senses;
	}
	public EntityAction[] getActions() {
		return actions;
	}
	public void setActions(EntityAction[] actions) {
		this.actions = actions;
	}
	public Race getRace() {
		return race;
	}
	public void setRace(Race race) {
		this.race = race;
	}
	public Alignment getAlignment() {
		return alignment;
	}
	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}
	public DamageType[] getDmgResistances() {
		return dmg_resistances;
	}
	public void setDmgResistances(DamageType[] dmg_resistances) {
		this.dmg_resistances = dmg_resistances;
	}
	public DamageType[] getDmgImmunities() {
		return dmg_immunities;
	}
	public void setDmgImmunities(DamageType[] dmg_immunities) {
		this.dmg_immunities = dmg_immunities;
	}
	public Condition[] getConImmunities() {
		return con_immunities;
	}
	public void setConImmunities(Condition[] con_immunities) {
		this.con_immunities = con_immunities;
	}
	public Trait[] getTraits() {
		return traits;
	}
	public void setTraits(Trait[] traits) {
		this.traits = traits;
	}
	public Feat[] getFeats() {
		return feats;
	}
	public void setFeats(Feat[] feats) {
		this.feats = feats;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Gait getGait() {
		return gait;
	}
	public void setGait(Gait gait) {
		this.gait = gait;
	}

}
