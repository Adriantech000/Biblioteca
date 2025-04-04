public class Pessoa {
    private String nome;
    private String cpf;
    private int id;
    private String tel;

    public Pessoa(String nome, String cpf, int id, String tel) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
        this.tel = tel;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    
}
