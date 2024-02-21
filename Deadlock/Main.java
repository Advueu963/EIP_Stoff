package StoffZsf.Deadlock;

public class Main {
    public static void main(String[] args) {
        Geige g = new Geige();
        Bogen b = new Bogen();
        Geiger g1 = new Geiger(g,b,true);
        Geiger g2 = new Geiger(g,b,false);

        Thread th1 = new Thread(g1);
        Thread th2 = new Thread(g2);

        th1.start();
        th2.start();

        System.out.println(Thread.currentThread().getName() + " DONE");


    }
}
