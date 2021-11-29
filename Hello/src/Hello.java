public class Hello {
	
	static final int i =10; // instance varible

	public static void main(String[] args) {

		int  j =10;
		System.out.println("Hello world" +j);
		
		Hello hello = new Hello();
		int k = hello.hello1();
		System.out.println(k);
		hello(10,"Hi");
	}
	
	public static void hello(int l,String m) {
		System.out.println(i);
		System.out.println(l+m);

		
	}
	
	public int hello1() {
		//System.out.println(i);
		return i;
	}
}
