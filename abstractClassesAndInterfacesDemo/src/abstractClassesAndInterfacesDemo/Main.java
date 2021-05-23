package abstractClassesAndInterfacesDemo;


import java.time.LocalDate;

import Abstract.CustomerService;
import Adapter.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer c1 = new Customer(
				1,
				"Fikret",
				"G�z�tok",
				LocalDate.of(2000,0,0),
				"12345678910");
		
		Customer c2 = new Customer(
				2,
				"�smail",
				"Demir",
				LocalDate.of(2000,0,0),
				"12345678910");
		
		System.out.println("Starbucks*********************************************************************");
		
		CustomerService customerService = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerService.save(c1);
		customerService.save(c2);
		
		
		System.out.println("Nero*********************************************************************");
		
		CustomerService customerService2 = new NeroCustomerManager();
		
		customerService2.save(c1);
		customerService2.save(c2);
	}
		
}
