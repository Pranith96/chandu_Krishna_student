
public class TryCatchFinalExample2 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		try {
			System.out.println(a[5]);
			try {
				System.out.println(a[4]);
			} catch (ArrayIndexOutOfBoundsException ex) {
				ex.printStackTrace();
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("hi");
		}
	}

}
