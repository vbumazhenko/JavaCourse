import bank.Client;
import bank.IndividualEntrepreneur;
import bank.LegalEntity;
import bank.PrivatePerson;

public class App {
    public static void main(String[] args) {

        // Физическое лицо
        Client Client1 = new PrivatePerson();
        System.out.println("Номер счета: " + Client1.getAccountNumber());
        System.out.println("Остаток: " + Client1.getBalance());
        Client1.putMoney(1000);
        System.out.println("Остаток: " + Client1.getBalance());
        Client1.withdrawMoney(150);
        System.out.println("Остаток: " + Client1.getBalance());

        // Юридическое лицо
        System.out.println();
        Client Client2 = new LegalEntity();
        System.out.println("Номер счета: " + Client2.getAccountNumber());
        System.out.println("Остаток: " + Client2.getBalance());
        Client2.putMoney(1000);
        System.out.println("Остаток: " + Client2.getBalance());
        Client2.withdrawMoney(500);
        System.out.println("Остаток: " + Client2.getBalance());

        // Индивидуальный предприниматель
        System.out.println();
        Client Client3 = new IndividualEntrepreneur();
        System.out.println("Номер счета: " + Client3.getAccountNumber());
        System.out.println("Остаток: " + Client3.getBalance());
        Client3.putMoney(500);
        System.out.println("Остаток: " + Client3.getBalance());
        Client3.withdrawMoney(495);
        Client3.putMoney(5000);
        System.out.println("Остаток: " + Client3.getBalance());

    }
}
