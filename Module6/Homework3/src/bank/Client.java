package bank;

public abstract class Client {

    private int accountNumber;
    protected double balance;

    public Client() {
        accountNumber = (int) (1000000000 * (1 + Math.random()));   // Генерируем 10-значный номер счета клиента
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public abstract void putMoney(double sum);

    public abstract void withdrawMoney(double sum);

}
