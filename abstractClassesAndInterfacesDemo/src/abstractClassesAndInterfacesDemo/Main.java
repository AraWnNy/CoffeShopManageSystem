package abstractClassesAndInterfacesDemo;


import Abstract.CustomerService;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer c1 = new Customer(
				1,
				"Fikret",
				"Gözütok",
				"12345678910");
		
		Customer c2 = new Customer(
				2,
				"Ýsmail",
				"Demir",
				"01234567890");
		
		System.out.println("Starbucks*********************************************************************");
		
		CustomerService customerService = new StarbucksCustomerManager(new CustomerCheckManager());
		
		customerService.save(c1);
		customerService.save(c2);
		
		
		System.out.println("Nero*********************************************************************");
		
		CustomerService customerService2 = new NeroCustomerManager();
		
		customerService2.save(c1);
		customerService2.save(c2);
	}
		
}
