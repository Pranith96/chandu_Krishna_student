package Synchronization;

public class ThreadSynchronousBlock {

	public void print(int num) {

		synchronized (this) {

			for (int i = 0; i < num; i++) {
				System.out.println(Thread.currentThread().getName() +": :"+ i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
