package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public boolean removeEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                employees.remove(employee);
                return true;
            }
        }
        return false;
    }

    public List<Employee> searchEmployees(String keyword) {
        List<Employee> searchResults = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().contains(keyword)) {
                searchResults.add(employee);
            }
        }
        return searchResults;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        Employee emp1 = new Employee("John Doe", 30, "123 Main St", 50000, "HR");
        Employee emp2 = new Employee("Jane Smith", 35, "456 Oak St", 60000, "Finance");
        system.addEmployee(emp1);
        system.addEmployee(emp2);

        System.out.print("Введите имя сотрудника для поиска:");
        String searchName = scanner.nextLine();

        List<Employee> searchResults = system.searchEmployees(searchName);

        if (!searchResults.isEmpty()) {
            System.out.println("Результаты поиска:");
            for (Employee employee : searchResults) {
                System.out.println(employee.getName() + " - " + employee.getDepartment());
            }
        } else {
            System.out.println("Сотрудник с таким именем не найден.");
        }
    }
}
