package StoffZsf.DynamischeDatenstrukturen;

public class Knoten {
	private int element;
	private BinaerBaum left,right;
	public Knoten(int value) {
		this.element = value;
		left = right = null; // Das ist wie: left = null; right = null;
	}
	public Knoten(int value, BinaerBaum left) {
		this.element = value;
		this.left = left; 
		this.right = null;
	}
	public Knoten(int value, BinaerBaum left, BinaerBaum right) {
		this.element = value;
		this.left = left; 
		this.right = right;
	}
	public int getElement() {
		return element;
	}
	public void setElement(int element) {
		this.element = element;
	}
	
	public BinaerBaum getLeft() {
		return left;
	}
	public void setLeft(BinaerBaum left) {
		this.left = left;
	}
	
	public BinaerBaum getRight() {
		return right;
	}
	public void setRight(BinaerBaum right) {
		this.right = right;
	}
	

}
