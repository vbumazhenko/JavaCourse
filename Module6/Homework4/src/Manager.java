public class Manager implements Employee {

    private Company company;
    private int fixSalary;

    public Manager(Company company, int fixSalary) {
        this.company = company;
        this.fixSalary = fixSalary;
    }

    @Override
    public double getMonthSalary() {
        return fixSalary + company.getIncome() * 0.05;
    }

}
