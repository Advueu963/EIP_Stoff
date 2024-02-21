package StoffZsf.Deadlock;

public class Geige {



    synchronized void getGeige(){
        System.out.println(Thread.currentThread().getName() + " hat die Geige genommen");
    }
    synchronized void getGeige(Bogen b) {
        System.out.println(Thread.currentThread().getName() + " hat sich die Geige genommen");
        b.getBogen();
    }

}
