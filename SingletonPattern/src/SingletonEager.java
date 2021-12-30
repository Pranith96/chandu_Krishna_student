
public class SingletonEager {

	private static SingletonEager singleton = new SingletonEager();

	private SingletonEager() {
		if (singleton != null) {
			throw new RuntimeException("Cannot create new Instance");
		}
	}

	public static SingletonEager getInstance() {
		return singleton;
	}
}

