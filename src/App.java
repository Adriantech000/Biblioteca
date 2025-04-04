
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.event.ListDataEvent;

public class App {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();

    public void cadastroDePessoa() {
        int qnt = 0;
        do {

            System.out.println("Digite o nome do usuário:");
            String nome = scanner.nextLine();

            System.out.println("Digite o CPF do usuário:");
            String cpf = scanner.nextLine();

            int id = random.nextInt(100);

            System.out.println("Digite o TEL. do usuário:");
            String telefone = scanner.nextLine();

            Pessoa novaPessoa = new Pessoa(nome, cpf, id, telefone);
            listaPessoa.add(novaPessoa);

            System.out.println("Quer adicionar mais pessoas? (0-continuar)(1-parar)");
            qnt = scanner.nextInt();

        }while(qnt == 0);

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
        System.out.println("2-Mostrar Pessoas");
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
