public class App {
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(text);

        int sum = 0;
        String[] lines = text.split(",\\s");
        for (String str : lines) {
            sum += Integer.parseInt(str.replaceAll("[^0-9]", ""));
        }

        System.out.println("Сумма заработка составляет: " + sum);

    }
}
