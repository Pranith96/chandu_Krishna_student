package in.synchronizedobject;

public class EvenDemo1 implements Runnable {

	@Override
	public void run() {
		Lock();
	}

	public void Lock() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread Name: " + Thread.currentThread().getName() + ": " + i);
			}
		}
	}

	public static void main(String[] args) {
		EvenDemo1 d = new EvenDemo1();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);

		EvenDemo1 d1 = new EvenDemo1();
		Thread t3 = new Thread(d1);

		t1.start();
		t2.start();
		t3.start();

	}
}
