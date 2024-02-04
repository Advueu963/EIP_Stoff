package StoffZsf.Generics;
/**
 * LEGENDE:
 * (Nummer) <=> nur bedingt wichtig für diesen Themenblock
 * Nummer <=> wichtig für diesen Themenblock
 * <Nummer> <=> Sehr wichtig für diesen Themenblock
 * 
 * ÜBUNGSBLÄTTER:
 * <11> 
 * */
public class MainGeneric {
	public static void main(String[] args) {
		Huhn h = new Huhn();
		Rind r = new Rind();
		Falafel f = new Falafel();
		BurgerLaden<ProductTypen> t = new BurgerLaden<>();
		
		t.kochen(h);
		System.out.println();
		t.kochen(r);
		System.out.println();
		t.kochen(f);
		
		BurgerLaden<Huhn> ht = new BurgerLaden<>();
		ht.kochen(h);
		// Die folgenden Aufrufe gehen dann nicht, weil ht als Generic Huhn hat und nicht ProductTypen!
		//ht.kochen(r);
		//ht.kochen(f);
		
	}
}
