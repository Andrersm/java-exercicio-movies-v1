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
        System.out.println("Agora qual é a idade de" + name + "?" );
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

    public void setDirectedMovies(List<Movie> directedMovies) {
        this.directedMovies = directedMovies;
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
        return "Director{" +
                "name='" + getName() + '\'' +
                "directedMovies=" + directedMovies +
                '}';
    }
}
