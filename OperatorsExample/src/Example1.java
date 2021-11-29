
public class Example1 {

	public static void main(String[] args) {

		int a = 20;
		int b = 10;
		int c = 15;

		System.out.println(a > b && a < c); // false && false
		System.out.println(a > b || a < c);
		System.out.println(a < b && a++ < c);
		System.out.println(a > b | a++ < c);
		System.out.println(a > b & a++ < c);

		if (a > b) {
			System.out.println("Hi");
		} else {
			System.out.println("Hello");
		}

		//terinary
		String data = (a > b) ? "Hiii" : "Helloooo";
		System.out.println(data);

		//assigment
		int d = 10;
		d+=5; //d=d+5
		System.out.println(d);
		c-=d;
		System.out.println(c);
	}
}
