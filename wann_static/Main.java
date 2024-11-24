package StoffZsf.wann_static;

public class Main {
    public static void main(String[] args) {
        MCDonalds lokal1 = new MCDonalds("Santo", 10, new Essen[]{

        });
        System.out.println(lokal1);

        MCDonalds lokal2 = new MCDonalds("Rocco", 20, new Essen[]{
                new Essen("MCFlurry", "Maschine geht eh immer nie.")
        });
        System.out.println(lokal2);
    }
}
