import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class App {
    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - EEEE");

        // Установим в календарь дату рождения: 21.04.1984,
        // учитывая, что месяцы тут начинаются с 0.
        Calendar calendar = Calendar.getInstance();
        calendar.set(1984, 3, 21);

        int age = 0;
        while (calendar.getTime().getTime() < System.currentTimeMillis()) {
            System.out.println(age + " - " + dateFormat.format(calendar.getTime()));
            // К дате календаря прибавляем 1 год.
            calendar.add(Calendar.YEAR, 1);
            age++;
        }

    }
}
