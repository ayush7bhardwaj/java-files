package JavaStreamsOneAgain;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreams {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        // Count of Male and Female employees

        Map<String, Long> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(map);

        // All departments in company

        employeeList.stream().map(Employee::getDepartment).distinct().forEach(department -> System.out.println(department));

        // Find the average age of Male and Female Employees.

        Map<String, Double> avgAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAge);

        //Get the Names of employees who joined after 2015

        employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015).map(Employee::getName).forEach(employee -> System.out.println(employee));

        // Count the number of employees in each department.

        Map<String, Long>  deptMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(deptMap);

        // Find out the average salary of each department.

        Map<String, Double> avgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalary);

        // Find out the oldest employee, his/her age and department?

        Optional<Employee> age = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        System.out.println(age.get());

        // Find out the average and total salary of the organization.

        Double salary = employeeList.stream().map(Employee::getSalary).mapToDouble(Double::doubleValue).average().orElse(0);
        System.out.println("Avg Salary of employees " + salary);

        System.out.println(employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary)));

        DoubleSummaryStatistics sal = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(sal.getMax());
        System.out.println(sal.getAverage());
        System.out.println(sal.getCount());
        System.out.println(sal.getMin());
        System.out.println(sal.getSum());


        // List down the employees of each department.

        Map<String, List<Employee>> employeeOfEachDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employeeOfEachDept);

        // Find out the highest experienced employees in the organization

        Employee employee = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst().get();
        System.out.println(employee);

    }
}
