package StoffZsf.Deadlock;

public class Bogen {
    public Bogen() {
    }

    synchronized void getBogen(){
        System.out.println(Thread.currentThread().getName() + " hat den Bogen genommen");
    }
    synchronized void getBogen(Geige g){
        System.out.println(Thread.currentThread().getName() + " hat den Bogen genommen");
        g.getGeige();
    }

}
