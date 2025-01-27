package StoffZsf.Streams_Ausnahmen;

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class MainStreamException {
	public static void main(String[] args) {
		int n = 10;
		int x  = 5;
		int[] testArray = new int[n];
		Random r = new Random();
		for(int i = 0; i < n; i++) {
			testArray[i] = r.nextInt(50); // Zufällige Nummer zwischen 0 und (inklusive) 49
		}
		
		//Arrays.stream(testArray) ist nur notwendig, weil testArray ein Array ist.
		System.out.println("ARRAY: "+ Arrays.toString(testArray));

		
		
		int[] elementeKleinerX = Arrays.stream(testArray).filter(y -> y < x).toArray();
		System.out.println("Alle elemente die kleiner als " + x + " sind: " + Arrays.toString(elementeKleinerX));
		System.out.println("Summe des Arrays ist : " + Arrays.stream(testArray).sum());
		
		
		// Hier das vielleicht noch mehr gewohne mit ArrayLists
		ArrayList<Integer> at = new ArrayList<>();
		for(int i : testArray) {
			at.add(i);
		}
		System.out.println("Alle elemente die kleiner als " + x + " sind: " + Arrays.toString(at.stream().filter(z -> z < x).toArray()));
		System.out.println("Summe des Arrays ist : " + at.stream().mapToInt(z -> z).sum());
		
		
		
		
		
		System.out.println("Ich zeige endlich die Division durch 0:");
		try {
			System.out.println("POWERRRRRRRRRRRRRRRR: " + 1 / 0);
		} catch(ArithmeticException e) {
			System.out.println("Schade. Durch 0 kann ich doch nicht teilen");
		} finally {
			System.out.println("Aber wieso eigentlich ??");
		}
		
		
		
		
		
	}

}
