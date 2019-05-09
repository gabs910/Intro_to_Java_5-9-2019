package ssapackage;

public class NYCustomer extends Customer {
	@Override
	public void processInvoice(int invoiceNumber) {
		System.out.println("Processing NY Customer Invoice nUmber " + invoiceNumber);

	}
}//class
