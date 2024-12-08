package c.associations.test;

import c.associations.domain.Place;
import c.associations.domain.Professor;
import c.associations.domain.Seminar;
import c.associations.domain.Student;

import java.sql.Struct;

public class AssociationTest {
    public static void main(String[] args) {
        Student studentA = new Student("Thom", 20);
        Student studentB = new Student("Jhennifer", 19);
        Student studentC = new Student("Gui", 21);
        Student studentD = new Student("Larissa", 22);

        Place local1 = new Place("Auditorium of University of Toronto");
        Place local2 = new Place("Classroom B of University of Toronto");

        Professor professorA = new Professor("Dr. Smith", "Computer Science");
        Professor professorB = new Professor("Dr. Johnson", "Mathematics");
        Professor professorC = new Professor("Dr. Brown", "Physics");

        Seminar seminarA = new Seminar("Introduction to Java", local1);
        seminarA.setStudents(new Student[]{studentA, studentB});

        Student[] students = new Student[]{studentC};
        Seminar seminarB = new Seminar("Introduction to Calculus", students, local2);
        Seminar seminarC = new Seminar("Advanced Calculus", new Student[]{studentD}, local1);

        professorA.setSeminars(new Seminar[]{seminarA});
        professorB.setSeminars(new Seminar[]{seminarB, seminarC});

        Professor[] professors = new Professor[]{professorA, professorB, professorC};
        for (Professor professor : professors) {
            System.out.println("---------------------");
            professor.showProfessorInfo();
        }
        System.out.println("---------------------");
    }
}
