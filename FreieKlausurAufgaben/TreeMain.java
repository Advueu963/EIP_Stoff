package StoffZsf.FreieKlausurAufgaben;

public class TreeMain {


    public static void main(String[] args) {
        MyTree<Integer> tree = new MyTree<>(1);
        tree.setLeft(new MyTree<>(1));
        tree.setRight(new MyTree<>(2));
        tree.getLeft().setRight(new MyTree<>(2));
        tree.getLeft().setLeft(new MyTree<>(3));

        System.out.println("Number of 1: " + MyTree.countEqualValues(tree, 1));
        System.out.println("Number of 2: " + MyTree.countEqualValues(tree, 2));
        System.out.println("Number of 3: " + MyTree.countEqualValues(tree, 3));



    }
}
