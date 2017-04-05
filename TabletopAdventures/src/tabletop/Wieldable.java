package tabletop;

public interface Wieldable {
	
	public int doAttack(int attack_roll, int stat_mod);
	
	public int doDamage(int damage_roll, int stat_mod);
	
	public WieldedType getWieldMethod();
	
	public String getDamageRoll ();

}
