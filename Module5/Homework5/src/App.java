import java.util.*;

public class App {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};

        // Заполнение списка блатных номеров.
        for (String letter1 : letters) {
            for (int iNum = 0; iNum <= 9; iNum++) {
                for (String letter2 : letters) {
                    for (String letter3 : letters) {
                        for (int numReg = 1; numReg <= 197; numReg++) {
                            list.add(letter1 + iNum + iNum + iNum + letter2 + letter3 + String.format("%03d", numReg));
                        }
                    }
                }
            }
        }
        HashSet<String> hList = new HashSet<>(list);
        TreeSet<String> tList = new TreeSet<>(list);
        System.out.println("Количество элементов: " + list.size());

        // Поиск в списке значения, введенного с клавиатуры.
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            String num = scanner.nextLine();

            // 1 способ. Прямой перебор.
            long start = System.currentTimeMillis();
            if (list.contains(num)) {
                System.out.println("1. Прямой перебор: " + (System.currentTimeMillis() - start) + " ms");
            }

            // 2 способ. Бинарный поиск.
            start = System.currentTimeMillis();
            if (Collections.binarySearch(list, num) >= 0) {
                System.out.println("2. Бинарный поиск: " + (System.currentTimeMillis() - start) + " ms");
            }

            // 3 способ. HashSet.
            start = System.currentTimeMillis();
            if (hList.contains(num)) {
                System.out.println("3. HashSet: " + (System.currentTimeMillis() - start) + " ms");
            }

            // 4 способ. TreeSet.
            start = System.currentTimeMillis();
            if (tList.contains(num)) {
                System.out.println("4. TreeSet: " + (System.currentTimeMillis() - start) + " ms");
            }

        }
    }
}
