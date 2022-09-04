package jogodavelha; // Pacote que armazenará as Classes

import java.util.Scanner;

public class JogoDaVelha // Classe "JogoDaVelha"
{
	public static void main(String[] args) // Função principal que irá gerenciar o jogo da velha
	{
		Tabuleiro tabuleiro = new Tabuleiro();
		Jogador jogador = new Jogador();

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha o nivel de dificuldade para iniciar o jogo (1 - Facil, 2 - Normal, 3 - Dificil):"); // Mensagem que aparecerá ao jogador para que ele escolha um nível de dificuldade
		int dificuldade = teclado.nextInt();

		// Criação do Computador e dos modos de jogo
		Computador computador = null;
		Nivel1 facil = new Nivel1();
		Nivel2 normal = new Nivel2();
		Nivel3 dificil = new Nivel3();

		if (dificuldade == 1) // Representa o nível de dificuldade que irá jogar contra o Jogador de acordo com o que for digitado na escolha de dificuldade
			computador = facil;
		else if (dificuldade == 2)
			computador = normal;
		else if (dificuldade == 3)
			computador = dificil;

		
		while (tabuleiro.situacao() == 0) // Estrutura de repetição principal do jogo da velha 
		{
			tabuleiro.imprime(); // Impressão do tabuleiro na tela

			jogador.joga(tabuleiro); // Jogada do jogador

			if (tabuleiro.verificar() == 0) // Verifica se houve um ganhador ou empate, se não houve, o computador irá jogar
				computador.joga(tabuleiro);
		}
	}
}