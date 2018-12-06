
public class Livro {

	private int codigo;
	private String titulo;
	private String autor;
	private String ISBN;
	private int numPaginas;
	private float valorVenda;

	public Livro() {
	}

	public Livro(int codigo, String ISBN, String titulo, String autor, int numPaginas, float valorVenda) {
		setAutor(autor);
		setCodigo(codigo);
		setISBN(ISBN);
		setNumPaginas(numPaginas);
		setTitulo(titulo);
		setValorVenda(valorVenda);
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public float getValorVenda() {
		return valorVenda;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

}
