package Nov16;

public class Employee {
    private String name;
    private String email;
    private int age;
    private int phone;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Employee(String name, String email, int age, int phone, String country) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
        this.country = country;
    }
}
