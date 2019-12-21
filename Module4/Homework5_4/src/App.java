import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inPhoneNumber = scanner.nextLine();

        // Получм только цифры номера телефона.
        String numOnly = inPhoneNumber.replaceAll("[^0-9]", "");

        // Выполним проверку на достаточность цифр в номере телефона.
        if (numOnly.length() < 10) {
            System.out.println("Введен неверный номер телефона");
            return;
        }

        // Получим номер телефона без 8 и +7 - это последние 10 знаков.
        numOnly = numOnly.substring(numOnly.length() - 10);

        // Преобразуем номер в формат +7 999 999-99-99.
        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append("+7 ");
        phoneNumber.append(numOnly.substring(0, 3));
        phoneNumber.append(" ");
        phoneNumber.append(numOnly.substring(3, 6));
        phoneNumber.append("-");
        phoneNumber.append(numOnly.substring(6, 8));
        phoneNumber.append("-");
        phoneNumber.append(numOnly.substring(8, 10));

        System.out.println(phoneNumber);

    }
}
