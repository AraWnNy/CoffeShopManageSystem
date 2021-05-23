package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if(customer.getNationalityId() == "12345678910") {
			return true;
		}
		else {
			return false;
		}
	}

}
