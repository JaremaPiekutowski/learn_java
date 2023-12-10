package OOP;

public class Student {

    // Attributes
    String name;
    int age;
    String address;

    // Constructor
    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // To string representation
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }

    // Equals method
    public boolean equals(Student student) {
        return this.name.equals(student.name) &&
                this.age == student.age &&
                this.address.equals(student.address);
    }

    // Main method
    public static void main(String[] args) {
        Student student = new Student(
                "Helena Anna Jędrzejczak",
                24,
                "Duracza 33/3");
        System.out.println(student);
    }
}
