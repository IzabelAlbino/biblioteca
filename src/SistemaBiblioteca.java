import java.util.Scanner;

public class SistemaBiblioteca {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    Biblioteca biblioteca = new Biblioteca();
    int opcao = 0;

    do {
        System.out.println("=== Sistema de Biblioteca ===");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("2 - Cadastrar Usuário");
        System.out.println("3 - Realizar Empréstimo");
        System.out.println("4 - Realizar Devolução");
        System.out.println("5 - Listar Livros Disponíveis");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao=scan.nextInt();

        switch (opcao) {
            case 1:
                biblioteca.cadastrarLivro();
                break;
            case 2:
                biblioteca.cadastrarUsuario();
                break;
            case 5:
                biblioteca.listarLivros();
                break;
            case 0:
                System.out.println("Encerrando....");
                break;
            default:
                System.out.println("OPÇÃO INVALIDA");
        }
    } while (opcao != 0);

}
}