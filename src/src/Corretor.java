public class Corretor {
    private String nome;
    private int idade;
    private boolean terminouEnsinoMedio;
    private boolean diplomaTTI;
    private boolean registroCRECI;

    public Corretor(String nome, int idade, boolean terminouEnsinoMedio, boolean diplomaTTI, boolean registroCRECI) {
        this.nome = nome;
        this.idade = idade;
        this.terminouEnsinoMedio = terminouEnsinoMedio;
        this.diplomaTTI = diplomaTTI;
        this.registroCRECI = registroCRECI;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public boolean getTerminouEnsinoMedio() {
        return terminouEnsinoMedio;
    }

    public boolean getDiplomaTTI() {
        return diplomaTTI;
    }

    public boolean getRegistroCRECI() {
        return registroCRECI;
    }

    public void setNome(String nome) {
            this.nome = nome.toUpperCase();
    }

    public void setIdade(int idade) {
            this.idade = idade;
    }

    public void setTerminouEnsinoMedio(boolean terminouEnsinoMedio) {
            this.terminouEnsinoMedio = terminouEnsinoMedio;
    }

    public void setDiplomaTTI(boolean diplomaTTI) {
            this.diplomaTTI = diplomaTTI;
    }

    public void setRegistroCRECI(boolean registroCRECI) {
            this.registroCRECI = registroCRECI;
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


