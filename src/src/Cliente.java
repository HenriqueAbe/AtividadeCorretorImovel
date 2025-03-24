import java.lang.ref.SoftReference;

public class Cliente {
    private String nomeCliente;
    private int idadeCliente;
    private double cpf;
    private String enderecoCliente;
    private String tipoCliente;

    public Cliente(String nomeCliente, int idadeCliente, double cpf, String enderecoCliente, String tipoCliente) {
        this.nomeCliente = nomeCliente;
        this.idadeCliente = idadeCliente;
        this.cpf = cpf;
        this.enderecoCliente = enderecoCliente;
        this.tipoCliente = tipoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public double getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return enderecoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setNome(String nome) {
        this.nomeCliente = nome;
    }

    public void setIdade(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
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
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + enderecoCliente);
        System.out.println("Tipo de cliente: " + tipoCliente);
    }
}
