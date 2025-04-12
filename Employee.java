import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;
    private int salary;
    private List<String> projects;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", projects=" + projects +
                '}';
    }

    public Employee(int id, String name, int age, int salary, List<String> projects) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.projects = projects;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}

