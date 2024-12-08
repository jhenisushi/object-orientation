package javacore.d.associations.domain;

public class Seminar {
    private String title;
    private Student[] students; // one-to-many association (bidirectional)
    private Place place; // one-to-one association (unidirectional)

    public Seminar(String title, Place place) {
        this.title = title;
        this.place = place;
    }

    public Seminar(String title, Student[] students, Place place) {
        this.title = title;
        this.students = students;
        this.place = place;
    }

    public void showSeminarInfo() {
        System.out.println(">>> Seminar title: " + title);
        if (place == null) {
            System.out.println(">>> Seminar location is not specified.");
            return;
        }
        System.out.println(">>> Seminar location: " + place.getAddress());

        if (students == null || students.length == 0) {
            System.out.println(">>> No students are attending the seminar.");
            return;
        }

        System.out.println(">>> Students attending the seminar:");
        for (Student student : students) {
            System.out.println("    " + student.getName());
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
