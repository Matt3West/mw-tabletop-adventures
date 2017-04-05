package tabletop;

import java.util.HashMap;

public class AgeProgression extends HashMap<String, Integer> {

	private static final long serialVersionUID = 1450876386450381524L;
	
	public AgeProgression () {
		this.put("Adult", 0);
		this.put("Middle Aged", 0);
		this.put("Old", 0);
		this.put("Venerable", 0);
		this.put("Death", 0);
	}
}
