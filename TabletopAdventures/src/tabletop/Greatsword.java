package tabletop;

public class Greatsword extends Equipment implements Wieldable {

	private final WieldedType wield_method = WieldedType.TWO_HANDED;
	private final String damage_roll = "2d6:s";
	private final String[] flags = {"melee", "heavy"};
	private final Proficiency proficiency = Proficiency.MARTIAL;
	
	public Greatsword () {
		super();
		this.setName("Greatsword");
		this.setWeight(6);
		this.setValue(50);
	}

	@Override
	public int doAttack(int attack_roll, int stat_mod) {
		return attack_roll + stat_mod;
	}

	@Override
	public int doDamage(int damage_roll, int stat_mod) {
		return damage_roll + stat_mod;
	}

	@Override
	public WieldedType getWieldMethod() {
		return this.wield_method;
	}

	@Override
	public String getDamageRoll() {
		return this.damage_roll ;
	}

	public String[] getFlags() {
		return flags;
	}

	public Proficiency getProficiency() {
		return proficiency;
	}

}
