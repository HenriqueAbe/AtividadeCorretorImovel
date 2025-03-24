import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Imovel> imoveis = new ArrayList<>();
        List<Corretor> corretores = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.print("Escolha uma das opções: \n 1 - Cadastrar corretor. \n 2 - Cadastras cliente. \n 3 - Cadastrar imóvel. \n 4 - Listar corretor(es). \n 5 - Listar cliente(s).  \n 6 - Listar imóveis. \n 7 - Sair. \n Digite o número: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeCorretor = scanner.nextLine();
                    if (nomeCorretor.isEmpty()) {
                        System.out.println("Nome inválido.");
                        System.out.println("Para continuar aperte ENTER.");
                        scanner.nextLine();
                        break;
                    }

                    System.out.print("Idade: ");
                    int idadeCorretor = scanner.nextInt();
                    scanner.nextLine();
                    if (idadeCorretor < 18) {
                        System.out.println("Idade mínima é 18 anos.");
                        System.out.println("Para continuar aperte ENTER.");
                        scanner.nextLine();
                        break;
                    }

                    System.out.print("Terminou ensino médio(Sim ou Não): ");
                    String terminouEnsinoMedioString = scanner.nextLine().toLowerCase();
                    boolean terminouEnsinoMedio = terminouEnsinoMedioString.equals("s") || terminouEnsinoMedioString.equals("sim");
                    if (!terminouEnsinoMedio) {
                        System.out.println("Precisa ter o esino médio completo para poder ser corretor.");
                        System.out.println("Para voltar ao menu pressione ENTER.");
                        scanner.nextLine();
                        break;
                    }

                    System.out.print("Possuí o diploma TTI(Sim ou Não): ");
                    String diplomaTTIString = scanner.nextLine().toLowerCase();
                    boolean diplomaTTI = diplomaTTIString.equals("s") || diplomaTTIString.equals("sim");
                    if (!diplomaTTI) {
                        System.out.println("Diploma TTI é necessário para poder ser corretor.");
                        System.out.println("Para voltar ao menu pressione ENTER.");
                        scanner.nextLine();
                        break;
                }

                    System.out.print("Tem o registro CRECI(Sim ou Não): ");
                    String registroCRECIString = scanner.nextLine().toLowerCase();
                    boolean registroCRECI = registroCRECIString.equals("s") || registroCRECIString.equals("sim");
                    if (!registroCRECI) {
                        System.out.println("Registro CRECI é necessário para poder ser corretor.");
                        System.out.println("Para voltar ao menu pressione ENTER.");
                    }

                    Corretor corretorNovo = new Corretor(nomeCorretor, idadeCorretor, terminouEnsinoMedio, diplomaTTI, registroCRECI);
                    corretores.add(corretorNovo);
                    System.out.println("Corretor cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    if (nomeCliente.isEmpty()) {
                        System.out.println("Nome inválido.");
                        System.out.println("Para continuar aperte ENTER.");
                        scanner.nextLine();
                        break;
                    }

                    System.out.print("Idade do cliente: ");
                    int idadeCliente = scanner.nextInt();
                    scanner.nextLine();
                    if (idadeCliente < 18) {
                        System.out.println("Idade mínima é 18 anos.");
                        System.out.println("Para continuar aperte ENTER.");
                        scanner.nextLine();
                        break;
                    }

                    System.out.print("CPF do cliente: ");
                    double cpf = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Endereço do cliente: ");
                    String enderecoCliente = scanner.nextLine();

                    System.out.println("Tipo do cliente(Vendedor ou Comprador): ");
                    String tipoCliente  = scanner.nextLine();

                    Cliente clienteNovo = new Cliente(nomeCliente, idadeCliente, cpf, enderecoCliente, tipoCliente);

                    break;
                case 3:
                    System.out.print("Digite o tipo do imóvel (Apartamento ou Casa): ");
                    String tipoImovel = scanner.nextLine();
                    if (tipoImovel.isEmpty()) {
                        System.out.println("Ímovel sem nome não pode ser cadastrado.");
                        System.out.println("Para continuar aperte ENTER.");
                        scanner.nextLine();
                        break;
                    }

                    System.out.print("Digite o endereço: ");
                    String enderecoImovel = scanner.nextLine();
                    if (enderecoImovel.isEmpty()) {
                        System.out.println("Para cadastrar um ímovel precisa do seu endereço.");
                        System.out.println("Para continuar aperte ENTER.");
                        scanner.nextLine();
                    }

                    System.out.print("Digite os metros quadrados: ");
                    int metrosQuadrados = scanner.nextInt();
                    scanner.nextLine();
                    if (metrosQuadrados > 0) {
                        System.out.println("Para continuar aperte ENTER.");
                        scanner.nextLine();
                    }

                    Imovel imovelNovo = new Imovel(tipoImovel, enderecoImovel, metrosQuadrados);
                    imoveis.add(imovelNovo);
                    System.out.println("Imóvel cadastrado com sucesso!");
                    break;
                case 4:
                    System.out.println("Corretores cadastrados: ");
                    for (Corretor i : corretores) {
                        i.mostrarInformacoesCorretor();
                        System.out.println("------------");
                    }
                    System.out.println("Para voltar ao menu pressione ENTER.");
                    scanner.nextLine();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Imóveis cadastrados: ");
                    for (Imovel i : imoveis) {
                        i.mostrarInformacoesImovel();
                        System.out.println("------------");
                    }
                    System.out.println("Para voltar ao menu pressione ENTER.");
                    scanner.nextLine();
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
