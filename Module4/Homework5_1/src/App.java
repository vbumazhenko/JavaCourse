public class App {
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(text);

        // Разобьем строку на массив строк так, чтобы в каждой строке была только одна сумма.
        // В качестве разделителя будет выступать запятая и пробел, идущие подряд.
        String[] lines = text.split(",\\s");

        // Выделим из каждого элемента массива только цифры и просуммируем их.
        int sum = 0;
        for (String str : lines) {
            sum += Integer.parseInt(str.replaceAll("[^0-9]", ""));
        }

        System.out.println("Сумма заработка составляет: " + sum);

    }
}
