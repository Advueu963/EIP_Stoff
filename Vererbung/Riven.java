package StoffZsf.Vererbung;

import java.util.Random;

public class Riven extends Character{
	private int[] stats = new int[3];
	public Riven() {
		stats = initStats();
	}
	
	@Override
	public void vorstellen() {
		// TODO Auto-generated method stub
		System.out.println("Ich bin einfach op! Da gibt es nichts zu diskutieren!");
	}
	

	@Override
	public int[] currentStats() {
		// TODO Auto-generated method stub
		return stats;
	}

	@Override
	public void play(int length) {
		// TODO Auto-generated method stub
		Random r = new Random();
		for(int i = 0; i< length; i++) {
			stats[0] += i;
			stats[1] += Math.round(r.nextInt(2));
		}
		
	}
}
