public class Corretor {
    private String nome;
    private int idade;
    private String terminouEnsinoMedio;
    private String diplomaTTI;
    private String registroCRECI;

    public Corretor(String nome, int idade, String terminouEnsinoMedio, String diplomaTTI, String registroCRECI) {
        setNome(nome);
        setIdade(idade);
        setTerminouEnsinoMedio(terminouEnsinoMedio);
        setDiplomaTTI(diplomaTTI);
        setRegistroCRECI(registroCRECI);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public String getTerminouEnsinoMedio() {
        return terminouEnsinoMedio;
    }

    public String getDiplomaTTI() {
        return diplomaTTI;
    }

    public String getRegistroCRECI() {
        return registroCRECI;
    }

    public void setNome(String nome) {
            this.nome = nome.toUpperCase();
    }

    public void setIdade(int idade) {
            this.idade = idade;
    }

    public void setTerminouEnsinoMedio(String terminouEnsinoMedio) {
            this.terminouEnsinoMedio = "Sim.";
    }

    public void setDiplomaTTI(String diplomaTTI) {
            this.diplomaTTI = "Sim.";
    }

    public void setRegistroCRECI(String registroCRECI) {
            this.registroCRECI = "Sim.";
    }

    public void mostrarInformacoesCorretor() {
        System.out.println("Dados do Corretor:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Concluiu ensino médio: " + terminouEnsinoMedio);
        System.out.println("Possui diploma TTI: " + diplomaTTI);
        System.out.println("Apresentou registro CRECI: " + registroCRECI);
    }
}


