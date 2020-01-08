import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        createNextCompany(1000000);
        //createNextCompany(11000000);
    }

    private static void createNextCompany(double income) {

        // Создаем новую команию
        Company company = new Company(income);

        // Нанимаем 180 операторов с помощью метода hire
        for (int i = 1; i <= 180 ; i++) {
            Employee employee = new Operator(company, (int) (50000 + 10000 * Math.random()));
            company.hire(employee);
        }

        // Нанимаем 80 менеджеров с помощью метода hireAll
        List<Employee> employees = new ArrayList<>();
        for (int i = 1; i <= 80 ; i++) {
            Employee employee = new Manager(company, (int) (60000 + 10000 * Math.random()));
            employees.add(employee);
        }
        company.hireAll(employees);

        // Нанимаем 10 топ менеджеров с помощью метода hire
        for (int i = 1; i <= 10 ; i++) {
            Employee employee = new TopManager(company, (int) (150000 + 10000 * Math.random()));
            company.hire(employee);
        }

        System.out.println("Количество сотрудников компании: " + company.getCountEmployees());

        // Высокие зарплаты в компании
        printTopSalaryStaff(company, 15);

        // Низкие зарплаты в компании
        printLowestSalaryStaff(company, 30);

        // Уволим 50% сотрудников
        List<Employee> AllEmployees = company.getEmployees();
        int num = 1;
        for (Employee employee : AllEmployees) {
            if (num % 2 == 0) {
                company.fire(employee);
            }
            num++;
        }

        System.out.println("Количество сотрудников компании: " + company.getCountEmployees());

        // Высокие зарплаты в компании
        printTopSalaryStaff(company, 15);

        // Низкие зарплаты в компании
        printLowestSalaryStaff(company, 30);

    }

    private static void printTopSalaryStaff(Company company, int count) {
        System.out.println();
        System.out.println("Список самых высоких зарплат компании:");
        int num = 1;
        for (double salary : company.getTopSalaryStaff(count)) {
            System.out.println(num + ". " + salary + " руб.");
            num++;
        }
    }

    private static void printLowestSalaryStaff(Company company, int count) {
        System.out.println();
        System.out.println("Список самых низких зарплат компании:");
        int num = 1;
        for (double salary : company.getLowestSalaryStaff(count)) {
            System.out.println(num + ". " + salary + " руб.");
            num++;
        }
    }

}
