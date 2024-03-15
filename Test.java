package StoffZsf;

public class Test{
    int zaehler = 0;
    public synchronized void countup(){
        for(int i = 0; i<10; i++) {
            zaehler += i;
        }
    }
    public void test(){
        this.countup();
    }
    public static void main(String[] args) throws InterruptedException {
        Test t  = new Test();

    }

}
