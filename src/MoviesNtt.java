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
            System.out.println("║ Digite 'FL' para Ligar filme a diretor║");
            System.out.println("║ Digite 'DL' para ligar filme a ator   ║");
            System.out.println("╚═══════════════════════════════════════╝");
            input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "FL":
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│ Qual ator voce quer ligar?          │");
                    System.out.println("└─────────────────────────────────────┘");
                    String nameAtor = scanner.nextLine();
                    Actor obj = Actor.getActorByName(nameAtor);
                    if (obj == null) {
                        System.out.println("Ator não cadastrado");
                        break;
                    }
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│ e agora a que filme queres ligar?   │");
                    System.out.println("└─────────────────────────────────────┘");
                    String nameFilme = scanner.nextLine();
                    Movie objFilm = Movie.getMovieByName(nameFilme);
                    if (nameFilme == null) {
                        System.out.println("Filme não encontrado");
                        break;
                    }
                    obj.addMovieToFilmography(objFilm);
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│ Filme Ligado a ator com sucesso     │");
                    System.out.println("└─────────────────────────────────────┘");
                    break;
                case "DL":
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│ Qual Diretor voce quer ligar?       │");
                    System.out.println("└─────────────────────────────────────┘");
                    String nameDiretor = scanner.nextLine();
                    Director objdirector = Director.getDirectorByName(nameDiretor);
                    if (objdirector == null) {
                        System.out.println("Diretor não cadastrado");
                        break;
                    }
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│ e agora a que filme queres ligar?   │");
                    System.out.println("└─────────────────────────────────────┘");
                    String nameFilmedirected = scanner.nextLine();
                    Movie objFilmdirected = Movie.getMovieByName(nameFilmedirected);
                    if (objFilmdirected == null) {
                        System.out.println("Filme não encontrado");
                        break;
                    }
                    objdirector.setDirectedMovies(objFilmdirected);
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│ Filme Ligado a diretor com sucesso  │");
                    System.out.println("└─────────────────────────────────────┘");
                    break;
                case "A":
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│ Qual o nome do ator que queres      │");
                    System.out.println("│ cadastrar?                          │");
                    System.out.println("└─────────────────────────────────────┘");
                    String name1 = scanner.nextLine();
                    Actor actor1 = new Actor(name1);
                    actor1.createActor(name1);
                    System.out.println("┌─────────────────────────────────────┐");
                    System.out.println("│ Ator cadastrado: " + name1);
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

