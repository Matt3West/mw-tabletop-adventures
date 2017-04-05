package tabletop;

import java.util.Random;

public class Dice {
	
	public static int roll(int num_dice, int num_sides) {
		int total = 0;
		
		for(int i = 0; i < num_dice; i++) {
			Random rand = new Random();
			total += rand.nextInt(num_sides) + 1;
		}
		return total;
	}

}
