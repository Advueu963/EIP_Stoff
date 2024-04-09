package StoffZsf.FreieKlausurAufgaben;

public class List {

    Node first;

    public List() {
        first = null; // nicht nötig aber mal explizit hinzeschrieben. Das ist auch der Default Konstruktor, falls wir nichts hinschreiben.
    }


    // Aufgabe: Implemntieren sie eine append methode, sodass das neue Element value am Ende der Liste hinzugefügt wird.
    public void append(int value) {
        if(first == null) {
            first = new Node(value);
        } else {
            // Wir machen unseren üblichen cursor trick.
            Node cursor = first;
            while(cursor.next != null) {
                cursor = cursor.next; // so lange gehen wir die Liste durch bis wir bei dem vorletzten Element angekommen sind
            }
            cursor.next = new Node(value);

        }
    }


    // Aufgabe: Erzeuge eine Kopie der Liste und gibt diese zurück. "return this" gilt nicht :D
    // Gegeben: Die Methode "public void append (int value)", welches ein Element am Ende der Liste hinzufügt.
    public List copy() {
        List newList = new List();

        Node cursor = first;
        while(cursor.next != null) {
            newList.append(cursor.value);
            cursor = cursor.next;
        }
        // Vorletztes Element in Kopie hinzufügen
        newList.append(cursor.value);
        // Letztes Element ist ja null, also ist newList == this

        return newList;
    }




    class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
            this.next = null; // Nicht nötig. next ist durch obige Initialisierung automatisch null
        }
    }




    /**
     * Nicht Teil der Klausur und nur für TextAusgabe
     * */

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("List: ");

        Node cursor = first;
        while(cursor.next != null) {
            string.append(cursor.value);
            string.append(" --> ");
            cursor = cursor.next;
        }
        string.append(cursor.value);



        return string.toString();


    }
}
