
public class UserDefinedExceptionExample {

	public static void main(String[] args) throws UserDefinedCompileTimeException {

		int i = 10;

		if (i == 10) {
			throw new UserDefinedCompileTimeException("Data incorrect");
		}

	}

}
