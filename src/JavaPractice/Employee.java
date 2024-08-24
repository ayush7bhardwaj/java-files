package JavaPractice;

public class Employee {

    private String fName;
    private String lName;
    private String gender;
    private int age;
    private int salary;

    public Employee(String fName, String lName, String gender, int age, int salary) {
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
