package jogodavelha; // Pacote que armazenará as Classes

import java.util.Scanner;

public class Jogador // Classe "Jogador"
{
	protected Scanner teclado;
	protected PreencherTabuleiro icone;

	
	Jogador() // Por padrão, o ícone do Jogador será o X
	{
		teclado = new Scanner(System.in);
		icone = new PreencherTabuleiro(0, 0, 1);
	}
	
	public void joga(Tabuleiro tab) // Realiza a leitura das posições e efetua a jogada no tabuleiro
	{
		Boolean jogou = false;

		do
		{
			System.out.println("\nDigite uma coordenada vazia para preencher (Ex: 1 - 3):"); // Mensagem que aparecerá ao jogador ao escolher um nível de dificuldade e iniciar o jogo
			icone.setX(teclado.nextInt() - 1);                                               // Será pedido que o jogador escolha uma linha e após isso, uma coluna
			icone.setY(teclado.nextInt() - 1);

			if (tab.getPosicao(icone.getX(), icone.getY()) == 0) // Verifica se há uma posição vazia
			{
				tab.preenchePosicao(icone); // Preenche a posição vazia
				jogou = true; // Caso seja realizada uma jogada, o loop será encerrado
			}
		} while (jogou == false); // Será solicitada novamente a escolha de uma posição caso o jogador não selecione uma opção válida
	}

	public PreencherTabuleiro getIcone() // Retorna o ícone que marcará uma posição
	{
		return icone;
	}

	public void setIcone(PreencherTabuleiro icone) // Marca a posição no tabuleiro
	{
		this.icone = icone;
	}
}
