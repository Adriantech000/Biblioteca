
public class Livro {

    private String nome;
    private String autor;
    private int anoPubli;
    private Boolean disponivel;

    public Livro(String nome, String autor, int anoPubli, Boolean disponivel) {
        this.nome = nome;
        this.autor = autor;
        this.anoPubli = anoPubli;
        this.disponivel = true;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + autor + ", ID: " + anoPubli + ", Telefone: " + disponivel;
    }
}
