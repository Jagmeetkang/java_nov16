package oct15;

public class Student {
    String id;
    String name;
    double salary;

    public Student(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void printDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
