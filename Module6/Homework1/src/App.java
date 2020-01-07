import bank.Account;
import bank.CardAccount;
import bank.DepoAccount;

public class App {
    public static void main(String[] args) {

        // Основной счет
        Account myAcc = new Account(1000);
        System.out.println("Остаток: " + myAcc.getBalance());
        myAcc.putMoney(500);
        System.out.println("Остаток: " + myAcc.getBalance());
        myAcc.withdrawMoney(1400);
        System.out.println("Остаток: " + myAcc.getBalance());

        // Депозит
        System.out.println();
        DepoAccount myDepoAcc = new DepoAccount(2000);
        System.out.println("Остаток: " + myDepoAcc.getBalance());
        myDepoAcc.putMoney(500);
        System.out.println("Остаток: " + myDepoAcc.getBalance());
        myDepoAcc.withdrawMoney(2400);
        System.out.println("Остаток: " + myDepoAcc.getBalance());

        // Карта
        System.out.println();
        CardAccount myCardAcc = new CardAccount(100);
        System.out.println("Комиссия при снятии: " + CardAccount.getFee() + "%");
        System.out.println("Остаток: " + myCardAcc.getBalance());
        myCardAcc.putMoney(10);
        System.out.println("Остаток: " + myCardAcc.getBalance());
        myCardAcc.withdrawMoney(50);
        System.out.println("Остаток: " + myCardAcc.getBalance());
    }
}
