import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonPatternExample {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		SingletonEager singletonEager1 = SingletonEager.getInstance();
		SingletonEager singletonEager2 = SingletonEager.getInstance();
		
		System.out.println(singletonEager1.hashCode() + " :: " + singletonEager2.hashCode());

		SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
		SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
		
		System.out.println(singletonLazy1.hashCode() + " :: " + singletonLazy2.hashCode());
		
		// Using reflections we can access private methods or constructors or members, so we can violate privae constructors in Singleton
		
		Class clazz = Class.forName("SingletonLazy");
		Constructor<SingletonLazy> ctos = clazz.getDeclaredConstructor();
		ctos.setAccessible(true);
		SingletonLazy SingletonLazy = ctos.newInstance();
		System.out.println(SingletonLazy.hashCode());
		
	}

}
