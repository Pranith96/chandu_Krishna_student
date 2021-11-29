import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of Elements:");
		int num = sc.nextInt();
		int data[] = new int[num];

		System.out.println("Enter Data Elements:");
		for (int i = 0; i < num; i++) {
			data[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(data));
	}
}
