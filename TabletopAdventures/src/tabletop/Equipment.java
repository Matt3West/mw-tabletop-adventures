package tabletop;

public class Equipment {
	
	private String name;
	private int weight;
	private int value;
	
	public Equipment() {
		this.setName("NO_NAME");
		this.setWeight(0);
		this.setValue(0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	

}
