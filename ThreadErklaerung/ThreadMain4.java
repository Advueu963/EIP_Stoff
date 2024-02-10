package StoffZsf.ThreadErklaerung;

public class ThreadMain4 implements Runnable {
    //FALSCHE IMPLEMENTIERUNG
	static int counter = 0;
	private static final Object test = new Object(); // expliziter Türsteher
	@Override
	public synchronized void run() {
			for (int i = 0; i < 2_000_000; i++) {
				++counter;
			}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadMain4 test = new ThreadMain4();
		Thread[] threads = new Thread[10];
		for(int i = 0; i < 10; i++) {
			// new ThreadMain() == 10 Türen
			// test == 1 Türe
			threads[i] = new Thread(new ThreadMain4());
			threads[i].start();
		}
		
		for(int i = 0; i < 10; i++) {
			threads[i].join();
		}
		System.out.println(counter);
	}

}
