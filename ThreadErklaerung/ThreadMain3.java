package StoffZsf.ThreadErklaerung;

public class ThreadMain3 implements Runnable {
    //FALSCHE IMPLEMENTIERUNG
	static int counter = 0;
	private static final Object test = new Object(); // expliziter Türsteher
	@Override
	public void run() {
		synchronized (this) {
			// this == Jede Tür ihr eigenes Schloss
			// ThreadMain.class == Jede Tür das selbe Schloss // impliziter Türsteher
			for (int i = 0; i < 2_000_000; i++) {
				++counter;
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadMain3 test = new ThreadMain3();
		Thread[] threads = new Thread[10];
		for(int i = 0; i < 10; i++) {
			// new ThreadMain() == 10 Türen
			// test == 1 Türe
			threads[i] = new Thread(new ThreadMain3());
			threads[i].start();
		}
		
		for(int i = 0; i < 10; i++) {
			threads[i].join();
		}
		System.out.println(counter);
	}

}
