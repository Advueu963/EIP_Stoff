package StoffZsf.Vererbung;

public abstract class Character {
	public abstract void vorstellen();
	public abstract int[] currentStats();
	public abstract void play(int length);
	
	protected int[] initStats() {
		int[] stats = {0, 0, 0};
		return stats;
	}
}
