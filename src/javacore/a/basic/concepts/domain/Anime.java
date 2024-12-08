package java.core.a.basic.concepts.domain;

public class Anime {
    // 1- memory allocation for the object
    // 2- variable initialization with default values
    // 3- instance initializer block
    // 4- constructor called

    private String name;
    private String genre;
    private int episodes;

    private static int count; // related to the class, not the object
    private static  int maxAnimes; // related to the class, not the object

    // instance initializer block (just example)
    {
        name = "Naruto";
        genre = "Shonen";
        episodes = 220;
        count++;
        maxAnimes = 500;
    }

    public Anime() {
        System.out.println("Anime constructor called");
    }

    public Anime(String name, String genre, int episodes) {
        this.name = name;
        this.genre = genre;
        this.episodes = episodes;
    }

    // it is a method that belongs to the class, not the object (static)
    public static void setMaxAnimes(int maxAnimes) {
        Anime.maxAnimes = maxAnimes;
        // this.maxAnimes = maxAnimes;
        // in a static context, we can't use the keyword "this"
        // because "this" refers to the object, not the class
        // and because the class independent of the object
    }

    // toString is a method of the Object class
    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    public static int getMaxAnimes() {
        return maxAnimes;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEpisodes() {
        return episodes;
    }
    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
