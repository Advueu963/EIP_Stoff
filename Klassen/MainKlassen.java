package StoffZsf.Klassen;

public class MainKlassen {

	public static void main(String[] args) {
		Person p = new Person("Santo",21, 183);
		// Beachte die privaten Methoden von Person sind hier nicht sichtbar
		// Zu diesem ThemenBlock sind auf die Übungsblätter: 5, 6, (7)
		p.printPerson();
	}

}
