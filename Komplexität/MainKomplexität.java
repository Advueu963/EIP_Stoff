package StoffZsf.Komplexität;

import java.util.Arrays;
import java.util.Random;

/**
 * LEGENDE:
 * (Nummer) <=> nur bedingt wichtig für diesen Themenblock
 * Nummer <=> wichtig für diesen Themenblock
 * <Nummer> <=> Sehr wichtig für diesen Themenblock
 * 
 * ÜBUNGSBLÄTTER:
 * <9>
 * */
public class MainKomplexität {
	static final int n = 100;
	public static void main(String[] args) {
		int[] testArray = new int[n];
		Random r = new Random();
		for(int i = 0; i < n; i++) {
			testArray[i] = r.nextInt(50); // Zufällige Nummer zwischen 0 und (inklusive) 49
		}
		System.out.println("ARRAY: "+ Arrays.toString(testArray));

		
		n2_Komplexität(testArray);
		
		//n2_Komplexität2(testArray);
		
		//n1_Komplexität(testArray);
	}
	
	public static void n2_Komplexität(int[] array) {
		int res = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j ++) {
				res += array[i]*array[j];
			}
		}
		System.out.println("L2-Norm von array*(array^T): " + res);
	}
	
	public static void n2_Komplexität2(int[] array) {
		int res = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j ++) {
				res += array[i]*array[j];
				for(int k = 0; k < 2; k++) {
					System.out.println("Denken...");
				}
			}
		}
		System.out.println("L2-Norm von array*(array^T): " + res);
	}
	
	public static void n1_Komplexität(int[] array) {
		double res = 0;
		for(int i = 0; i < array.length; i++) {
			res += array[i]*array[i];
		}
		res = Math.sqrt(res);
		System.out.println("L2-Norm von array:" + res);
	}
	
	
	
}
