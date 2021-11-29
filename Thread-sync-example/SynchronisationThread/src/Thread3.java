class Thread3 extends Thread {
	Thread1 t1;

	Thread3(Thread1 t1) {
		this.t1 = t1;
	}

	public void run() {
		t1.printThread(10);
	}
}