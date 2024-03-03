public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean diponivel;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.diponivel = true;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDiponivel() {
        return diponivel;
    }

    public void setDiponivel(boolean diponivel) {
        this.diponivel = diponivel;
    }

    @Override
    public String toString(){
       return  "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", disponivel=" + diponivel +
                '}';
    }
}
