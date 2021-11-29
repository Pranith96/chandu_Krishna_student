
public class Thread1 {

	void printThread(int n) {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(n * i);
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		System.out.println("hi");
		System.out.println("Hello");

	}
}

class Thread2 extends Thread {
	Thread1 t;

	Thread2(Thread1 t) {
		this.t = t;
	}

	public void run() {
		t.printThread(5);
	}
}

class Thread3 extends Thread {
	Thread1 t1;

	Thread3(Thread1 t1) {
		this.t1 = t1;
	}

	public void run() {
		t1.printThread(10);
	}
}

class MainSynchronized {
	public static void main(String[] args) {
		Thread1 obj = new Thread1();
		Thread2 thread2 = new Thread2(obj);
		Thread3 thread3 = new Thread3(obj);
		thread2.start();
		thread3.start();

	}
}
