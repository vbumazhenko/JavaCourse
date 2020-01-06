import bank.Account;
import bank.CardAccount;
import bank.DepoAccount;

public class App {
    public static void main(String[] args) {

        // Основной счет
        Account myAcc = new Account(1000);
        System.out.println(myAcc.getBalance());
        myAcc.putMoney(500);
        System.out.println(myAcc.getBalance());
        myAcc.withdrawMoney(1400);
        System.out.println(myAcc.getBalance());

        // Депозит
        DepoAccount myDepoAcc = new DepoAccount(2000);
        System.out.println(myDepoAcc.getBalance());
        myDepoAcc.putMoney(500);
        System.out.println(myDepoAcc.getBalance());
        myDepoAcc.withdrawMoney(2400);
        System.out.println(myDepoAcc.getBalance());

        // Карта
        CardAccount myCardAcc = new CardAccount(100);
        System.out.println(myCardAcc.getBalance());
        myCardAcc.putMoney(10);
        System.out.println(myCardAcc.getBalance());
        myCardAcc.withdrawMoney(50);
        System.out.println(myCardAcc.getBalance());

    }
}
