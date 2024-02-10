package StoffZsf.ThreadErklaerung;

public class ThreadMain5 implements Runnable {
    //KORREKTE IMPLEMENTIERUNG
	static int counter = 0;
	private static final Object test = new Object(); // expliziter Türsteher
	@Override
	public synchronized void run() {
			// this == Jede Tür ihr eigenes Schloss
			// ThreadMain.class == Jede Tür das selbe Schloss // impliziter Türsteher
			for (int i = 0; i < 2_000_000; i++) {
				++counter;
			}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadMain5 test = new ThreadMain5();
		Thread[] threads = new Thread[10];
		for(int i = 0; i < 10; i++) {
			// new ThreadMain() == 10 Türen
			// test == 1 Türe
			threads[i] = new Thread(test);
			threads[i].start();
		}
		
		for(int i = 0; i < 10; i++) {
			threads[i].join();
		}
		System.out.println(counter);
	}

}
