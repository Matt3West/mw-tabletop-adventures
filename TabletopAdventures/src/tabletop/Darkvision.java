package tabletop;

public class Darkvision extends Sense {
	
	public Darkvision () {
		setDistance(60);
	}
	
	@Override
	protected String[] processFlags(String[] tile_flags) {
		String[] new_tile_flags = new String[tile_flags.length];
		for(int i = 0; i < tile_flags.length; i++){
			String old_tile_flag = tile_flags[i];
			if (old_tile_flag.matches("dim_light")) {
				new_tile_flags[i] = "bright_light";
			} else if (old_tile_flag.matches("darkness")) {
				new_tile_flags[i] = "dim_light";
			} else {
				new_tile_flags[i] = old_tile_flag;
			}
		}
		return new_tile_flags;
	}
}
