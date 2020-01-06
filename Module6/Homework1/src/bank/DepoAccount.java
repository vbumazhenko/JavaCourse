package bank;

import java.util.Calendar;
import java.util.Date;

public class DepoAccount extends Account {

    private Date date;

    public DepoAccount(double sum) {
        super(sum);
        date = new Date();
    }

    public void putMoney(double sum) {
        super.putMoney(sum);
        date = new Date();
    }

    public void withdrawMoney(double sum) {
        Calendar dateWithdraw = Calendar.getInstance();
        dateWithdraw.setTime(date);
        dateWithdraw.add(Calendar.MONTH, 1);
        if (dateWithdraw.getTime().before(new Date())) {
            super.withdrawMoney(sum);
        } else {
            System.out.println("Вы можете снять деньги с депозита не раньше " + dateWithdraw.getTime());
        }
    }

}
