package Synchronization;

public class MainThreadClass {

	public static void main(String[] args) {

		final ThreadSynchronousBlock threadSynchronousBlock = new ThreadSynchronousBlock();
		//final ThreadSynchronousMethod threadSynchronousMethod =  new ThreadSynchronousMethod();

		Runnable runnable = new Runnable() {

			@Override
			public void run() {

				threadSynchronousBlock.print(5);
				//threadSynchronousMethod.printNum(5);

			}

		};

		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.start();
		thread2.start();
	}

}
