public class Manager implements Employee{

    private static final int AVERAGE = 115000;
    private static final int VARIANCE = 25000;
    private static final double PERCENT = 0.05;
    private Company company;
    private int salary;
    private int sales;

    public Manager(int salary) {
        sales = (int) Math.round(AVERAGE + Math.random() * VARIANCE);
        int bonus = (int) Math.round(PERCENT * sales);
        this.salary = salary + bonus;
    }

    public Manager(int salary, Company company) {
        this(salary);
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }

    @Override
    public void setCompany(Company company) {
        if (this.company == null) {
            this.company = company;
        }
    }

    @Override
    public Company getCompany() {
        return company;
    }

    public int getSales() {
        return sales;
    }

    @Override
    public String toString() {
        return "Manager {" +
                "salary = " + getMonthSalary() + "}";
    }
}
