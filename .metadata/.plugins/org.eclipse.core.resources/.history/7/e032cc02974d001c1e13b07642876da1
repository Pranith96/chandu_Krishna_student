
public class RunnableExample implements Runnable {

	public void run() {
		System.out.println(" Thread Running....!!");
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		RunnableExample runnableExample = new RunnableExample();
		Thread thread = new Thread(runnableExample);
		thread.start();
	}

}
