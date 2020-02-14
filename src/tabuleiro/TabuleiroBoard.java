package tabuleiro;

public class TabuleiroBoard {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	
	public TabuleiroBoard(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}
	
	
}
