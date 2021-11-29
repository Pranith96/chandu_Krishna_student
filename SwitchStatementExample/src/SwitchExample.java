
public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 30;

		String hi = "Hello";
		switch (i) {
		case 10:
			System.out.println("hello");
			break;
		case 20:
			System.out.println("Hi");
			break;
		case 30:
			System.out.println("hello World");
			break;
		case 40:
			System.out.println("Hi world");
			break;
		default:
			System.out.println("30 condition not macthed");

		}
		
		
		switch(hi){
		case "Hello":
			System.out.println("Hi4");
			break;
		case "HELLO":
			System.out.println("Hi3");
			break;
		case "HeLLo":
			System.out.println("Hi2");
			break;
		case "HeLLoo":
			System.out.println("Hi1");
			break;
		default:
			System.out.println("5");
		}

	}
	
	
/*	
	If conditions:
		Condition =BOOLEAN TRUE OR FALSE

		Int I =10
		•	1st type
		If(i<5){
		----------------------------
		--------------------------
		}

		•	2nd type
		If(i<5){
		----------------------------
		--------------------------
		}else{
		-----------
		----------
		}
		•	3rd type
		If(condition){
		---
		-----
		} else if(condition){

		}
		Else if(condition){

		} else{

		}

		•	4th type:
		If(condition){

		If(condition){

		}

		}


		Switch(Condition){

		Case value1:
		----------------------------
		…………………………………….
		Break;
		Case value2:
		…………………………….
		…………………………….
		Break;
		…………………………

		………………………..
		Default:
		Code will execute if all conditions not matched

*/
}
