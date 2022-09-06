package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Data Base'e eklendi : " + customer.getFirstName() + " " + customer.getLastName());

	}
}
