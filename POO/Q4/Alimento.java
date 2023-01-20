package POO.Q4;

public class Alimento extends ItemDeLoja{
	public Integer selo;
	
	public Alimento() {}

	public Alimento(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem, Integer selo) {
		super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
		this.selo = selo;
	}

	public Integer getSelo() {
		return selo;
	}

	public void setSelo(Integer selo) {
		this.selo = selo;
	}
	
	@Override
	public int getIdentificador() {
		return selo;
	}
}
