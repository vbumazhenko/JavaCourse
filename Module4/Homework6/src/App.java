import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - EEEE");

        // Установим в календарь дату рождения: 21.04.1984.
        Calendar calendar = Calendar.getInstance();
        calendar.set(1984, Calendar.APRIL, 21);

        int age = 0;
        while (calendar.getTime().getTime() < System.currentTimeMillis()) {
            System.out.println(age + " - " + dateFormat.format(calendar.getTime()));
            // К дате календаря прибавляем 1 год.
            calendar.add(Calendar.YEAR, 1);
            age++;
        }
    }
}
