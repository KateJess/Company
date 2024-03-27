import java.util.*;

public class Company {
    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public void hire(Employee candidate) {
        employees.add(candidate);
        candidate.setCompany(this);
    }

    public void hireAll(List<Employee> candidates) {
        for (Employee e: candidates) {
            hire(e);
        }
    }

    public void fire(Employee employee) {
        employees.remove(employee);
        employee.setCompany(null);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if (count > 0 && count <= employees.size()) {
            Collections.sort(employees);
            Collections.reverse(employees);
            return employees.subList(0, count);
        }
        return Collections.EMPTY_LIST;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        if (count > 0 && count <= employees.size()) {
            Collections.sort(employees);
            return employees.subList(0, count);
        }
        return Collections.EMPTY_LIST;
    }

    public double getIncome() {
        int income = 0;
        for (Employee e: employees) {
            if (e instanceof Manager) {
                income += ((Manager) e).getSales();
            }
        }
        return income;
    }
}
