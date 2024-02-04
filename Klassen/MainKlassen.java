package StoffZsf.Klassen;

public class MainKlassen {
	/**
	 * LEGENDE:
	 * (Nummer) <=> nur bedingt wichtig für diesen Themenblock
	 * Nummer <=> wichtig für diesen Themenblock
	 * <Nummer> <=> Sehr wichtig für diesen Themenblock
	 * 
	 * ÜBUNGSBLÄTTER:
	 * 5,<6>,7,<8> 
	 * */
	public static void main(String[] args) {
		Person p = new Person("Santo",21, 183);
		// Beachte die privaten Methoden von Person sind hier nicht sichtbar
		// Zu diesem ThemenBlock sind auf die Übungsblätter: 5, 6, (7)
		p.printPerson();
	}

}
