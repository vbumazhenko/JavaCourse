import java.util.Scanner;

public class Main
{
    private static int minIncome = 200000;
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000;

    public static void main(String[] args)
    {

        /**
         * Данная программа просит ввести размер дохода компании за месяц, затем рассчитывает и выводит
         * на экран различеые показатели, такие как: зарплата менеджера, налоги, возможность инвестировать
         * и сообщает о превышении бюджета.
         * Все это работает в бесконечном цикле.
         */

        while(true)
        {
            /**
             * Вычислим сумму дохода, после вычета из которой всех расходов получится минимальная сумма для инвестирования.
             * Имеем такое уравнение с одной неизвестной (income):
             * (income - income * managerPercent - calculateFixedCharges()) * (1 - mainTaxPercent) = minInvestmentsAmount
             * После математических преобразований находим эту самую минимальную сумму дохода:
             */
            //
            double minIncomeDec = (minInvestmentsAmount + calculateFixedCharges() * (1 - mainTaxPercent)) / ((1 - managerPercent) * (1 - mainTaxPercent));

            // Получили дробное значение, которое необходимо округлить в большую сторону.
            minIncome = (int) Math.ceil(minIncomeDec);

            // Вывод надписи
            System.out.println("Введите сумму доходов компании за месяц " +
                "(от " + minIncome + " до " + maxIncome + " рублей): ");

            // Ввод значения с клавиатуры в переменную income
            int income = (new Scanner(System.in)).nextInt();

            // Проверка на вхождение в разрешенный интеравал
            if(!checkIncomeRange(income)) {
                continue;
            }

            // Расчет зарплаты менеджера
            double managerSalary = income * managerPercent;

            // Расчет чистого дохода
            double pureIncome = income - managerSalary -
                calculateFixedCharges();

            // Расчет суммы налога
            double taxAmount = mainTaxPercent * pureIncome;

            // Доход за минусом налогов
            double pureIncomeAfterTax = pureIncome - taxAmount;

            // Расчет возможности инвестирования
            boolean canMakeInvestments = pureIncomeAfterTax >=
                minInvestmentsAmount;

            // Вывод полученнх значений
            System.out.println("Зарплата менеджера: " + managerSalary);
            System.out.println("Общая сумма налогов: " +
                (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " +
                (canMakeInvestments ? "да" : "нет"));

            // Вывод сообщения, если бюджет в минусе
            if(pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    // Возвращает true, если число входит в заданный интервал. В противном случае - false
    private static boolean checkIncomeRange(int income)
    {
        if(income < minIncome)
        {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if(income > maxIncome)
        {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    // Возвращает сумму затрат на содержание офиса
    private static int calculateFixedCharges()
    {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
