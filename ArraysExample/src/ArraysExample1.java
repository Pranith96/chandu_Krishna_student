import java.util.Arrays;

public class ArraysExample1 {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(a));

		int size = 5;
		int[] b = new int[size]; // 0-4
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		b[3] = 4;
		b[4] = 5;
		System.out.println(Arrays.toString(b));

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
