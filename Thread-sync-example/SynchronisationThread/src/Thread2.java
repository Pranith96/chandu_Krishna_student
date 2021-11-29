class Thread2 extends Thread {
	Thread1 t;

	Thread2(Thread1 t) {
		this.t = t;
	}

	public void run() {
		t.printThread(5);
	}
}


