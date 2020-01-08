import java.util.*;

public class Company {

    private List<Employee> employees = new ArrayList<>();
    private double income;

    public Company(double income) {
        this.income = income;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(List<Employee> employees) {
        this.employees.addAll(employees);
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        // Тут нужно вернуть именно новый список, а не ссылку на существующий,
        // чтобы с ним было удобнее работать при увольнении.
        return new ArrayList<>(employees);
    }

    public double getIncome() {
        return income;
    }

    public List<Double> getTopSalaryStaff(int count) {
        List<Double> salaryList = new ArrayList<>();
        for (Employee employee : employees) {
            salaryList.add(employee.getMonthSalary());
        }
        Collections.sort(salaryList, Comparator.reverseOrder());
        if (count < salaryList.size()) {
            return salaryList.subList(0, count);
        } else {
            return salaryList;
        }
    }

    public List<Double> getLowestSalaryStaff(int count) {
        List<Double> salaryList = new ArrayList<>();
        for (Employee employee : employees) {
            salaryList.add(employee.getMonthSalary());
        }
        Collections.sort(salaryList);
        if (count < salaryList.size()) {
            return salaryList.subList(0, count);
        } else {
            return salaryList;
        }
    }

    public int getCountEmployees() {
        return employees.size();
    }
}
