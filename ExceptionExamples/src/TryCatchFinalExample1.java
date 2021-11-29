
public class TryCatchFinalExample1 {

	public static void main(String[] args) {

		int i = 10;

		try {
			int b = i / 0; // ArithmeticException
			System.out.println("result: " + b + " " + i);
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Hello world");
		}

		System.out.println("Hello");

	}

}
