package StoffZsf;
/**
 * LEGENDE:
 * (Nummer) <=> nur bedingt wichtig für diesen Themenblock
 * Nummer <=> wichtig für diesen Themenblock
 * <Nummer> <=> Sehr wichtig für diesen Themenblock
 * 
 * ÜBUNGSBLÄTTER:
 * 3,4
 * */

public class Kontrollfluss {
	public static void main(String[] args) {
		int number = 100;
		System.out.println(getFunctionApprox(number));
		System.out.println(getFunctionApproxSwitch(number));
		System.out.println(getFunctionApproxShort(number));
	}
	public static int getFunctionApprox(int x) {
		if (x < 5) {
			return 5*x + 3;
		} else {
			return x*x + 10*x + 3;
		}
	}
	public static int getFunctionApproxSwitch(int x) {
		switch(x) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			return 5*x + 3;
		default:
			return x*x + 10*x + 3;
		}
	}
	
	public static int getFunctionApproxShort(int x) {
		// just a good to know. Nicht alzu wichtig
		return x < 5 ? 5*x + 3 : x*x + 10*x + 3;
	}
	
	
}
