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

    public void setFilmography(List<Movie> filmography) {
        this.filmography = filmography;
    }

    public void createActor(String name) {
        setName(name);


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
        return "Actor{" +
                "nome='" + this.getName() + '\'' +
                ", Idade=" + this.getAge() +
                ", filmography=" + filmography +
                '}';
    }

}
