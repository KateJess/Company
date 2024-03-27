public class TopManager implements Employee{

    private static final int PLANNED_SALE = 10_000_000;
    private static final double COEFFICIENT = 1.25;
    private int salary;
    private Company company;

    public TopManager(int salary) {
        assert company != null;
        this.salary = company.getIncome() > PLANNED_SALE ? (int) COEFFICIENT * salary : salary;
    }

    public TopManager(int salary, Company company) {
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

    @Override
    public String toString() {
        return "TopManager {" +
                "salary = " + getMonthSalary() + "}";
    }


}
