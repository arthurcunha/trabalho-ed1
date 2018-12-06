
public class Caixa extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Caixa() {
		this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		return 450;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
