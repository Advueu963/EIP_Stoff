package StoffZsf.FreieKlausurAufgaben;

public class MyTree<X> {
    private final X value;

    private MyTree<X> left,right;

    public MyTree(X value) {
        this.value = value;
    }

    // Aufgabe: Implementiere eine rekursive Methode countEqualValues, welches die Anzahl von "value" im "searchTree" ausgibt.
    // Baum:        1
    //        1            2
    // Ausgabe: 2

    static int countEqualValues(MyTree<Integer> searchTree, int value) {
        if(searchTree == null) {
            return 0;
        }
        if(searchTree.value == value) {
            return countEqualValues(searchTree.left, value) + countEqualValues(searchTree.right, value) + 1;
        } else {
            return countEqualValues(searchTree.left, value) + countEqualValues(searchTree.right, value);
        }


    }


    public void setLeft(MyTree<X> left) {
        this.left = left;
    }

    public MyTree<X> getLeft() {
        return left;
    }

    public void setRight(MyTree<X> right) {
        this.right = right;
    }

    public MyTree<X> getRight() {
        return right;
    }
}
