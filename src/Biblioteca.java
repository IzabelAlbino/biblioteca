import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private List<Usuario> usuarios;
    private List<Livro> livros;
    private List<Emprestimo> emprestimos;

    public Biblioteca(){
        this.usuarios = new ArrayList<>();
        this.livros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void cadastrarUsuario(){
        System.out.println("/////////Tela de cadastro de usuario!////////");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do usuario: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade do usuario: ");

        int idade = scanner.nextInt();

        Usuario usuario = new Usuario(nome,idade);
        usuarios.add(usuario);
        System.out.println("USUSARIO CADASTRADO COM SUCESSO!");
        System.out.println("_______________________________");
    }

    public void cadastrarLivro(){
        System.out.println("/////////Tela de cadastro de livro!////////");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o ano de publicação do livro: ");
        int anoPublicacao = scanner.nextInt();

        Livro livro = new Livro(titulo, autor, anoPublicacao);
        livros.add(livro);
        System.out.println("////////Livro cadastrado com sucesso!///////////");
        System.out.println("______________________________");
    }

    public void listarLivros(){
        System.out.println("///////////Livros cadastrados e disponíveis///////////");
        for (Livro livro : livros) {
            if (livro.isDiponivel()){
                System.out.println(livro);
            }
            System.out.println("_____________________________");

        }
    }


}
