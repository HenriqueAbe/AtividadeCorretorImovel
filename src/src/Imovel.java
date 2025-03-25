public class Imovel {
    private String tipoImovel;
    private String enderecoImovel;
    private int metrosQuadrados;

    public Imovel(String tipoImovel, String enderecoImovel, int metrosQuadrados) {
        this.tipoImovel = tipoImovel.toUpperCase();
        this.enderecoImovel = enderecoImovel.toUpperCase();
        this.metrosQuadrados = metrosQuadrados;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public String getEnderecoImovel() {
        return enderecoImovel;
    }

    public int getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public void setTipoImovel(String tipoImovel) {
            this.tipoImovel = tipoImovel.toUpperCase();
    }

    public void setEnderecoImovel(String endereco) {
            this.enderecoImovel = enderecoImovel.toUpperCase();
    }

    public void setMetrosQuadrados(int metrosQuadrados) {
            this.metrosQuadrados = metrosQuadrados;
    }

    public void mostrarInformacoesImovel() {
        System.out.println("Tipo do imóvel: " + tipoImovel);
        System.out.println("Endereço: " + enderecoImovel);
        System.out.println("Metros quadrados: " + metrosQuadrados);
    }


}

