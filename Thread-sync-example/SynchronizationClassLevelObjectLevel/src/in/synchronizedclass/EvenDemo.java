package in.synchronizedclass;

public class EvenDemo implements Runnable {

	@Override
	public void run() {		
		Lock();
	}
	// for class level synchonization method should be static synchronize
	public synchronized static void Lock() {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread Name: " + Thread.currentThread().getName() +": "+ i);
			}
	}
	
	public static void main(String[] args) {
		EvenDemo d = new EvenDemo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		EvenDemo d1 = new EvenDemo();
		Thread t3 = new Thread(d1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
