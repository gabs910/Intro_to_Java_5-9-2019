package ssapackage;



public class BaltimoreCustomer extends MDCustomer {
 int balID;
 
 
 
	public void printCustData(){
		super.printCustData();
		System.out.println(balID);
	}//printCustData
	
	public BaltimoreCustomer(String name, int id, int balance, int mdid, int balid) {
		super(name, id, balance, mdid);
		balID = balid;
		
	}
	
	public BaltimoreCustomer(){}
	
	public String toString(){
		return super.toString() +" " + balID;
		 
	}//toString
	


}
