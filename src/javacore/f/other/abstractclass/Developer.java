package javacore.f.other.abstractclass;

public class Developer extends Employee{
    private String mainLanguage;

    public Developer(String name, double salary, String mainLanguage) {
        super(name, salary);
        this.mainLanguage = mainLanguage;
    }

    @Override
    public void bonusSalary() {
        this.salary += this.salary * 0.5;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }
}
