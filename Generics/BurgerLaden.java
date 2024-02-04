package StoffZsf.Generics;

public class BurgerLaden<Lebensmittel extends ProductTypen> {
	public void kochen(Lebensmittel mittel) {
		System.out.println("Ich bereite zu: " + mittel.lebensmittelName() );
		switch(mittel.halteForm()) {
		
		case 1:
		case 2:
			System.out.println("Oke... wenn sie meinen");
			break;
		case 3:
		case 4:
			System.out.println("Das war bestimmt nicht günstig. Ich bin mal vorsichtig!");
			break;
			default:
				System.out.println("Yo das passt!");
		}
		for(int i = 0; i < mittel.zubereitungsDauer(); i++) {
			System.out.println("Bruzzel Bruzzel Bruzzel ... ");
		}
		System.out.println("Ihr Burger ist fertig!");
	}
}
