package bank;

public class Account {

    // protected - на случай, если понадобится изменить баланс при переопределении методов
    // в классах-потомках. Сейчас это не требуется.
    protected double balance;

    public Account(double sum) {
        balance = sum;
    }

    public void putMoney(double sum) {
        balance += sum;
    }

    public void withdrawMoney(double sum) {
        if (sum <= balance) {
            balance -= sum;
        } else {
            System.out.println("Недостаточно средств. Доступный остаток: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

}
