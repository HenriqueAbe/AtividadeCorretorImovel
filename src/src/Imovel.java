public class Imovel {
    private String tipoImovel;
    private String endereco;
    private int metrosQuadrados;

    public Imovel(String tipoImovel, String endereco, int metrosQuadrados) {
        this.tipoImovel = tipoImovel.toUpperCase();
        this.endereco = endereco.toUpperCase();
        this.metrosQuadrados = metrosQuadrados;
    }

    public String getTipoImovel() {
        if (tipoImovel == "") {
            System.out.print("Não cadastrado.");
        }
        return tipoImovel;
    }

    public String getEndereco() {
        if (endereco == "") {
            System.out.println("Sem endereço.");
        }
        return endereco;
    }

    public int getMetrosQuadrados() {
        if (metrosQuadrados == 0 ) {
            System.out.println("Sem área.");
        }
        return metrosQuadrados;
    }

    public void setTipoImovel(String tipoImovel) {
        if (tipoImovel.isEmpty()) {
            System.out.println("Imóvel não cadastrado.");
        } else {
            this.tipoImovel = tipoImovel.toUpperCase();
        }
    }

    public void setEndereco(String endereco) {
        if (endereco.isEmpty()) {
            System.out.println("Sem endereço.");
        } else {
            this.endereco = endereco.toUpperCase();
        }
    }

    public void setMetrosQuadrados(int metrosQuadrados) {
        if (metrosQuadrados == 0) {
            System.out.println("Área não cadastrada.");
        } else {
            this.metrosQuadrados = metrosQuadrados;
        }
    }
}
