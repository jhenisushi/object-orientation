package javacore.a.basic.concepts.domain;

public class Notebook {
    // 0 - all the statics are executed when JVM loads the class

    private static int[] arrayPages;
    private String paperType;
    private static int numberOfPages;

    static {
        numberOfPages = 100;
        arrayPages = new int[numberOfPages];
        for (int i = 0; i < numberOfPages; i++) {
            arrayPages[i] = i;
        }
        System.out.println("Static initializer block called");
    }

    {
        System.out.println("Instance initializer block called");
    }

    public Notebook() {
        System.out.println("Notebook constructor called");
    }

    public Notebook(String paperType) {
        this.paperType = paperType;
    }

    public String getPaperType() {
        return paperType;
    }
}
