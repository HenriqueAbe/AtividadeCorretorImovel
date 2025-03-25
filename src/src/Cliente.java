
public class Cliente {
    private String nomeCliente;
    private int idadeCliente;
    private String cpfCliente;
    private String enderecoCliente;
    private String tipoCliente;

    public Cliente(String nomeCliente, int idadeCliente, String cpfCliente, String enderecoCliente, String tipoCliente) {
        this.nomeCliente = nomeCliente;
        this.idadeCliente = idadeCliente;
        this.cpfCliente = cpfCliente;
        this.enderecoCliente = enderecoCliente;
        this.tipoCliente = tipoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void mostrarInformacoesCliente() {
        System.out.println("Dados clientes: ");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Idade: " + idadeCliente);
        System.out.println("CPF: " + cpfCliente);
        System.out.println("Endereço: " + enderecoCliente);
        System.out.println("Tipo de cliente: " + tipoCliente);
    }
}
