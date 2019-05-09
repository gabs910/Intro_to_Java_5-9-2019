package examples;

public class TestString  {

	public static void main(String[] args) {
		String name = new String("John");
		System.out.println(name.toUpperCase());
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		String firstName = args[0];
		System.out.println(firstName);
		String personAge = args[1];
		System.out.println(personAge + 5);
		int age = Integer.parseInt(personAge);
		System.out.println(age + 5);
		String acctBal = args[2];
		System.out.println(acctBal + 10);
		double acct = Double.parseDouble(acctBal);
		System.out.println(acct + 10);
		
		

	}//main

}
