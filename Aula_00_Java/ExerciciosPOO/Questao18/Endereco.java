package ExerciciosPOO.Questao18;

public class Endereco {

    private String rua;
    private int numero;
    private String cep;
    private String complemento;
    private int telefone;
    private String cidade;
    private String bairro;
    
    private Endereco morador;
    private Cliente resiCliente;

    

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public Endereco getMorador() {
        return morador;
    }
    public void setMorador(Endereco morador) {
        this.morador = morador;
    }
    public Cliente getResiCliente() {
        return resiCliente;
    }
    public void setResiCliente(Cliente resiCliente) {
        this.resiCliente = resiCliente;
    }

    

}
