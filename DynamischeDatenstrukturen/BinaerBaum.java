package StoffZsf.DynamischeDatenstrukturen;

public class BinaerBaum {
	private Knoten wurzel;
	
	public BinaerBaum() {
		wurzel = null;
	}
	public BinaerBaum(Knoten w) {
		wurzel = w;
	}
	
	public void append(int element) {
		if(wurzel == null) {
			wurzel = new Knoten(element);
		} else {
			if(wurzel.getElement() == element) {
				// nichts doppelt einfügen
				// deswegen nichts machen
			} else {
				if(wurzel.getElement() > element) {
					if (wurzel.getLeft() == null) {
						wurzel.setLeft(new BinaerBaum(new Knoten(element)));
					} else {
						wurzel.getLeft().append(element);

					}
				} else {
					if (wurzel.getRight() == null) {
						wurzel.setRight(new BinaerBaum(new Knoten(element)));
					} else {
						wurzel.getRight().append(element);

					}
				}
			}
		}
	}
	public void toConsole() {
		if(wurzel == null) {
			System.out.print("Wurzel: EMPTY");

		} else {
			System.out.print("Wurzel: " + wurzel.getElement());
			System.out.print("\nLINKER BAUM: ");
			if(wurzel.getLeft() != null) {
				wurzel.getLeft().toConsole();
	
			} else {
				System.out.print("EMPTY");
			}
			System.out.print("\nRECHTER BAUM: ");
			if(wurzel.getRight() != null) {
				wurzel.getRight().toConsole();
	
			} else {
				System.out.println("EMPTY");
			}
		}
	}
	
	/**
	 * 
	 * Der hier folgende Code geht über den Stoff hinaus, welcher in der Vorlesung behandelt wurde (meiner Meinung nach).
	 * Daher ist das Verständnis (im Sinne von wieso) nicht relevant.
	 * Grundsätzlich sollten jedoch die Programmierbestandteile durchaus vertraut sein.
	 * Falls ihr Fragen bein durchlesen bekommt oder doch nicht versteht wieso das ganze so funktioniert fragt gerne nach: S.Thies@campus.lmu.de
	 * Jedoch würde ich für meine Klausurvorbereitung nicht zwingend auf die hier zwei folgenden Funktionen (besonders beim Zeitstress) achten.
	 * 
	 * */
	
	private Knoten getRightmostOfLeft() {
		// Gesichert das wurzel mindestens einen Knoten im  linken Teilbaum hat (vgl. remove-Aufruf)
		
		BinaerBaum cursor = wurzel.getLeft();
		BinaerBaum cursor2 = wurzel.getLeft(); // dieser wird einen Schritt hinter cursor hinterher hängen
		
		while(cursor.wurzel.getRight() != null) {
			cursor = cursor.wurzel.getRight();
			if(cursor2.wurzel.getRight() != cursor) {
				cursor2 = cursor2.wurzel.getRight();
			}
		}
		// Sind jetzt im rechtesten Knoten mit cursor
		cursor.wurzel.setRight(cursor.wurzel.getLeft());
		// gib einen isolierten Knoten zurück
		return new Knoten(cursor.wurzel.getElement());
		
		
		
	}
	
	public void remove(int element) {
		if (wurzel == null) {
			return;
		}
		if (wurzel.getElement() == element) {
			// 0.Fall Wurzel hat weder linken noch rechten Baum
			if(wurzel.getLeft() == null && wurzel.getRight() == null) {
				wurzel =null;
				return;
			}
			
			// 1.Fall Wurzel hat keinen Linken Baum
			if(wurzel.getLeft() == null) {
				wurzel = wurzel.getRight().wurzel;
				return;
			}
			// 2.Fall Wurzel hat keinen rechten Baum
			if(wurzel.getRight() == null) {
				wurzel = wurzel.getLeft().wurzel;
				return;
			}
			// 3.Fall Wurzel hat sowohl linken als auch rechten Baum
			Knoten newWurzel = getRightmostOfLeft();
			// Wir haben auch sichergestellt das newWurzel
			wurzel.getLeft().remove(newWurzel.getElement());
			
			
			newWurzel.setLeft(wurzel.getLeft());
			newWurzel.setRight(wurzel.getRight());
			wurzel = newWurzel;			
			
			
		} else {
			if(wurzel.getElement() > element) {
				// element muss im linken Baum liegen
				if(wurzel.getLeft() == null) {
					return;
				} else {
					wurzel.getLeft().remove(element);
				}
			} else {
				// element muss im rechten Baum liegen
				if(wurzel.getRight() == null) {
					return;
				} else {
					wurzel.getRight().remove(element);
				}
			}
		}

	}
	
	
	
	
}
