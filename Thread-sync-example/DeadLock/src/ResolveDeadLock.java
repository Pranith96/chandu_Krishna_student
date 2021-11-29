
public class ResolveDeadLock {

	public static void main(String[] args) {

		final String resource1 = "Pranith";
		final String resource2 = "Jahnavi";

		Thread thread1 = new Thread() {
			public void run() {

				synchronized (resource2) {
					System.out.println("Thread1 is locked resource2");
					try {
						Thread.sleep(3000);
					} catch (Exception e) {
					}

					synchronized (resource1) {
						System.out.println("Thread1 is locked resource1");
					}
				}
			}
		};

		Thread thread2 = new Thread() {
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread2 is locked resource2");
					try {
						Thread.sleep(3000);
					} catch (Exception e) {
					}
					synchronized (resource1) {
						System.out.println("Thread2 is locked resource1");
					}
				}
			}
		};
		thread1.start();
		thread2.start();
	}
}
