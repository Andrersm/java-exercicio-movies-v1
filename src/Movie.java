import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Movie {


    private Director director;
     private String name;
     private List<Actor> actors;
     private String recordingAdress;
     private int recordingTime;
     private Date initialDate;
     private Date finalDate;
     private static final List<Movie> allMovies = new ArrayList<>();

    @Override
    public String toString() {
        return
                "//////////////////\n" +
                        "//              //\n" +
                        "//   Movie{     //\n" +
                        "//     director=" + director + "\n" +
                        "//     Titulo='" + name + "'\n" +
                        "//     Atores=" + actors + "\n" +
                        "//     Local de gravação ='" + recordingAdress + "'\n" +
                        "//     Tempo de gravação =" + recordingTime + "\n" +
                        "//     Data inicial da gravação =" + initialDate + "\n" +
                        "//     Data final da gravação =" + finalDate + "\n" +
                        "//   }          //\n" +
                        "//              //\n" +
                        "//////////////////";
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Movie(String name) {
        this.name = name;
        allMovies.add(this);
    }
    public static List<Movie> getAllMovies() {
        return allMovies;
    }

    public String getName() {
          return name;
     }


     public List<Actor> getActors() {
          return actors;
     }

     public void setActors(List<Actor> actors) {
          this.actors = actors;
     }

     public String getRecordingAdress() {
          return recordingAdress;
     }

     public void setRecordingAdress(String recordingAdress) {
          this.recordingAdress = recordingAdress;
     }

     public int getRecordingTime() {
          return recordingTime;
     }

     public void setRecordingTime(int recordingTime) {
          this.recordingTime = recordingTime;
     }

     public Date getInitialDate() {
          return initialDate;
     }

     public void setInitialDate(Date initialDate) {
          this.initialDate = initialDate;
     }

     public Date getFinalDate() {
          return finalDate;
     }

     public void setFinalDate(Date finalDate) {
          this.finalDate = finalDate;
     }

     public void createMovie(String name) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        System.out.println("Digite a data inicial da produção do filme (no formato dd/MM/yy):");
         String initialDateString = scanner.nextLine();
         try {
             initialDate = dateFormat.parse(initialDateString);
         } catch (ParseException e) {
             System.out.println("Formato de data inválido. Por favor, insira no formato dd/MM/yy.");
         }
         System.out.println("Digite a data de entrega do filme (no formato dd/MM/yy):");
         String FinalDateString = scanner.nextLine();
         try {
             finalDate = dateFormat.parse(FinalDateString);
         } catch (ParseException e) {
             System.out.println("Formato de data inválido. Por favor, insira no formato dd/MM/yy.");
         }
         System.out.println("Qual foi o local de gravação do filme? (no formato nome da 'rua e numero'");
         String adress = scanner.nextLine();
         System.out.println("Qual tempo de duração do filme em Minutos?");
         int recording = scanner.nextInt();
         setRecordingTime(recording);
         setInitialDate(initialDate);
         setFinalDate(finalDate);
         setRecordingAdress(adress);
     }

    public static Movie getMovieByName(String name) {
        for (Movie movie : Movie.getAllMovies()) {
            if (movie.getName().equals(name)) {
                return movie;
            }
        }
        return null;
    }
}

