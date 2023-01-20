package QuestaoPoo15;

public class Parceiro {

    private String tipoPessoa;
    private float desempenho;
    private double numeroParceiros = 0;

    public Parceiro(){
        this.numeroParceiros++;
    }


    public Parceiro(String tipoPessoa,float desempenho){
        this.tipoPessoa = tipoPessoa;
        this.desempenho = desempenho;

        this.numeroParceiros++;
    }

   public void cadastrar(){
    System.out.println("Classe: Parceiro\nmetodo: Cadastrar");
   }

   public void bloqueiar(){
    System.out.println("Classe: Parceiro\nmetodo: bloqueiar");
   }
   public void excluir(){
    System.out.println("Classe: Parceiro\nmetodo: excluir");
   }


public String getTipoPessoa() {
    return tipoPessoa;
}


public void setTipoPessoa(String tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
}


public float getDesempenho() {
    return desempenho;
}


public void setDesempenho(float desempenho) {
    this.desempenho = desempenho;
}


public double getNumeroParceiros() {
    return numeroParceiros;
}


public void setNumeroParceiros(double numeroParceiros) {
    this.numeroParceiros = numeroParceiros;
}


public Parceiro add(Parceiro parceiros) {
    return null;
}


}