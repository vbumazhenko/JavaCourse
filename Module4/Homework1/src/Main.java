public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        System.out.println(sumDigits(123));

    }

    public static Integer sumDigits(Integer number)
    {
        //@TODO: write code here

        Integer result = 0;
        String numberString = number.toString();
        for (int i = 0; i < numberString.length(); i++) {
            result += Character.digit(numberString.charAt(i), 10);
        }
        return result;
    }
}
