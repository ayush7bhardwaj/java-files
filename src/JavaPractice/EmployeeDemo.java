package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeDemo {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(new Employee("Ayush","Bhardwaj","Male", 26, 50000),
                new Employee("Reka", "Gupta", "Female", 21, 57513),
                new Employee("Emily", "Jones", "Female", 30, 56465),
                new Employee("Arianna", "Grande", "Female", 35, 64654));

        // First Method
        Map<String, Integer> map = list.stream().filter(employee -> employee.getGender() == "Female" || employee.getAge() >= 26)
                .collect(Collectors.toMap(employee -> employee.getfName(), employee -> employee.getSalary()));
        System.out.println(map);

        // Second Method

        Predicate<Employee> p1 = employee -> employee.getGender() == "Female";
        Predicate<Employee> p2 = employee -> employee.getAge() >= 30;
        Map<String, Integer> map1 =list.stream().filter(p1.and(p2)).collect(Collectors.toMap(employee -> employee.getfName(), employee -> employee.getSalary()));
        System.out.println(map1);


    }
}
