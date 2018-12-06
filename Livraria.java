
public class Livraria {

	private String nome;
	private String local;
	private int capacidade;
	private Livro[] livros;
	private int quantidade;

	public Livraria() {
	}

	public Livraria(String nome, String local, int capacidade) {
		setLocal(local);
		setNome(nome);
		livros = new Livro[capacidade];
		this.capacidade = capacidade;
		quantidade = 0;
	}

	public String getNome() {
		return nome;
	}

	public String getLocal() {
		return local;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public void criaLivros(int capacidade) {
		this.capacidade = capacidade;
		livros = new Livro[capacidade];
	}

	public void incluirLivro(Livro livro) {
		if (quantidade < capacidade) {
			quantidade++;
			livros[quantidade - 1] = livro;
		}
	}

	public Livro obterLivro(int cod) {
		for (int i = 0; i < quantidade; i++)
			if (livros[i] != null)
				if (livros[i].getCodigo() == cod)
					return livros[i];
		return null;
	}

	public Livro obterLivro(String tit) {
		for (int i = 0; i < quantidade; i++)
			if (livros[i] != null)
				if (livros[i].getTitulo().indexOf(tit) >= 0)
					return livros[i];
		return null;
	}

	public Livro getLivro(int posicao) {
		if (posicao < quantidade)
			return livros[posicao];
		else
			return null;
	}

}
