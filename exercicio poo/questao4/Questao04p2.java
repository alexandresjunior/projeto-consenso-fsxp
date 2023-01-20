package questao4;

public class Questao04p2 extends Questao04{
    private String categoria;
	private int serial;


	public String getCategoria() {
	    return categoria;
	}
	public void setCategoria(String categoria) {
	    this.categoria = categoria;
	}
	public int getSerial() {
	    return serial;
	}
	public void setSerial(int serial) {
	    this.serial = serial;
	}

	@Override
	public int getIdentificador(){
	    return this.serial;
	}

	public void separar(){
	    System.out.println("Outros");
	}

	public String separar(String categoria){
	    return this.categoria;
	}
	
}
