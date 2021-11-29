package Synchronization;

public class ThreadSynchronousMethod {

	synchronized void printNum(int num) {

		for (int i = 0; i < num; i++) {
			System.out.println(Thread.currentThread().getName() + " ::" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
