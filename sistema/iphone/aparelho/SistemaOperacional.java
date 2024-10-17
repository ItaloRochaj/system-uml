package sistema.iphone.aparelho;


import java.util.Scanner;

import sistema.iphone.Iphone;

public class SistemaOperacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iphone iPhone = new Iphone();
        int opcao = 0;

        String aplicativo = """
                \n---- Escolha o aplicativo ----
                1. Reprodutor musical
                2. Aparelho telefônico
                3. Navegador de internet
                4. Encerrar aparelho
                """;
        
        while (opcao != 4) {
            System.out.println(aplicativo);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    menuReprodutorMusical(iPhone, scanner);
                    break;
                case 2:
                    menuAparelhoTelefonico(iPhone, scanner);
                    break;
                case 3:
                    menuNavegadorNaInternet(iPhone, scanner);
                    break;
                case 4:
                    System.out.println("Encerrando o aparelho");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
        scanner.close();  // Fechar o scanner após o uso
    }

    private static void menuReprodutorMusical(Iphone iPhone, Scanner scanner) {
        int opcao = 0;

        String reprodutorMusical = """
                \nReprodutor Musical:
                1. Tocar música
                2. Pausar música
                3. Selecionar música
                4. Voltar ao menu principal
                """;

        while (opcao != 4) {
            System.out.println(reprodutorMusical);
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    iPhone.tocar();
                    break;
                case 2:
                    iPhone.pausar();
                    break;
                case 3:
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    iPhone.selecionarMusica(musica);
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private void selecionarMusica(String musica) {
        // TODO
    }

    private void pausar() {
        // TODO
    }

    private void tocar() {
        // TODO
    }

    private static void menuAparelhoTelefonico(Iphone iPhone, Scanner scanner) {
        int opcao = 0;

        String aparelhoTelefonico = """
                \nAparelho Telefônico:
                1. Ligar
                2. Atender
                3. Iniciar correio de voz
                4. Voltar ao menu principal
                """;

        while (opcao != 4) {
            System.out.println(aparelhoTelefonico);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número para ligar: ");
                    String numero = scanner.nextLine();
                    iPhone.ligar(numero);
                    break;
                case 2:
                    iPhone.atender();
                    break;
                case 3:
                    iPhone.iniciarCorreioVoz();
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void menuNavegadorNaInternet(Iphone iPhone, Scanner scanner) {
        int opcao = 0;

        String navegadorInternet = """
                \nNavegador de Internet:
                1. Exibir página na internet
                2. Adicionar nova aba
                3. Atualizar página
                4. Voltar ao menu principal
                """;

        while (opcao != 4) {
            System.out.println(navegadorInternet);
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    iPhone.exibirPagina(url);
                    break;
                case 2:
                    iPhone.adicionarNovaAba();
                    break;
                case 3:
                    iPhone.atualizarPagina();
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
