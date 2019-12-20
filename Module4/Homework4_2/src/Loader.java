
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(text);

        int sum = getSum(text, "Вася") + getSum(text, "Маша");

        System.out.print("Сумма заработка Васи и Маши составляет: ");
        System.out.println(sum + text.substring(text.lastIndexOf(' ')));

    }

    private static int getSum(String text, String name) {

        int posName = text.indexOf(name);

        // Считаем, что после имени идет 2 пробела и сразу сумма заработка.
        int posSpace = text.indexOf(' ', text.indexOf(' ', posName + 1) + 1);
        String strSum = text.substring(posSpace, text.indexOf(' ', posSpace + 1)).trim();
        return Integer.parseInt(strSum);
   }
}