package StoffZsf.FreieKlausurAufgaben;

import java.lang.Character.*;

import static java.lang.Character.isLowerCase;

public class MyLinkedList<X> {

    private final X value;
    MyLinkedList<X> next;


    public MyLinkedList(X value) {
        this.value = value;
    }

    // Aufgabe: prüfe rekursiv, ob alle Character in der Liste "list" kleinbuchstaben sind
    // Beachte immer den Fall von "null"
    static boolean allLowerCase(MyLinkedList<Character> list) {
        if (list == null) {
            return true;
        }


        return isLowerCase(list.value) && allLowerCase(list.next);
    }
}
