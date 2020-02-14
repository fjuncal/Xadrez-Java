package tabuleiro;

public class Peca {
	protected Posicao position;
	private TabuleiroBoard tabuleiro;
	
	public Peca(TabuleiroBoard tabuleiro) {
		super();
		this.tabuleiro = tabuleiro;
		position = null;
	}

	protected TabuleiroBoard getTabuleiro() {
		return tabuleiro;
	}

	
	
	
}
