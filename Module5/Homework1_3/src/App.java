public class App {
    public static void main(String[] args) {

        int size = 7;
        String[][] cross = new String[size][size];

        // Заполнение
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i == (size - j - 1)) {
                    cross[i][j] = "X";
                }
                else {
                    cross[i][j] = " ";
                }
            }
        }

        // Вывод
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(cross[i][j]);
            }
            System.out.println();
        }
    }
}
