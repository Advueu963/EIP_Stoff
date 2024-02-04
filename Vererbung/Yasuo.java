package StoffZsf.Vererbung;

import java.util.Random;

public class Yasuo extends Character{
	private int[] stats = new int[3];
	public Yasuo() {
		stats = initStats();
	}
	
	@Override
	public void vorstellen() {
		// TODO Auto-generated method stub
		System.out.println("Ich bin wirklich kein Troll!\n Ich bin der stärkste Charakter!");
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
			stats[1] += i;
			stats[0] += Math.round(r.nextInt(2));
		}
		
	}
	
}
