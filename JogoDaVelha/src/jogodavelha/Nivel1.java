package jogodavelha; // Pacote que armazenará as Classes

public class Nivel1 implements Computador // Classe Filha "Nivel1" pertencente à Classe Mãe "Computador" que representará a dificuldade "Fácil"
{
	protected PreencherTabuleiro icone;

	public Nivel1() 
	{
		super();
		icone = new PreencherTabuleiro(0, 0, 2);
	}

	public void joga(Tabuleiro tab)
	{
		Boolean jogou = false; // Permite que seja realizada apenas uma jogada por vez
		
		
		for (int i = 0; i < 3; i++)             // No primeiro nível de dificuldade, o Computador irá fazer a leitura do tabuleiro seguindo a ordem das linhas(horizontalmente),
			if (jogou == false)                 // Irá pular os espaços ocupados e marcar os espaços vazios
				for (int j = 0; j < 3; j++)
					if (tab.getPosicao(i, j) == 0) 
					{
						icone.x = i;
						icone.y = j;
						tab.preenchePosicao(icone);
						jogou = true;
						break;
					}
	}
}
