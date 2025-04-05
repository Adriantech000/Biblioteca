
import com.sun.source.doctree.EscapeTree;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();
    ArrayList<Livro> listaLivro = new ArrayList<Livro>();

    public void cadastroDePessoa() {
        int qnt = 0;
        do {

            System.out.println("Digite o nome do usuário:");
            String nome = scanner.nextLine();

            System.out.println("Digite o CPF do usuário:");
            String cpf = scanner.nextLine();

            int id = 100 + random.nextInt(900);

            System.out.println("Digite o TEL. do usuário:");
            String telefone = scanner.nextLine();

            Pessoa novaPessoa = new Pessoa(nome, cpf, id, telefone);
            listaPessoa.add(novaPessoa);

            System.out.println("Quer adicionar mais pessoas? (0-continuar)(1-parar)");
            qnt = scanner.nextInt();

        } while (qnt == 0);

    }

    public void cadastrarLivro() {
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();

        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();

        System.out.println("Digite o ano de publicação do livro:");
        int anoPublicacao = scanner.nextInt();
        scanner.nextLine();

        Livro novoLivro = new Livro(titulo, autor, anoPublicacao, true);
        listaLivro.add(novoLivro);

        System.out.println("Livro cadastrado com sucesso!");
    }

    public void emprestarLivroUltimaPessoa() {
        if (listaPessoa.isEmpty()) {
            System.out.println("Não há pessoas cadastradas para emprestar o livro.");
            return;
        }

        if (listaLivro.isEmpty()) {
            System.out.println("Não há livros disponíveis para emprestar.");
            return;
        }
        System.out.println("Qual pessoa tu quer pegar ?");
        int escolha = scanner.nextInt();
        System.out.println("Qual livro?");
        int escolhali = scanner.nextInt();

        Pessoa escolhaPessoa = listaPessoa.get(escolha);
        Livro livroParaEmprestar = listaLivro.get(escolhali);

        livroParaEmprestar.setDono(escolhaPessoa);

        livroParaEmprestar.setDisponivel(false);
        System.out.println("Livro '" + livroParaEmprestar.getNome() + "' emprestado para " + escolhaPessoa.getNome() + ".");
    }

    public void mostrarPessoa() {
        System.out.println("Lista de pessoas cadastradas:");
        //lista para mostrar as pessoas na lista.
        for (Pessoa pessoa : listaPessoa) {
            System.out.println(pessoa);
        }
    }
    public void mostrarLivro(){
        System.out.println("Lista de livros cadastradas:");
        //lista para mostrar as pessoas na lista.
        for (Livro listaLivro : listaLivro) {
            System.out.println(listaLivro);
        }
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        int opcao;
        do {
            System.out.println("\n=== MENU BIBLIOTECA ===");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Mostrar Pessoas");
            System.out.println("3 - Adicionar Livro");
            System.out.println("4 - Emprestar Livro");
            System.out.println("5 - Mostrar Livros");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = app.scanner.nextInt();
            app.scanner.nextLine(); // limpa o \n do buffer

            switch (opcao) {
                case 1:
                    app.cadastroDePessoa();
                    break;
                case 2:
                    if (app.listaPessoa.isEmpty()) {
                        System.out.println("Não tem pessoas!");
                    } else {
                        app.mostrarPessoa();
                    }
                    break;
                case 3:
                    app.cadastrarLivro();
                    break;
                case 4:
                    app.emprestarLivroUltimaPessoa();
                    break;
                case 5:
                    app.mostrarLivro();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

}
