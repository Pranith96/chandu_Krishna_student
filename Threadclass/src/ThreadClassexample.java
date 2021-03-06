
public class ThreadClassexample extends Thread {

	public void run() {
		System.out.println(" Thread Running....!!");
		for(int i =0;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadClassexample threadClassexample = new ThreadClassexample();
		threadClassexample.start();
		ThreadClassexample threadClassexample1 = new ThreadClassexample();
		threadClassexample1.start();
		
		ThreadClassexample threadClassexample2 = new ThreadClassexample();
		threadClassexample2.start();
		threadClassexample2.setPriority(1);
		System.out.println(threadClassexample2.getPriority());
	}

}
