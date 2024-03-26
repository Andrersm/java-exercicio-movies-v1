import jdk.dynalink.CallSiteDescriptor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Director extends Person {
    private List<Movie> directedMovies;
    private static final List<Director> allDirectors = new ArrayList<>();

    public Director(String name) {
        this.setName(name);
        if (allDirectors.contains(this)) {
            System.out.println(name + " já está cadastrado");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Agora qual é a idade de " + name + "?" );
        age = scanner.nextInt();
        setAge(age);
        allDirectors.add(this);
    }
    public static List<Director> getAllDirectors() {
        return allDirectors;
    }

    public List<Movie> getDirectedMovies() {
        return directedMovies;
    }

    public void setDirectedMovies(Movie movie) {
        if (this.directedMovies == null) {
            this.directedMovies = new ArrayList<>();
        }
        this.directedMovies.add(movie);
    }


    public void createDirector(String name) {
        setName(name);

    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Director diretor = (Director) obj;
        return Objects.equals(this.getName(), diretor.getName());
    }
    @Override
    public String toString() {
        return
                "+---------------------------------+\n" +
                        "|                                 |\n" +
                        "|  Director{                      |\n" +
                        "|    name='" + getName() + "'      |\n" +
                        "|    directedMovies=" + directedMovies + "|\n" +
                        "|  }                              |\n" +
                        "|                                 |\n" +
                        "+---------------------------------+";
    }

    public static Director getDirectorByName(String name) {
        for (Director diretor : Director.getAllDirectors()) {
            if (diretor.getName().equals(name)) {
                return diretor;
            }
        }
        return null;
    }
}
