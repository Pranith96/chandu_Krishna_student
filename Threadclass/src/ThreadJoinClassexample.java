
public class ThreadJoinClassexample extends Thread {

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

		ThreadJoinClassexample threadClassexample = new ThreadJoinClassexample();
		threadClassexample.start();
		threadClassexample.join();
		ThreadJoinClassexample threadClassexample1 = new ThreadJoinClassexample();
		threadClassexample1.start();
		
		ThreadJoinClassexample threadClassexample2 = new ThreadJoinClassexample();
		threadClassexample2.start();
	}

}
