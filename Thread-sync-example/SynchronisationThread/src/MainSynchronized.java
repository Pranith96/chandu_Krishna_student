
class MainSynchronized {
	public static void main(String[] args) {
		Thread1 obj = new Thread1();
		Thread2 thread2 = new Thread2(obj);
		Thread3 thread3 = new Thread3(obj);
		thread2.start();
		thread3.start();
	}
}