package jogodavelha; // Pacote que armazenará as Classes

public class Tabuleiro // Classe "Tabuleiro"
{
	private int matriz[][] = new int[3][3];

	Tabuleiro() 
	{
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				matriz[i][j] = 0;
	}

	public int situacao() // Verifica a situação do jogo (Se o Jogador venceu. se o Computador venceu ou se houve Empate)
	{
		if (verificar() == 1) // Caso o ícone do Jogador possua 3 posições em sequência numa linha, coluna ou diagonal, serão mostradas as seguintes mensagens
		{
			System.out.println("\nO Jogador venceu!");
			System.out.println("\nJogo finalizado!");
			this.imprime();
			return 1;
		} 
		
		else if (verificar() == 2) // Caso o ícone do Computador possua 3 posições em sequência numa linha, coluna ou diagonal, serão mostradas as seguintes mensagens
		{
			System.out.println("\nO Computador venceu!");
			System.out.println("\nJogo finalizado!");
			this.imprime();
			return 2;
		} 
		
		else if (tabuleirocompleto() == true) // Caso nenhum dos ícones possua 3 posições em sequência numa linha, coluna ou diagonal e o tabuleiro esteja totalmente preenchido, serão mostradas as seguintes mensagens
		{
			System.out.println("\nEmpate!");
			System.out.println("\nJogo finalizado!");
			return 3;
		}

		System.out.println("\nJogo inacabado!"); // Será mostrada essa mensagem a cada jogada até que o jogo seja finalizado e haja um resultado
		return 0;
	}
	
	public Boolean tabuleirocompleto()  // Verifica se o tabuleiro está completamente preenchido
	{
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (matriz[i][j] == 0)
					return false;

		return true;
	}

	public int verificar() // Verificação das condições de vitória do jogo (Caso houve vitória por linha, coluna ou diagonal)
	{
		for (int i = 0; i < 3; i++)			
			if (matriz[i][0] > 0 && (matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2])) // Verificação das linhas
			{
				return matriz[i][0];
			}

		for (int i = 0; i < 3; i++)
			if (matriz[0][i] > 0 && (matriz[0][i] == matriz[1][i] && matriz[1][i] == matriz[2][i])) // Verificação das colunas
			{
				return matriz[0][i];
			}

		if (matriz[0][0] > 0 && (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2])) // Verificação da primeira diagonal
		{
			return matriz[1][1];
		}

		if (matriz[2][0] > 0 && (matriz[2][0] == matriz[1][1] && matriz[1][1] == matriz[0][2])) // Verificação da segunda diagonal
		{
			return matriz[1][1];
		}

		
		if (tabuleirocompleto()) // Caso o tabuleiro esteja totalmente preenchido e não houve vencedor, o jogo será considerado como empatado
			return 3;
		else
			return 0; // Enquanto o tabuleiro não estiver completo e não haver um vencedor, o jogo continuará
	}

	public void preenchePosicao(PreencherTabuleiro m) 
	{
		matriz[m.getX()][m.getY()] = m.getIcone();
	}

	public int getPosicao(PreencherTabuleiro m)
	{
		return matriz[m.getX()][m.getY()];
	}

	public int getPosicao(int x, int y)
	{
		return matriz[x][y];
	}

	public void imprime() // Impressão do tabuleiro (linhas e colunas, bem como os números as representando)
	{
		System.out.println("\n  1 2 3"); // Números que representam as posições das linhas e colunas para auxiliar no preenchimento
		for (int i = 0; i < 3; i++)
		{
			System.out.print(i + 1 + " ");
			for (int j = 0; j < 3; j++)
			{
				if (matriz[i][j] == 0)
					System.out.print("_ "); // Representa um espaço vazio no tabuleiro
				else if (matriz[i][j] == 1)
					System.out.print("X "); // Representa o ícone do Jogador
				else if (matriz[i][j] == 2)
					System.out.print("O "); // Representa o ícone do Computador
			}
			System.out.println("");
		}
	}
}
