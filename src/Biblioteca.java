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

    public void realizarEmprestimo() {
        System.out.println("///////REALIZAR EMPRESTIMO/////////");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o título do livro:");
        String tituloLivro = scan.nextLine();
        System.out.println("Digite o nome do usuário:");
        String nomeUsuario = scan.nextLine();

        Livro livro = buscarLivroPorTitulo(tituloLivro);
        Usuario usuario = buscarUsuarioPorNome(nomeUsuario);

        if (livro != null && usuario != null && livro.isDiponivel()) {
            livro.setDisponivel(false);
            Emprestimo emprestimo = new Emprestimo(livro, usuario, "data_emprestimo", "data_devolucao");
            emprestimos.add(emprestimo);

            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar o empréstimo. Verifique se o livro está disponível e se o usuário existe.");
        }
    }

    public void realizarDevolucao() {
        System.out.println("///////REALIZAR DEVOLUÇÃO////////");
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o título do livro:");
        String tituloLivro = scan.nextLine();
        System.out.println("Digite o nome do usuário:");
        String nomeUsuario = scan.nextLine();

        Livro livro = buscarLivroPorTitulo(tituloLivro);
        Usuario usuario = buscarUsuarioPorNome(nomeUsuario);

        if (livro != null && usuario != null) {
            for (Emprestimo emprestimo : emprestimos) {
                if (emprestimo.getLivro().equals(livro) && emprestimo.getUsuario().equals(usuario)) {
                    livro.setDisponivel(true);
                    emprestimos.remove(emprestimo);
                    System.out.println("Devolução realizada com sucesso!");
                    return;
                }
            }
            System.out.println("Não foi possível encontrar o empréstimo. Verifique se o livro foi emprestado para o usuário.");
        } else {
            System.out.println("Não foi possível realizar a devolução. Verifique se o livro e o usuário existem.");
        }
    }



    private Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    private Usuario buscarUsuarioPorNome(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        return null;
    }

    public void listarLivrosDisponiveis(){
        for (Livro livro : livros){
            if (livro.isDiponivel()){
                System.out.println(livro);
            }
        }
    }
}
