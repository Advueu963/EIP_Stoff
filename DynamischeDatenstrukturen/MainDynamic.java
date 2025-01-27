package StoffZsf.DynamischeDatenstrukturen;


public class MainDynamic {
	public static void main(String[] args) {
		BinaerBaum b = new BinaerBaum();
		Queue q = new Queue();
		Stack s = new Stack();
		int[] elements = {2,5,6,3,9,10,1};
		
		for(int i = 0; i < elements.length; i++) {
			b.append(elements[i]);
			q.append(elements[i]);
			s.append(elements[i]);
		}
		
		System.out.println("Queue: ");
		q.toConsole();		
		System.out.println("-----");

		System.out.println("Stack: ");
		s.toConsole();
		System.out.println("-----");

		System.out.println("Baum: ");
		b.toConsole();
		System.out.println("-----");
		
		
		q.remove(5);
		s.remove(5);
		b.remove(5);
		
		
		System.out.println("Queue: ");
		q.toConsole();		
		System.out.println("-----");

		System.out.println("Stack: ");
		s.toConsole();
		System.out.println("-----");

		System.out.println("Baum: ");
		b.toConsole();
		System.out.println("-----");

		
		
	}
}
