package bank;

public class PrivatePerson extends Client {

    @Override
    public void putMoney(double sum) {
        balance += sum;
    }

    @Override
    public void withdrawMoney(double sum) {
        if (sum <= balance) {
            balance -= sum;
        } else {
            System.out.println("Недостаточно средств. Свободный остаток: " + balance);
        }
    }

}
