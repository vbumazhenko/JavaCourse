package bank;

public class CardAccount extends Account {

    private static double fee = 0.01;

    public CardAccount(double sum) {
        super(sum);
    }

    public void withdrawMoney(double sum) {
        super.withdrawMoney(sum * (1 + fee));
    }
}
