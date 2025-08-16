import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        List<Book> books = new ArrayList<>();
//        books.add(new Book(1,
//                "Senhor dos Aneis",
//                new Author(10, "J. R. R. Tolkien", LocalDate.of(1892, 1, 3)),
//                true,
//                LocalDate.of(1949, 7, 20),
//                LocalDate.of(2025, 3, 23)));
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println(" BEM VINDO AO SISTEMA DE EMPRESTIMO DE LIVROS ");

        do {
            System.out.println("""
                    OPÇÕES -> (1) Ver livros disponíveis
                              (2) Sair do programa
                    """);
            choice = input.nextInt();
        } while(choice != 2);

        System.out.println("Programa finalizado!");


//        System.out.println("Livro disponível: ");
//        System.out.println("ID: " + books.getFirst().getId());
//        System.out.println("Título: " + books.getFirst().getBookTitle());
//        System.out.println("Autor: " + books.getFirst().getAuthor().getName() + " - (ID: " + books.getFirst().getAuthor().getId() + ", Data de nascimento: " + books.getFirst().getAuthor().getBirthDate() + ")");
//        System.out.println("Disponibilidade: " + (books.getFirst().getAvailable() ? "Disponível" : "Não disponível"));
//        System.out.println("Data de registro: " + books.getFirst().getRegisterDate());
//        System.out.println("Data de atualização: " + books.getFirst().getUpdateDate());
    }
}
