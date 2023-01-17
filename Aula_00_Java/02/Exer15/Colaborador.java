package Exer15;

public class Colaborador extends Fisica{
    private String ctps, pis, tituloEleitor, estadoCivil, setor, cargo, telefone1, telefone2, emailPessoal, emailCoporativo;
    private boolean reservista, ativo;
    private int numDependentes;
    private float salario;
    public String getCtps() {
        return ctps;
    }
    public void setCtps(String ctps) {
        this.ctps = ctps;
    }
    public String getPis() {
        return pis;
    }
    public void setPis(String pis) {
        this.pis = pis;
    }
    public String getTituloEleitor() {
        return tituloEleitor;
    }
    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getTelefone1() {
        return telefone1;
    }
    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }
    public String getTelefone2() {
        return telefone2;
    }
    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }
    public String getEmailPessoal() {
        return emailPessoal;
    }
    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }
    public String getEmailCoporativo() {
        return emailCoporativo;
    }
    public void setEmailCoporativo(String emailCoporativo) {
        this.emailCoporativo = emailCoporativo;
    }
    public boolean isReservista() {
        return reservista;
    }
    public void setReservista(boolean reservista) {
        this.reservista = reservista;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    public int getNumDependentes() {
        return numDependentes;
    }
    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void admitir(){}
    public void demitir(){}
    private Usuario usuario = new Usuario();
}
