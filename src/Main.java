import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Company yandex = new Company(employeeList);

        for (int i = 0; i < 180; i++) {
            int salary = (int) Math.round(40000 + Math.random() * 20000);
            yandex.hire(new Operator(salary));
        }
        for (int i = 0; i < 80; i++) {
            int salary = (int) Math.round(80000 + Math.random() * 20000);
            yandex.hire(new Manager(salary));
        }
        for (int i = 0; i < 10; i++) {
            int salary = (int) Math.round(120000 + Math.random() * 40000);
            yandex.hire(new TopManager(salary));
        }

        System.out.println("Список 15 самых высоких зарплат в компании");
        for (Employee e: yandex.getTopSalaryStaff(15)) {
            System.out.println(e);
        }

        System.out.println("\nСписок 30 самых низких зарплат в компании");
        for (Employee e: yandex.getLowestSalaryStaff(30)) {
            System.out.println(e);
        }

        int i = 0;
        for (Iterator<Employee> iterator = employeeList.iterator(); iterator.hasNext();) {
            iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
            i++;
        }

        System.out.println("\nСписок 15 самых высоких зарплат в компании");
        for (Employee e: yandex.getTopSalaryStaff(15)) {
            System.out.println(e);
        }

        System.out.println("\nСписок 30 самых низких зарплат в компании");
        for (Employee e: yandex.getLowestSalaryStaff(30)) {
            System.out.println(e);
        }
    }
}
