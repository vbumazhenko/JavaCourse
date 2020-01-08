package bank;

public class LegalEntity extends Client {

    private double fee = 1;

    @Override
    public void putMoney(double sum) {
        balance += sum;
    }

    @Override
    public void withdrawMoney(double sum) {
        double withdrawAmount = sum * (1 + fee/100);
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
        } else {
            System.out.println("Недостаточно средств. Свободный остаток: " + balance);
        }
    }

}
