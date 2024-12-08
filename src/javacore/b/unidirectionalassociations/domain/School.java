package javacore.b.unidirectionalassociations.domain;

// many-to-one association (unidirectional)
public class School {
    private String name;
    private Professor[] professors;

    public School(String name) {
        this.name = name;;
    }

    public School(String name, Professor[] professors) {
        this.name = name;
        this.professors = professors;
    }

    public void showInfo() {
        System.out.println("School: " + name);
        for (Professor professor : professors) {
            if (professor != null) {
                System.out.println("Professor: " + professor.getName());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
