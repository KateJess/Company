public class Operator implements Employee{
    private int salary;
    private Company company;

    public Operator(int salary) {
        this.salary = salary;
    }

    public Operator(int salary, Company company) {
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
        return "Operator {" +
                "salary = " + getMonthSalary() + "}";
    }
}
