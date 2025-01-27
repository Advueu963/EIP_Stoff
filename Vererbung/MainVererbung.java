package StoffZsf.Vererbung;

import java.util.Arrays;

public class MainVererbung {

	public static void main(String[] args) {
		Yasuo y = new Yasuo();
		Riven r = new Riven();
		System.out.println("Willkommen in der Kluft!");
		y.play(10);
		r.play(10);
		System.out.println("DEFEAT");
		System.out.println("Current player stats: ");
		outputCharacter(y);
        outputCharacter(r);
	}

    public static void outputCharacter(Character t) {
        System.out.println("Character Stats: " + Arrays.toString(t.currentStats()));
    }

}
