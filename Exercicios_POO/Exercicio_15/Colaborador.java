package Exercicio_15;

public class Colaborador {
	 private String ctps;
	    private String pis;
	    private String tituloEleitor;
	    private boolean reservista;
	    private String estadoCivil;
	    public int numDependentes;
	    public boolean ativo;
	    public String setor;
	    public String cargo;
	    public float salario;
	    public String telefone1;
	    public String telefone2;
	    public String emailPessoal;
	    public String emailCorporativo;

	    public void admitir(){
	        System.out.println("classe: Colaborador, método: admitir()");
	    }
	    public void demitir(){
	        System.out.println("classe: Colaborador, método: demitir()");
	    }

	    //getters e setters
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
	    public boolean isReservista() {
	        return reservista;
	    }
	    public void setReservista(boolean reservista) {
	        this.reservista = reservista;
	    }
	    public String getEstadoCivil() {
	        return estadoCivil;
	    }
	    public void setEstadoCivil(String estadoCivil) {
	        this.estadoCivil = estadoCivil;
	    }
	    public int getNumDependentes() {
	        return numDependentes;
	    }
	    public void setNumDependentes(int numDependentes) {
	        this.numDependentes = numDependentes;
	    }
	    public boolean isAtivo() {
	        return ativo;
	    }
	    public void setAtivo(boolean ativo) {
	        this.ativo = ativo;
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
	    public float getSalario() {
	        return salario;
	    }
	    public void setSalario(float salario) {
	        this.salario = salario;
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
	    public String getEmailCorporativo() {
	        return emailCorporativo;
	    }
	    public void setEmailCorporativo(String emailCorporativo) {
	        this.emailCorporativo = emailCorporativo;
	    }

	    
	}


