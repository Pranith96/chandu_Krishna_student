
public class IfConditionExample1 {

	public static void main(String[] args) {

		int i = 10;
		boolean isTrue = true;
		boolean isFalse = false;

		// (<,<=,>=,==, !=,!>,!<)
		if (i > 5) {
			System.out.println("Hello");
		}

		if (i < 5) {
			System.out.println("Hello world");
		} else {
			System.out.println("Welcome");
		}

		if (!(i < 5)) {
			System.out.println("Hello world");
		} else {
			System.out.println("Welcome");
		}

		if (i >= 10) {
			System.out.println("Hello world...!!!");
		} else {
			System.out.println("Welcome.....!!!");
		}

		if (isTrue) {
			System.out.println("True Condition");
		}

		if (isFalse) {
			System.out.println("False condition.....!!");
		} else {
			System.out.println("True Condition...!!!");
		}

		if (!isFalse) {
			System.out.println("False condition.....!!");
		} else {
			System.out.println("True Condition...!!!");
		}

		if (i < 5) {
			if (isFalse) {
				System.out.println(".....!!!!.......");
			} else {
				System.out.println(".....&&&&&&&.......");
			}
		} else {
			System.out.println("............********.>>>>>>>>>");
		}

		if (i > 5) {
			if (isFalse) {
				System.out.println(".....!!!!.......");
			} else {
				System.out.println(".....&&&&&&&.......");
			}
		} else {
			System.out.println("............********.>>>>>>>>>");
		}
	}
}
