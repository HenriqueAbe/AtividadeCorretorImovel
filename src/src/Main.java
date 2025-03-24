import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Imovel> imoveis = new ArrayList<>();
        List<Corretor> corretores = new ArrayList<>();

        while (true) {
            System.out.print("Escolha uma das opções: \n 1 - Cadastrar corretor. \n 2 - Cadastras cliente. \n 3 - Cadastrar imóvel. \n 4 - Listar corretor(es). \n 5 - Listar cliente(s).  \n 6 - Listar imóveis. \n 7 - Sair. \n Digite o número: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    if (nome.isEmpty()) {
                        System.out.println("Nome inválido.");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    }

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    if (idade < 18) {
                        System.out.println("Idade mínima é 18 anos.");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    }

                    System.out.print("Terminou ensino médio(SIM = s, NÃO = n): ");
                    String terminouEnsinoMedio = scanner.nextLine().toLowerCase();
                    if (!terminouEnsinoMedio.equals("s")) {
                        System.out.println("Precisa do ensino médio para trabalhar como corretor.");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    }

                    System.out.print("Possuí o diploma TTI(SIM = s, NÃO = n): ");
                    String diplomaTTI = scanner.nextLine().toLowerCase();
                    if (!diplomaTTI.equals("s")) {
                        System.out.println("Precisa do diploma TTI para trabalhar como corretor.");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    }

                    System.out.print("Tem o registro CRECI(SIM = s, NÃO = n): ");
                    String registroCRECI = scanner.nextLine().toLowerCase();
                    if (!registroCRECI.equals("s")) {
                        System.out.println("Precisa do registro CRECI para trabalhar como corretor.");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    }

                    Corretor corretorNovo = new Corretor(nome, idade, terminouEnsinoMedio, diplomaTTI, registroCRECI);
                    corretores.add(corretorNovo);
                    System.out.println("Corretor cadastrado com sucesso!");
                    break;
                case 2:
                    break;
                case 3:
                    System.out.print("Digite o tipo do imóvel (Apartamento ou Casa): ");
                    String tipoImovel = scanner.nextLine();
                    if (tipoImovel.isEmpty()) {
                        System.out.println("Ímovel sem nome não pode ser cadastrado.");
                        try  {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    }

                    System.out.print("Digite o endereço: ");
                    String endereco = scanner.nextLine();
                    if (endereco.isEmpty()) {
                        System.out.println("Para cadastrar um ímovel precisa do seu endereço.");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.print("Digite os metros quadrados: ");
                    int metrosQuadrados = scanner.nextInt();
                    scanner.nextLine();
                    if (metrosQuadrados > 0) {
                        System.out.println("Área inválida.");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    Imovel imovelNovo = new Imovel(tipoImovel, endereco, metrosQuadrados);
                    imoveis.add(imovelNovo);
                    System.out.println("Imóvel cadastrado com sucesso!");
                    break;
                case 4:
                    System.out.println("Corretores cadastrados: ");
                    for (Corretor i : corretores) {
                        i.mostrarInformacoesCorretor();
                        System.out.println("------------");
                    }
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Imóveis cadastrados: ");
                    for (Imovel i : imoveis) {
                        i.mostrarInformacoesImovel();
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
