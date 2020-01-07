package bank;

public class CardAccount extends Account {

    private static double fee = 1;

    public CardAccount(double sum) {
        super(sum);
    }

    public void withdrawMoney(double sum) {
        super.withdrawMoney(sum * (1 + fee/100));
    }

    public static double getFee() {
        return fee;
    }
}
