import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private List<Imovel> imoveis = new ArrayList<>();
    private List<Corretor> corretores = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public void exibirMenu() {
        while (true) {
            System.out.print("Escolha uma das opções: \n 1 - Cadastrar corretor. \n 2 - Cadastras cliente. \n 3 - Cadastrar imóvel. \n 4 - Listar corretor(es). \n 5 - Listar cliente(s).  \n 6 - Listar imóveis. \n 7 - Sair. \n Digite o número: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {

                case 1:
                    cadastrarCorretor();
                    break;
                case 2:
                    cadastrarCliente();
                    break;
                case 3:
                    cadastrarImovel();
                    break;
                case 4:
                    listarCorretor();
                    break;
                case 5:
                    listarCliente();
                    break;
                case 6:
                    listarImovel();
                case 7:
                    sairPrograma();
                    return;
                default:
                    System.out.println("Opção inválida.");

            }
        }
    }

    private void cadastrarCorretor() {
        System.out.println("Cadastrando corretor.");
        System.out.print("Nome: ");
        String nomeCorretor = scanner.nextLine();
        if (nomeCorretor.isEmpty()) {
            System.out.println("Nome inválido.");
            System.out.println("Para continuar aperte ENTER.");
            scanner.nextLine();
            return;
        }

        System.out.print("Idade: ");
        int idadeCorretor = scanner.nextInt();
        scanner.nextLine();
        if (idadeCorretor < 18) {
            System.out.println("Idade mínima é 18 anos.");
            System.out.println("Para continuar aperte ENTER.");
            scanner.nextLine();
            return;
        }

        System.out.print("Terminou ensino médio(Sim ou Não): ");
        String terminouEnsinoMedioString = scanner.nextLine().toLowerCase();
        boolean terminouEnsinoMedio = terminouEnsinoMedioString.equals("s") || terminouEnsinoMedioString.equals("sim");
        if (!terminouEnsinoMedio) {
            System.out.println("Precisa ter o esino médio completo para poder ser corretor.");
            System.out.println("Para voltar ao menu pressione ENTER.");
            scanner.nextLine();
            return;
        }

        System.out.print("Possuí o diploma TTI(Sim ou Não): ");
        String diplomaTTIString = scanner.nextLine().toLowerCase();
        boolean diplomaTTI = diplomaTTIString.equals("s") || diplomaTTIString.equals("sim");
        if (!diplomaTTI) {
            System.out.println("Diploma TTI é necessário para poder ser corretor.");
            System.out.println("Para voltar ao menu pressione ENTER.");
            scanner.nextLine();
            return;
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
        System.out.println("Corretor " + nomeCorretor + " cadastrado com sucesso!");
        System.out.println("Pressione ENTER para voltar ao menu.");
        scanner.nextLine();
    }

    private void cadastrarCliente() {
        System.out.println("Cadastrando cliente.");
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        if (nomeCliente.isEmpty()) {
            System.out.println("Nome inválido.");
            System.out.println("Para voltar ao menu pressione ENTER.");
            scanner.nextLine();
            return;
        }

        System.out.print("Idade do cliente: ");
        int idadeCliente = scanner.nextInt();
        scanner.nextLine();
        if (idadeCliente < 18) {
            System.out.println("Idade mínima é 18 anos.");
            System.out.println("Para voltar ao menu pressione ENTER.");
            scanner.nextLine();
            return;
        }

        System.out.print("CPF do cliente: ");
        String cpfCliente = scanner.nextLine();
        if (cpfCliente.matches("[a-zA-Z]+")) {
            System.out.println("CPF possuí apenas números.");
            System.out.println("Para voltar ao menu pressione ENTER.");
            scanner.nextLine();
            return;
        } else if (cpfCliente.length() != 11) {
            System.out.println("CPF possuí 11 números.");
            System.out.println("Para voltar ao menu pressione ENTER.");
            scanner.nextLine();
            return;
        }

        System.out.print("Endereço do cliente: ");
        String enderecoCliente = scanner.nextLine();
        if(enderecoCliente.isEmpty()) {
            System.out.println("Endereço inválido.");
            System.out.println("Para voltar ao menu pressione ENTER:");
            return;
        }

        System.out.print("Tipo do cliente(Vendedor ou Comprador): ");
        String tipoCliente  = scanner.nextLine();
        if(tipoCliente.isEmpty()) {
            System.out.println("Tipo de cliente inválido.");
            System.out.println("Para voltar ao menu pressione ENTER.");
            return;
        }

        Cliente clienteNovo = new Cliente(nomeCliente, idadeCliente, cpfCliente, enderecoCliente, tipoCliente);
        clientes.add(clienteNovo);
        System.out.println("Cliente " + nomeCliente + " cadastrado com sucesso.\n Aperte ENTER para voltar ao menu.");
    }

    private void cadastrarImovel() {
        System.out.println("Cadastrando imóvel.");
        System.out.print("Digite o tipo do imóvel (Apartamento ou Casa): ");
        String tipoImovel = scanner.nextLine();
        if (tipoImovel.isEmpty()) {
            System.out.println("Ímovel sem nome não pode ser cadastrado.");
            System.out.println("Para continuar aperte ENTER.");
            scanner.nextLine();
            return;
        }

        System.out.print("Digite o endereço: ");
        String enderecoImovel = scanner.nextLine();
        if (enderecoImovel.isEmpty()) {
            System.out.println("Para cadastrar um ímovel precisa do seu endereço.");
            System.out.println("Para continuar aperte ENTER.");
            scanner.nextLine();
            return;
        }

        System.out.print("Digite os metros quadrados: ");
        int metrosQuadrados = scanner.nextInt();
        scanner.nextLine();
        if (metrosQuadrados > 0) {
            System.out.println("Para continuar aperte ENTER.");
            scanner.nextLine();
            return;
        }

        Imovel imovelNovo = new Imovel(tipoImovel, enderecoImovel, metrosQuadrados);
        imoveis.add(imovelNovo);
        System.out.println("Imóvel cadastrado com sucesso!");
        System.out.println("Pressione ENTER para voltar ao menu.");
        scanner.nextLine();
    }

    private void listarCorretor() {
        System.out.println("Corretores cadastrados: ");
        for (Corretor i : corretores) {
            i.mostrarInformacoesCorretor();
            System.out.println("------------");
        }
        System.out.println("Para voltar ao menu pressione ENTER.");
        scanner.nextLine();
    }

    private void listarCliente() {
        System.out.println("Clientes cadastrados: ");
        for (Cliente i : clientes) {
            i.mostrarInformacoesCliente();
            System.out.println("------------");
        }
        System.out.println("Para voltar ao menu pressione ENTER.");
        scanner.nextLine();
    }

    private void listarImovel() {
        System.out.println("Imóveis cadastrados: ");
        for (Imovel i : imoveis) {
            i.mostrarInformacoesImovel();
            System.out.println("------------");
        }
        System.out.println("Para voltar ao menu pressione ENTER.");
        scanner.nextLine();
    }

    private void sairPrograma() {
        System.out.println("Saindo do programa.");
        scanner.close();
    }
}