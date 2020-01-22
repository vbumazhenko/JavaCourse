import java.util.HashMap;

public class CustomerStorage
{
    private HashMap<String, Customer> storage;

    public CustomerStorage()
    {
        storage = new HashMap<>();
    }

    public void addCustomer(String data)
    {
        String[] components = data.split("\\s+");
        if (components.length < 2) {
            throw new IllegalArgumentException("Не верный формат имени");
        }
        String name = components[0] + " " + components[1];

        if(components.length < 3 || !components[2].matches("\\A\\+7\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\z")) {
            throw new IllegalArgumentException("Не верный формат номера телефона");
        }
        if(components.length < 4 || !components[3].matches("\\A[^@]+@([^@\\.]+\\.)+[^@\\.]+\\z")) {
            throw new IllegalArgumentException("Не верный формат Email");
        }
        storage.put(name, new Customer(name, components[3], components[2]));
    }

    public void listCustomers()
    {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name)
    {
        storage.remove(name);
    }

    public int getCount()
    {
        return storage.size();
    }
}