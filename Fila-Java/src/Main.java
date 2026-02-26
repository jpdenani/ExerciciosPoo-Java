import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila();

        int opcao = 6;

        while (opcao != 0) {

            System.out.println("\n=== MENU FILA ===");
            System.out.println("1 - Consultar fila");
            System.out.println("2 - Inserir nome");
            System.out.println("3 - Excluir nome");
            System.out.println("4 - Mostrar primeiro nome");
            System.out.println("5 - Limpar fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    fila.Consultar();
                    break;

                case 2:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    fila.Inserir(nome);
                    System.out.println("Nome inserido!");
                    break;

                case 3:
                    String removido = fila.excluir();

                    if (removido != null)
                        System.out.println("Removido: " + removido);

                    break;

                case 4:
                    String primeiro = fila.primeiro();

                    if (primeiro != null)
                        System.out.println("Primeiro da fila: " + primeiro);

                    break;

                case 5:
                    fila.limpar();
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}