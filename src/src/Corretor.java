public class Corretor {
    private String nomeCorretor;
    private int idadeCorretor;
    private boolean terminouEnsinoMedio;
    private boolean diplomaTTI;
    private boolean registroCRECI;

    public Corretor(String nomeCorretor, int idadeCorretor, boolean terminouEnsinoMedio, boolean diplomaTTI, boolean registroCRECI) {
        this.nomeCorretor= nomeCorretor;
        this.idadeCorretor = idadeCorretor;
        this.terminouEnsinoMedio = terminouEnsinoMedio;
        this.diplomaTTI = diplomaTTI;
        this.registroCRECI = registroCRECI;
    }

    public String getNomeCorretor() {
        return nomeCorretor;
    }

    public int getIdadeCorretor() {
        return idadeCorretor;
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

    public void setNomeCorretor(String nomeCorretor) {
            this.nomeCorretor = nomeCorretor.toUpperCase();
    }

    public void setIdadeCorretor(int idadeCorretor) {
            this.idadeCorretor = idadeCorretor;
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
        System.out.println("Nome: " + nomeCorretor);
        System.out.println("Idade: " + idadeCorretor);
        System.out.println("Concluiu ensino médio: " + terminouEnsinoMedio);
        System.out.println("Possui diploma TTI: " + diplomaTTI);
        System.out.println("Apresentou registro CRECI: " + registroCRECI);
    }
}


