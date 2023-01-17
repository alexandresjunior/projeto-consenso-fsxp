package TreinaRecifePoo04;



public class Ferramenta extends itemDeLoja{
	public String categoria;
	public Integer serial;
	
	public int getIdentificador() {
		return this.serial;
	}
	
	public void  separar() {
		this.categoria = "outros";
	}
	public void separar(String categoria) {
		this.categoria = categoria;
	}
	
}
