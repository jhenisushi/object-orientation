package a.unidirectionalassociations.test;

import a.unidirectionalassociations.domain.Professor;
import a.unidirectionalassociations.domain.School;

public class SchoolTest {
    // Unidirectional association, (School -> Professor)
    public static void main(String[] args) {
        Professor professor1 = new Professor("John Doe");
        Professor professor2 = new Professor("Tom Smith");
        Professor professor3 = new Professor("Alice Johnson");

        Professor[] professors = {professor1, professor2, professor3};
        School school = new School("Joinville", professors);
        school.showInfo();
    }
}
