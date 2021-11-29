
public class UnaryOperatorExample2 {

	public static void main(String[] args) {

		int a = 50;
		int b = 50;
		
		System.out.println(a++ + ++a); // 50+52 = 102
		System.out.println(b++ + b++);// 50+51 = 101
	}

}
