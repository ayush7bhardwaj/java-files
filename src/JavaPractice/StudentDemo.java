package JavaPractice;

import java.util.*;
import java.util.stream.Collectors;

public class StudentDemo {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));
        List<Student> liststuName = list.stream().filter(student -> student.getFirstName().startsWith("A")).collect(Collectors.toList());
        System.out.println(liststuName);

        // Group the student by departmentName

        Map<String, List<Student>> mapData = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName));
        System.out.println(mapData);

        // total count of student using stream
        long count = list.stream().count();
        System.out.println(count);

        // Find the max age of student

        OptionalInt max = list.stream().mapToInt(student -> student.getAge()).max();
        System.out.println(max.getAsInt());

        Optional<Student> opt = list.stream().max((s1, s2) -> {
            if (s1.getAge() > s2.getAge())
                return 1;
            else
                return -1;
        });
        System.out.println(opt.get().getAge());

        // Find all departments names
        List<String> departName = list.stream().map(student -> student.getDepartmentName()).distinct().collect(Collectors.toList());
        System.out.println(departName);

        //Find the count of student in each department
        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting()));
        System.out.println(map);

        // Find the list of students whose age is less than 30
        List<Student> ls = list.stream().filter(student -> student.getAge() < 30).collect(Collectors.toList());
        System.out.println(ls);

        // Find the list of students whose rank is in between 50 and 100
        List<Student> ls1 = list.stream().filter(student -> student.getRank() > 50 && student.getRank() < 100).collect(Collectors.toList());
        System.out.println(ls1);

        // Find the average age of male and female students
        Map<String, Double> mapavg = list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println(mapavg);

        // Find the department who is having maximum number of students

        Map.Entry<String, Long> map1 = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(map1);

        // Find the Students who stays in Delhi and sort them by their names

        List<Student> ls2 = list.stream().filter(student -> student.getCity().equals("Delhi")).sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
        System.out.println(ls2);

        // Find the average rank in all departments
        Map<String, Double> mapavvg = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.averagingInt(Student::getRank)));
        System.out.println(mapavvg);

        // Find the highest rank in each department
       // list.stream().collect(Collectors.groupingBy(Student::getDepartmentName), Collectors.minBy(Comparator.comparing(Student::getRank)));
        Map<String, Optional<Student>> studentData = list.stream().collect(Collectors.groupingBy(Student::getDepartmentName,
                Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println(studentData);

        // Find the list of students and sort them by their rank
        List<Student> sortedlist = list.stream().sorted((s1, s2) ->
                {
                    if(s1.getRank() > s2.getRank())
                        return 1;
                    else
                        return -1;
                }).collect(Collectors.toList());
        System.out.println(sortedlist);

        // Find the student who has second rank

        Student stud = list.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
        System.out.println(stud);

        // Find sum of all IDs of student

        int sum = list.stream().map(Student::getId).reduce(0, (a,b) -> a+b);
        System.out.println(sum);

    }
}
