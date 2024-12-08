package java.core.d.associations.domain;

public class Student {
    private String name;
    private int age;
    private Seminar seminar; // many-to-one association (bidirectional)

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Seminar seminar) {
        this.name = name;
        this.age = age;
        this.seminar = seminar;
    }

    public void showStudentInfo() {
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        if (seminar != null)
            System.out.println("Seminar title: " + seminar.getTitle());
        else
            System.out.println("Student is not assigned to any seminar.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }
}
