package StoffZsf.Klassen;

public class Person {
	private String name;
	private int alter; 
	private int groeße;
	
	public Person() {}
	public Person(String n , int a, int groeße) {
		// Beachte: nur bei <groeße> ist das <this> zwingend notwendig.
		this.name = n;
		this.alter = a;
		this.groeße = groeße;
		
	}
	private void printName() {
		System.out.println("NAME: " + name);
	}
	private void printAlter() {
		System.out.println("ALTER: "+ alter);
	}
	private void printGroeße() {
		System.out.println("GROEßE: "+ groeße);
	}
	
	public void printPerson() {
		printName();
		printAlter();
		printGroeße();
	}
	
}
