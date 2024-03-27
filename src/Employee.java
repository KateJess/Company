public interface Employee extends Comparable<Employee>{
    int getMonthSalary();
    void setCompany(Company company);
    Company getCompany();

    @Override
    default int compareTo(Employee e) {
        return Integer.compare(getMonthSalary(), e.getMonthSalary());
    }
}
