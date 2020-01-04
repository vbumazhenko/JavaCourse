import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            String cmd = scanner.nextLine();
            String[] elements = identifyCommand(cmd);

            if (elements[0] != null && elements[0].equals("LIST")) {
                for (int i = 0; i < todoList.size(); i++) {
                    System.out.println(i + " - " + todoList.get(i));
                }
            } else if (elements[0] != null && elements[0].equals("ADD") && elements[2] != null) {
                if (elements[1] == null || Integer.parseInt(elements[1]) > (todoList.size() - 1)) {
                    todoList.add(elements[2]);
                } else {
                    todoList.add(Integer.parseInt(elements[1]), elements[2]);
                }
            } else if (elements[0] != null
                    && elements[0].equals("EDIT")
                    && elements[1] != null
                    && elements[2] != null
                    && Integer.parseInt(elements[1]) <= (todoList.size() - 1)) {
                todoList.remove(Integer.parseInt(elements[1]));
                todoList.add(Integer.parseInt(elements[1]), elements[2]);
            } else if (elements[0] != null
                    && elements[0].equals("DELETE")
                    && elements[1] != null
                    && Integer.parseInt(elements[1]) <= (todoList.size() - 1)) {
                todoList.remove(Integer.parseInt(elements[1]));
            } else {
                System.out.println("Неверный формат команды");
            }
        }
    }

    /**
     * Возвращает массив с элементами команды следующей структуры:
     * 1. Имя команды
     * 2. Номер элемента
     * 3. Текст
     * Если какой-то из элементов не определен, то он содержит значение null.
     */
    private static String[] identifyCommand(String cmd) {

        String[] elements = new String[3];

        // Список возможных команд
        ArrayList<String> cmdList = new ArrayList<>() {{
            add("LIST");
            add("ADD");
            add("EDIT");
            add("DELETE");
        }};

        String[] cmdArray = cmd.split("\\s+");

        // Определим первый элемент массива (команда)
        if (cmdArray.length > 0 && cmdList.indexOf(cmdArray[0]) != -1) {
            elements[0] = cmdArray[0];
        }

        // Определим второй и третий элементы массива (номер элемента списка, текст)
        if (cmdArray.length > 1) {
            if (cmdArray[1].matches("\\d+")) {
                // Случай, когда есть цифровой индекс элемента
                elements[1] = cmdArray[1];
                if (cmdArray.length > 2) {
                    elements[2] = cmd.substring(cmd.indexOf(elements[1]) + elements[1].length() + 1);
                }
            } else {
                // Случай, когда после команды идет текст
                elements[2] = cmd.substring(elements[0].length() + 1);
            }
        }

        return elements;
    }
}