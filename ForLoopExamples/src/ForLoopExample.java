
public class ForLoopExample {

	public static void main(String[] args) {

		// forloop
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		// nested forloop
		for (int i = 0; i < 5; i++) { // 0, 1,2,3
			for (int j = i; j < 5; j++) { // 0,1,2,3
				System.out.println(i + " " + j);
			}
		}

		System.out.println("------------------------------------------------");

		for (int i = 1; i <= 5; i++) {  //1,2,3,4,5
			for (int j = 1; j <= i; j++) { //1,2
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------");
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) { // 5>1<4>1,3>1,2>1
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
