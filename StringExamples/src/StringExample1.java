
public class StringExample1 {

	public static void main(String[] args) {

		String s = "Hi"; // String laterals
		String s1 = new String("Hi"); // Heap
		String s2 = "Hi";
		String s3 = "hi";
		String[] s7 = {"a","b","c","d"};
		
		System.out.println(s7);
		
		// == reference check
		if (s == s1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (s == s2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// .equals() data check
		if (s.equals(s1)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// .equalsignorecase() data check with no case
		if (s.equalsIgnoreCase(s3)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (s.contains(s1)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	s3 = s3.concat("welcome");
		
		System.out.println(s3);
		
		System.out.println(s2.charAt(1));
		
		if(!s3.isEmpty()) {
			System.out.println(s3);
		} else {
			System.out.println(s2);
		}
		
		System.out.println(s3.toUpperCase() + " " + s2.toLowerCase() );
		
		String s4 = s3.substring(3);
		System.out.println(s4);
		
		String s5 = s3.substring(0,3);
		System.out.println(s5);
		
		char[] ch = s3.toCharArray();
		System.out.println(ch[2]);
		
		String s6 = s3.replace("e","p");
		System.out.println(s6);
		
		
		StringBuilder builder = new StringBuilder("Hello welcome");
		System.out.println(builder);
		builder.append(s3);
		
		
		StringBuffer buffer = new StringBuffer(" Chandu");
		System.out.println(buffer);

	}

}
