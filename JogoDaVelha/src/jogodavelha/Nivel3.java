package jogodavelha; // Pacote que armazenará as Classes

public class Nivel3 implements Computador // Classe Filha "Nivel3" pertencente à Classe Mãe "Computador" que representará a dificuldade "Difícil"
{
	protected PreencherTabuleiro icone;

	public Nivel3()
	{
		super();
		icone = new PreencherTabuleiro(0, 0, 2);		
	}

	// No terceiro nível de dificuldade, o Computador jogará de acordo com o primeiro nível de dificuldade, porém irá verificar as diagonais e as colunas (verticalmente) e caso houverem 2 posições ocupadas diagonalmente ou verticalmente em sequência, o
	// Computador irá jogar para ganhar o jogo completando as 3 posições
	public void joga(Tabuleiro tab) 
	{
		Boolean jogou = false; // Permite que seja realizada apenas uma jogada por vez

		if ((tab.getPosicao(0, 0) == 2 && tab.getPosicao(1, 1) == 2) && tab.getPosicao(2, 2) == 0) // Primeira diagonal
		{ 
			icone.x = 2;
			icone.y = 2;
			tab.preenchePosicao(icone);
			jogou = true;
		} 
		
		else if ((tab.getPosicao(0, 0) == 2 && tab.getPosicao(2, 2) == 2) && tab.getPosicao(1, 1) == 0) 
		{
			icone.x = 1;
			icone.y = 1;
			tab.preenchePosicao(icone);
			jogou = true;
		} 
		
		else if ((tab.getPosicao(1, 1) == 2 && tab.getPosicao(2, 2) == 2) && tab.getPosicao(0, 0) == 0) 
		{
			icone.x = 0;
			icone.y = 0;
			tab.preenchePosicao(icone);
			jogou = true;
		}
		
		if ((tab.getPosicao(0, 2) == 2 && tab.getPosicao(1, 1) == 2) && tab.getPosicao(2, 0) == 0) // Segunda diagonal	
		{ 
			icone.x = 2;
			icone.y = 0;
			tab.preenchePosicao(icone);
			jogou = true;
		} 
		
		else if ((tab.getPosicao(0, 2) == 2 && tab.getPosicao(2, 0) == 2) && tab.getPosicao(1, 1) == 0)
		{
			icone.x = 1;
			icone.y = 1;
			tab.preenchePosicao(icone);
			jogou = true;
		} 
		
		else if ((tab.getPosicao(1, 1) == 2 && tab.getPosicao(2, 0) == 2) && tab.getPosicao(0, 2) == 0)
		{
			icone.x = 0;
			icone.y = 2;
			tab.preenchePosicao(icone);
			jogou = true;
		} 
		
		if ((tab.getPosicao(0, 0) == 2 && tab.getPosicao(1, 0) == 2) && tab.getPosicao(2, 0) == 0) // Primeira coluna
		{ 
			icone.x = 2;
			icone.y = 0;
			tab.preenchePosicao(icone);
			jogou = true;
		} 
		
		else if ((tab.getPosicao(0, 0) == 2 && tab.getPosicao(2, 0) == 2) && tab.getPosicao(1, 0) == 0)
		{
			icone.x = 1;
			icone.y = 0;
			tab.preenchePosicao(icone);
			jogou = true;
		}
		
		else if ((tab.getPosicao(1, 1) == 2 && tab.getPosicao(2, 1) == 2) && tab.getPosicao(0, 1) == 0)
		{
			icone.x = 0;
			icone.y = 1;
			tab.preenchePosicao(icone);
			jogou = true;
		}
		
		if ((tab.getPosicao(0, 1) == 2 && tab.getPosicao(1, 1) == 2) && tab.getPosicao(2, 1) == 0) // Segunda coluna	
		{ 
			icone.x = 2;
			icone.y = 1;
			tab.preenchePosicao(icone);
			jogou = true;
		}
		
		else if ((tab.getPosicao(0, 1) == 2 && tab.getPosicao(2, 1) == 2) && tab.getPosicao(1, 1) == 0)		
		{
			icone.x = 1;
			icone.y = 1;
			tab.preenchePosicao(icone);
			jogou = true;
		} 
		
		else if ((tab.getPosicao(1, 0) == 2 && tab.getPosicao(2, 0) == 2) && tab.getPosicao(0, 1) == 0) 
		{
			icone.x = 0;
			icone.y = 1;
			tab.preenchePosicao(icone);
			jogou = true;
		}
		
		if ((tab.getPosicao(0, 2) == 2 && tab.getPosicao(1, 2) == 2) && tab.getPosicao(2, 2) == 0) // Terceira coluna
		{ 
			icone.x = 2;
			icone.y = 2;
			tab.preenchePosicao(icone);
			jogou = true;
		}
		
		else if ((tab.getPosicao(0, 2) == 2 && tab.getPosicao(2, 2) == 2) && tab.getPosicao(1, 2) == 0) 
		{
			icone.x = 1;
			icone.y = 2;
			tab.preenchePosicao(icone);
			jogou = true;
		} 
		
		else if ((tab.getPosicao(1, 2) == 2 && tab.getPosicao(2, 2) == 2) && tab.getPosicao(0, 2) == 0) 
		{
			icone.x = 0;
			icone.y = 2;
			tab.preenchePosicao(icone);
			jogou = true;
		}
			
		else // Caso o computador não encontre uma jogada que o fará vencer o jogo, ele jogará de acordo com o primeiro nível de dificuldade (Fácil)
		{
			for (int i = 0; i < 3; i++)
				if (jogou == false)
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

}
