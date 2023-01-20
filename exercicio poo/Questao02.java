
    import java.util.Date;

public class Questao02 {
	
	private int id;
	private String nome;
	private String descricao;
	private Date validade;
	
	public Questao02(int id, String nome, String descricao, Date validade) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.validade = validade;
	}

	public Questao02() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	public int getCod() {
	return id;
	}
}
