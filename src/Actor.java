import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Actor extends Person { ;
    private List<Movie> filmography;
    private static final List<Actor> allActors = new ArrayList<>();

    public Actor(String name) {
        this.setName(name);
        if (allActors.contains(this)) {
            System.out.println(name + " já está cadastrado");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Agora qual é a idade de " + name + "?" );
        age = scanner.nextInt();
        setAge(age);
        allActors.add(this);
    }
    public List<Movie> getFilmography() {
        return filmography;
    }
    public static List<Actor> getAllActors() {
        return allActors;
    }

    public void addMovieToFilmography(Movie movie) {
        if (this.filmography == null) {
            this.filmography = new ArrayList<>();
        }
        this.filmography.add(movie);
    }

    public void createActor(String name) {
        setName(name);
    }

    public static Actor getActorByName(String name) {
        for (Actor actor : Actor.getAllActors()) {
            if (actor.getName().equals(name)) {
                return actor;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Actor actor = (Actor) obj;
        return Objects.equals(this.getName(), actor.getName());
    }

    @Override
    public String toString() {
        return
                "+---------------------------------+\n" +
                        "|                                 |\n" +
                        "|  Actor{                         |\n" +
                        "|    nome='" + this.getName() + "'                 |\n" +
                        "|    Idade=" + this.getAge() + "                     |\n" +
                        "|    filmography=" + filmography + " |\n" +
                        "|  }                              |\n" +
                        "|                                 |\n" +
                        "+---------------------------------+";
    }

}
