import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        /**
         * Номером телефона считается любая последовательность цифр, перед которой
         * может стоять знак "+". Номер телефона не должен содержать пробелы и скобки.
         * Все остальное, считается именем абонента.
         */

        TreeMap<String, String> phoneBook = new TreeMap<>();
        HashMap<String, String> phones = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (;;) {

            String cmd1 = "";
            while (cmd1.isEmpty()) {
                cmd1 = scanner.nextLine().trim();
            }

            if (cmd1.equals("LIST")) {
                for (String key : phoneBook.keySet()) {
                    System.out.println(key + " - " + phoneBook.get(key));
                }
                continue;
            }

            if (cmd1.matches("\\+?[0-9]+")) {

                // Был введен номер телефона
                if (phones.containsKey(cmd1)) {
                    String key = phones.get(cmd1);
                    System.out.println(key + " - " + phoneBook.get(key));
                } else {
                    String cmd2 = "";
                    while (cmd2.isEmpty() || phoneBook.containsKey(cmd2)) {
                        System.out.println("Введите имя абонента:");
                        cmd2 = scanner.nextLine().trim();
                    }
                    phoneBook.put(cmd2, cmd1);
                    phones.put(cmd1, cmd2);
                }

            } else {

                // Было введено имя абонента
                if (phoneBook.containsKey(cmd1)) {
                    System.out.println(cmd1 + " - " + phoneBook.get(cmd1));
                } else {
                    String cmd2 = "";
                    while (!cmd2.matches("\\+?[0-9]+") || phones.containsKey(cmd2)) {
                        System.out.println("Введите номер телефона:");
                        cmd2 = scanner.nextLine().trim();
                    }
                    phoneBook.put(cmd1, cmd2);
                    phones.put(cmd2, cmd1);
                }

            }
        }
    }
}
