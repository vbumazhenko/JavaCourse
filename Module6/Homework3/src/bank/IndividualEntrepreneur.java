package bank;

public class IndividualEntrepreneur extends Client {

    @Override
    public void putMoney(double sum) {
        if (sum < 1000) {
            balance += sum * (1 - 0.01);
        } else {
            balance += sum * (1 - 0.005);
        }
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
