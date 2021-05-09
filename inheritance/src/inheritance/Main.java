package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer buket = new IndividualCustomer();
		buket.customerNumber = "12";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "312";
		
		CustomerManager customerManager = new CustomerManager();
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99";
		
		Customer[] customers = {buket, hepsiBurada, abc};
		 
		customerManager.addMultiple(customers);	
	}
}
