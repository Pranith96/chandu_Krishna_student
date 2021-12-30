
public class SingletonLazy {

	private static SingletonLazy singleton = null;

	private SingletonLazy() {
		if (singleton != null) {
			throw new RuntimeException("Cannot create new Instance");
		}
	}

	public static SingletonLazy getInstance() {
		if (singleton == null) {
			singleton = new SingletonLazy();
		}
		return singleton;
	}
}
