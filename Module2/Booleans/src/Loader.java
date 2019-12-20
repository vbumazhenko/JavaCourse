
public class Loader
{
    public static void main(String[] args)
    {
        int milkAmount = 300; // ml
        int powderAmount = 5; // g
        int eggsCount = 5; // items
        int sugarAmount = 5; // g
        int oilAmount = 30; // ml
        int appleCount = 8;

        /**
         * По хорошему, условие нужно составить так, чтобы если мы израсходовали часть продуктов на Pancakes, то
         * на остальные блюда нужно проверять оставшуюся часть ингридиентов. Но в условии задачи про это не говорилось,
         * поэтому показываем то, что могли бы приготовить по отдельности.
         */

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if(powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            System.out.println("Pancakes");
        }

        //milk - 300 ml, powder - 5 g, eggs - 5
        if(milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println("Omelette");
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if(appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            System.out.println("Apple pie");
        }
    }
}