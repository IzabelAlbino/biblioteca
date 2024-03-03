public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario, String dataEmprestimo, String dataDevolucao){
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString(){
        return "Emprestimo{" +
                "livro=" + livro +
                ", usuario=" + usuario +
                ", dataEmprestimo='" + dataEmprestimo + '\'' +
                ", dataDevolucao='" + dataDevolucao + '\'' +
                '}';
    }
}
