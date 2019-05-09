package examples;

public class Test_This_and_Super {
	int num1;
	static int num2;
	
	public static void main(String[] args) {

	}//main
	
	public void method1(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
		super.toString();
	}//method1
	
	public static void method2(int num1, int num2){
		//this.num1 = num1;
		//this.num2 = num2;
		Test_This_and_Super.num2 = num2;
	}//method2

}//class
