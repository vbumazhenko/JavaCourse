import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        HashSet<String> emailList = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            String cmd = scanner.nextLine();
            String[] elements = identifyCommand(cmd);

            if (elements[0] == null) {
                System.out.println("Неверный формат команды");
                continue;
            }

            if (elements[0].equals("LIST")) {
                for (String item : emailList) {
                    System.out.println(item);
                }
            } else if (elements[0].equals("ADD")) {
                if (elements[1] != null) {
                    emailList.add(elements[1]);
                } else {
                    System.out.println("Неверный формат email-адреса");
                }
            }
        }
    }

    /**
     * Возвращает массив с элементами команды следующей структуры:
     * 1. Имя команды
     * 2. E-mail
     * Если какой-то из элементов не определен или определен неверно,
     * то он содержит значение null.
     */
    private static String[] identifyCommand(String cmd) {

        String[] elements = new String[2];

        // Список возможных команд
        HashSet<String> cmdList = new HashSet<>() {{
            add("LIST");
            add("ADD");
        }};

        String[] cmdArray = cmd.split("\\s+");

        // Определим первый элемент массива (команда)
        if (cmdArray.length > 0 && cmdList.contains(cmdArray[0])) {
            elements[0] = cmdArray[0];
        }

        // Определим второй элемент массива (E-mail)
        if (cmdArray.length > 1) {
            if (cmdArray[1].matches("\\A[^@]+@([^@\\.]+\\.)+[^@\\.]+\\z")) {
                elements[1] = cmdArray[1];
            }
        }

        return elements;
    }
}