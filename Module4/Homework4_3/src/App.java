import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // Удаление лишних пробелов в начале и в конце строки
        name = name.trim();

        // Удиление двойнх пробелов
        name = name.replaceAll(" +", " ");

        // Будем считать, что первое слово - это Фамилия, второе слово - это Имя,
        // а все остальное - это Отчество.
        String firstName = "";
        String lastName = "";
        String middleName = "";

        int space1 = name.indexOf(' ');
        if (space1 == -1 ) {
            lastName = name;
        }
        else {
            lastName = name.substring(0, space1);
            int space2 = name.indexOf(' ', space1 + 1);
            if (space2 == -1 ) {
                firstName = name.substring(space1).trim();
            }
            else {
                firstName = name.substring(space1, space2).trim();
                middleName = name.substring(space2).trim();
            }
        }

        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Отчество: " + middleName);
    }
}
