import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // Удаление лишних пробелов в начале и в конце строки.
        name = name.trim();

        // Разделим строку на массив строк.
        // В качестве разделителя будет выступать один или несколько пробелов.
        String[] lines = name.split("\\s+");

        // Будем считать, что первое слово - это Фамилия, второе слово - это Имя,
        // а третье - это Отчество. Все остальные слова игнорируем.
        String firstName = "";
        String lastName = "";
        String middleName = "";

        // Заполняем переменные Ф, И, О в зависимости от количества элементов массива.
        int length = lines.length;
        if (length == 1) {
            lastName = lines[0];
        }
        else if (length == 2) {
            lastName = lines[0];
            firstName = lines[1];
        }
        else if (length > 2) {
            lastName = lines[0];
            firstName = lines[1];
            middleName = lines[2];
        }

        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Отчество: " + middleName);
    }
}
