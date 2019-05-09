package ssapackage;

public class TXCustomer extends Customer {
	@Override
	public void processInvoice(int invoiceNumber) {
		System.out.println("Processing TX Customer Invoice nUmber " + invoiceNumber);

	}
}
