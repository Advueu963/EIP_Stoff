package StoffZsf.Deadlock;

public class Geiger implements Runnable{

    Geige geige;
    Bogen bogen;
    boolean geigeFirst;
    public Geiger(Geige geige, Bogen bogen, boolean geigeFirst) {
        this.geige = geige;
        this.bogen = bogen;
        this.geigeFirst = geigeFirst;
    }

    synchronized void playGeige() throws InterruptedException {
        if(geigeFirst) {
            geige.getGeige(bogen);
        } else {
            bogen.getBogen(geige);
        }
        System.out.println(Thread.currentThread() + " spielt die Geige wunderschön.");
    }
    @Override
    public void run() {
        try {
            playGeige();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
