package tabletop;

public class Sense {
	
	private int distance;
	
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public void applySenses(Entity entity) {
		// CHECKME: Is this code editing the tile in percieved level?
		GameLevel level = entity.getPercievedLevel();
		for(int x = entity.getPos()[0] - getDistance(); x < entity.getPos()[0] + getDistance(); x++) {
			for(int y = entity.getPos()[1] - getDistance(); y < entity.getPos()[1] + getDistance(); y++){
				String[] tile_flags = level.getTileAtPos(x, y).getFlags();
				level.getTileAtPos(x, y).setFlags(processFlags(tile_flags));
			}
		}
	}
	
	protected String[] processFlags(String[] tile_flags) {
		System.out.println("ERROR: PLEASE OVERWRITE METHOD 'processFlags' WHEN EXTENDING 'Sense'");
		return new String[0];
	}

}
