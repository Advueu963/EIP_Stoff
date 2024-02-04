package StoffZsf;

import java.util.Arrays;
/**
 * LEGENDE:
 * (Nummer) <=> nur bedingt wichtig für diesen Themenblock
 * Nummer <=> wichtig für diesen Themenblock
 * <Nummer> <=> Sehr wichtig für diesen Themenblock
 * 
 * ÜBUNGSBLÄTTER:
 * <4> 
 * */
public class ZusammengestetzteDatentypen {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(fillArray(10)));
		System.out.println(Arrays.toString(fillArrayWhile(10)));
		System.out.println(Arrays.toString(fillArrayDoWhile(10)));
		System.out.println(Arrays.toString(fillArrayUntilBreak(10)));
		System.out.println(Arrays.toString(fillArrayDoWhile(10)));

		System.out.println("-----");
		int[] array = {1,2,3,4,100,2,3};
		System.out.println("Array Input: " + Arrays.toString(array));
		System.out.println(badFindHundertInArray(array));
		System.out.println(goodFindHundertInArray(array));
	}
	public static int[] fillArray(int value) {
		//BEACHTE: Die Sichtbarkeit von i ist hier eine andere als bei fillArrayWhile
		int[] result = new int[10];
		for( int i = 0; i< result.length; i++) {
			result[i] = value;
		}
		return result;
	}
	public static int[] fillArrayWhile(int value) {
		int[] result = new int[10];
		int i = 0;
		while(i< result.length) {
			result[i] = value;
			i++;
		}
		return result;
	}
	public static int[] fillArrayDoWhile(int value) {
		int[] result = new int[10];
		int i = 0;
		do {
			result[i] = value;
		} while(++i < result.length);
		return result;
	}
	public static int[] fillArrayUntilBreak(int value) {
		int[] result = new int[10];
		int i = 0;
		while(true) {
			if (i < result.length) {
				result[i++] = value;
			} else {
				break;
			}
		}
		return result;
	}
	public static int[] fillArrayWithContinue(int value) {
		int[] result = new int[10];
		int i = 0;
		while(i < 20) {
			if (i < result.length) {
				result[i++] = value;
			} else {
				i++;
				continue;
			}
		}
		return result;
	}
	
	public static boolean badFindHundertInArray(int[] array) {
		boolean erg = false;
		for(int i = 0; i< 4; i++) {
			erg =  array[i] == 100 || erg;
		}
		return erg;
	}
	public static boolean goodFindHundertInArray(int[] array) {
		boolean erg = false;
		for(int i = 0; i< array.length; i++) {
			erg =  array[i] == 100 || erg;
		}
		return erg;
	}
	
}
