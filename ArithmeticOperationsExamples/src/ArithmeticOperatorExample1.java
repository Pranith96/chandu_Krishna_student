
public class ArithmeticOperatorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 5;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b); // 10%5 = 0

		System.out.println("------------------------------");

		int e = 10 * 10 / 5 + 3 - 1 * 4 / 2; // BODMAS // 10*2+3-1*2 // 20+3-2 == 23-2=21

		System.out.println(e);

		// left Shift operator Example
		System.out.println("--------------Left shift examples------------");

		System.out.println(10 << 2);// 10*2^2 = 10*4 = 40
		System.out.println(10 << 3); // 10*2^3 = 10*8 = 80
		System.out.println(20 << 2); // 20*2^2 = 20*4 = 80
		System.out.println(50 << 3);// 50*2^3 = 50*8 = 400

		System.out.println("--------------Right shift examples-----------");

		System.out.println(10 >> 2); // 10/2^2 = 10/4 = 5/2 = 2.5 = 2
		System.out.println(10 >> 3); // 10/2^3 = 10/ 8 = 1. = 1
		System.out.println(20 >> 2); // 20/2^2 = 20/4 =5
		System.out.println(50 >> 3); // 50/2^3 = 50/8 = 6. = 6

	}

}
