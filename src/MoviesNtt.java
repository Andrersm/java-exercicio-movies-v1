import java.util.Scanner;

public class MoviesNtt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("SAIR")) {
            System.out.println("╔═══════════════════════════════════════╗");
            System.out.println("║ Bem Vindo ao cadastro inteligente de  ║");
            System.out.println("║            filmes-NTT O 'CIF'         ║");
            System.out.println("║                                       ║");
            System.out.println("║ Digite 'sair' para sair.              ║");
            System.out.println("║ Digite 'F' para cadastrar filmes      ║");
            System.out.println("║ Digite 'A' para cadastrar atores      ║");
            System.out.println("║ Digite 'D' para cadastrar diretores   ║");
            System.out.println("║ Digite 'LA' para listar atores        ║");
            System.out.println("║ Digite 'LF' para listar filmes        ║");
            System.out.println("║ Digite 'LD' para listar diretores     ║");
            System.out.println("╚═══════════════════════════════════════╝");
            input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "A":
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│ Qual o nome do ator que queres      │");
                    System.out.println("│ cadastrar?                          │");
                    System.out.println("└─────────────────────────────────────┘");
                    String name = scanner.nextLine();
                    Actor actor = new Actor(name);
                    actor.createActor(name);
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│ Ator cadastrado: " + name);
                    System.out.println("└─────────────────────────────────────┘");

                    break;
                case "F":
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│ Qual o nome do Filme que queres     │");
                    System.out.println("│ cadastrar?                          │");
                    System.out.println("└─────────────────────────────────────┘");
                    String filme = scanner.nextLine();
                    Movie movie = new Movie(filme);
                    movie.createMovie(filme);
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│ Filme cadastrado: " + filme);
                    System.out.println("└─────────────────────────────────────┘");
                    break;
                case "D":
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│ Qual o nome do Diretor que queres   │");
                    System.out.println("│ cadastrar?                          │");
                    System.out.println("└─────────────────────────────────────┘");
                    String diretor = scanner.nextLine();
                    Director director = new Director(diretor);
                    director.createDirector(diretor);
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│ Diretor cadastrado: " + diretor);
                    System.out.println("└─────────────────────────────────────┘");
                    break;
                case "LA":
                    System.out.println("Listando Atores...");
                    System.out.println(Actor.getAllActors());
                    break;
                case "LF":
                    System.out.println("Listando Filmes...");
                    System.out.println(Movie.getAllMovies());
                    break;
                case "LD":
                    System.out.print("\f");
                    System.out.flush();
                    System.out.println("Listando Diretores...");
                    System.out.println(Director.getAllDirectors());
                    break;
                case "SAIR":
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│             Saindo...               │");
                    System.out.println("└─────────────────────────────────────┘");
                    break;
                default:
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│        Opção inválida!              │");
                    System.out.println("└─────────────────────────────────────┘");
            }
        }
        scanner.close();
    }
}

