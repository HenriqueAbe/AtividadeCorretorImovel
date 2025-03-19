import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Imovel> imoveis = new ArrayList<>();

        while (true) {
            System.out.print("Escolha uma das opções: \n 1 - Cadastrar corretor. \n 2 - Cadastras cliente. \n 3 - Cadastrar imóvel. \n 4 - Listar corretor(es). \n 5 - Listar cliente(s).  \n 6 - Listar imóveis. \n 7 - Sair. \n Digite o número: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.print("Digite o tipo do imóvel (Apartamento ou Casa): ");
                    String tipoImovel = scanner.nextLine();

                    System.out.print("Digite o endereço: ");
                    String endereco = scanner.nextLine();

                    System.out.print("Digite os metros quadrados: ");
                    int metrosQuadrados = scanner.nextInt();
                    scanner.nextLine();

                    Imovel imovelNovo = new Imovel(tipoImovel, endereco, metrosQuadrados);
                    imoveis.add(imovelNovo);
                    System.out.println("Imóvel cadastrado com sucesso!");
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Imóveis cadastrados: ");
                    for (Imovel i : imoveis) {
                        i.mostrarInformacoes();
                        System.out.println("------------");
                    }
                    break;
                case 7:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
