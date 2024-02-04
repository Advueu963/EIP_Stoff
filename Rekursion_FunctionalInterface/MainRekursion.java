package StoffZsf.Rekursion_FunctionalInterface;

import java.util.Arrays;
import java.util.Random;

/**
 * LEGENDE:
 * (Nummer) <=> nur bedingt wichtig für diesen Themenblock
 * Nummer <=> wichtig für diesen Themenblock
 * <Nummer> <=> Sehr wichtig für diesen Themenblock
 * 
 * ÜBUNGSBLÄTTER:
 * <10>, <11>
 * */
public class MainRekursion {
	public static void main(String[] args) {
		int n = 10;
		int x  = 5;
		int[] testArray = new int[n];
		Random r = new Random();
		for(int i = 0; i < n; i++) {
			testArray[i] = r.nextInt(50); // Zufällige Nummer zwischen 0 und (inklusive) 49
		}
		System.out.println("ARRAY: "+ Arrays.toString(testArray));
		System.out.println("Addiert: " + rekursiveAddition(testArray));
		System.out.println("Suche nach " + x + " hat ergeben: " + rekursiveSuche(testArray,x));
		
		
		FunktionalRekursiv funktionalInterface = y -> {
			int erg = -1;
			if(y .length == 0 || y == null) {
				return erg;
			}
			erg = 0;
			for (int z : y) {
				erg +=z;
			}
			return erg;
		};
		System.out.println("Unsere funktionale Operation: "+ funktionalInterface.operation(testArray));
		
		FunktionalInterface functionalInterface2 = z -> System.out.println("Bin richtig gut gelaunt!");

		functionalInterface2.guteLaune(testArray);
		
	}
	// Rekursive Methoden haben immer den selben Aufbau:
	// 1.) Basisfall
	// 2.) Aufruf von der Methode selbst
	
	public static int rekursiveAddition(int[] array) {
		if(array == null || array.length == 0) { // 1.)
			return -1;
		}
		return array[array.length-1] + rekursiveAddition(Arrays.copyOf(array, array.length-1)); // 2.)
	}
	
	public static boolean rekursiveSuche(int[] array, int elem) {
		if(array == null || array.length == 0) { // 1.)
			return false;
		}
		return array[array.length-1] == elem || rekursiveSuche(Arrays.copyOf(array, array.length-1), elem); // 2.)
		
		
		
	}
	
	
}
