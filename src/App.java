
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.event.ListDataEvent;

public class App {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();

    public void cadastroDePessoa() {
        System.out.println("Quantas pessoas quer adicionar?");
        int qnt = scanner.nextInt();

        for (int i = 0; i < qnt; i++) {

            System.out.println("Digite o nome do usuário:");
            String nome = scanner.nextLine();

            System.out.println("Digite o CPF do usuário:");
            String cpf = scanner.nextLine();

            int id = random.nextInt(100);

            System.out.println("Digite o TEL. do usuário:");
            String telefone = scanner.nextLine();

            Pessoa novaPessoa = new Pessoa(nome, cpf, id, telefone);
            listaPessoa.add(novaPessoa);

        }

    }

    public void mostrarPessoa() {
        System.out.println("Lista de pessoas cadastradas:");
        for (Pessoa pessoa : listaPessoa) {
            System.out.println(pessoa);
        }
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        //criar o painel do programa

        System.out.println("BIBLIOTECA!");
        System.out.println("1-Cadastrar Pessoa");
        int escolha = app.scanner.nextInt();

        switch (escolha) {
            case 1:
                app.cadastroDePessoa();
                break;
            case 2:
                if (app.listaPessoa.isEmpty()) {
                    System.out.println("Não tem pesssoas!");
                } else {
                    app.mostrarPessoa();
                }
                
                break;
            default:
                System.out.println("Opção invalida.");
        }
    }
}
