
import java.util.Random;

public class Livro {

    private String nome;
    private String autor;
    private int anoPubli;
    private int codi;
    private Boolean disponivel;

    private Pessoa dono;

    public Livro(String nome, String autor, int anoPubli, Boolean disponivel) {
        this.nome = nome;
        this.autor = autor;
        this.anoPubli = anoPubli;
        this.disponivel = true;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
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

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + autor + ", ID: " + anoPubli + ", Telefone: " + disponivel + ", Dono:" + dono;
    }

    public int gerarCodigo() {
        Random rand = new Random();
        //gera um numero entre 100 a 999
        int gerarNum = 100 + rand.nextInt(900);
        this.codi = gerarNum;
        return this.codi;
    }
}
