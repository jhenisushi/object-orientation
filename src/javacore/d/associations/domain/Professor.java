package javacore.d.associations.domain;

public class Professor {
    private String name;
    private String specialization;
    private Seminar[] seminars; // many-to-many association (unidirectional)

    public Professor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public Professor(String name, String specialization, Seminar[] seminars) {
        this.name = name;
        this.specialization = specialization;
        this.seminars = seminars;
    }

    public void showProfessorInfo() {
        System.out.println("> Professor name: " + name);
        System.out.println("> Professor specialization: " + specialization);
        if (seminars == null) {
            System.out.println("> Professor is not assigned to any seminar.");
            return;
        }
        System.out.println("\nSeminars the professor is assigned to:");
        for (Seminar seminar : seminars) {
            seminar.showSeminarInfo();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
