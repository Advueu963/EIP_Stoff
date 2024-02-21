package StoffZsf;
import java.util.Arrays;
import java.util.Random;
/**
 * LEGENDE:
 * (Nummer) <=> nur bedingt wichtig für diesen Themenblock
 * Nummer <=> wichtig für diesen Themenblock
 * <Nummer> <=> Sehr wichtig für diesen Themenblock
 * 
 * ÜBUNGSBLÄTTER:
 * (1), <2>
 * */
public class EigenschaftenAlgo {
	public static void main(String[] args) {
		System.out.println("-----");
		/*TERMINIERUNG / NICHT TERMINIERUNG*/
		System.out.println(terminiert(42));
		//nichtTerminiert();
        String[] aufgabe = {"A1","A2"};
        //System.out.println(Arrays.toString(nichtTerminierend(aufgabe)));
        

		System.out.println("-----");
		/* DETERMINIERT / NICHT DETERMINIERT*/
		System.out.println(determiniert(42));
		System.out.println(nichtDeterminiert(42));
		System.out.println("-----");
		/*DETERMINISTISCH / NICHT DETERMINISTISCH*/
		System.out.println(deterministisch(42));
		System.out.println(nichtDeterminitisch(42));
		System.out.println("-----");

	}

    public static boolean[] nichtTerminierend(String[] aufgaben) {
        // Ist determiniert, deterministisch
        int aktuelleAufgabe = 0;
        boolean[] geloest = new boolean[aufgaben.length];
        while(aktuelleAufgabe < aufgaben.length && !geloest[aktuelleAufgabe]) {
            System.out.println("PANIK");
            Random rand = new Random();
            aktuelleAufgabe = rand.nextInt(aufgaben.length);
        }
        return geloest;
    }


	
	
	public static int terminiert( int y) {
		int x = 10;
		return x + y;
	}
	public static void nichtTerminiert() {
		while(true) {
			System.out.println("TOO INFINITY AND BEYOND!");
		}
	}
	
	public static int determiniert(int x ) {
		if (x < 10) {
			return x;
		} else {
			return 10;
		}
	}
	public static int nichtDeterminiert(int x) {
		Random r = new Random();
		return x + r.nextInt();
	}
	
	public static int deterministisch(int x) {
		Random r = new Random();
		int y = x * x + 10*x -5;
		return r.nextInt() + y;
	}
	public static int nichtDeterminitisch(int x) {
		Random r = new Random();
		int y = x * x + 10*x -5;
		if (y < r.nextInt()) {
			return y;
		} else {
			return y * (-1);
		}
	}

	
}
