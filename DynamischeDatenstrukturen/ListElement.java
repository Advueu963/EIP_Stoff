package StoffZsf.DynamischeDatenstrukturen;

public class ListElement {
	private int element;
	private ListElement next;
	
	public ListElement(int e) {
		// Beachte: Konzept der Überladung
		element = e;
		next = null;
	}
	
	public ListElement(int e, ListElement next) {
		element = e;
		this.next = next;
	}
	public int getElement() {
		return element;
	}
	public void setElement(int element) {
		this.element = element;
	}
	public ListElement getNext() {
		return next;
	}
	public void setNext(ListElement next) {
		this.next = next;
	}
	
	
}
