import java.util.HashMap;
import java.util.Map;
interface CustomerRepository {
    Customer findCustomerById(int id);
}
class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customers = new HashMap<>();

    // Initialize with some sample data
    public CustomerRepositoryImpl() {
        customers.put(1, new Customer(1, "Alice"));
        customers.put(2, new Customer(2, "Bob"));
        customers.put(3, new Customer(3, "Charlie"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customers.get(id);
    }
}
class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomer(int id) {
        return customerRepository.findCustomerById(id);
    }
}

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create the concrete repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find and display a customer
        Customer customer = customerService.getCustomer(1);
        System.out.println("Customer ID: " + customer.getId() + ", Name: " + customer.getName());
    }
}
