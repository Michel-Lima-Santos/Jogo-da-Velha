package jogodavelha; // Pacote que armazenará as Classes

public class PreencherTabuleiro // Classe "PreencherTabuleiro"
{
	int x; // Representa uma posição na linha (horizontal)
	int y; // Representa uma posição na coluna (vertical)
	int icone; // Representa o ícone que preencherá o tabuleiro
	
	public PreencherTabuleiro(int x, int y, int icone) // Leitura e colocação dos ícones nas posições
	{
		super();
		this.x = x;
		this.y = y;
		this.icone = icone;
	}

	public int getX() // Posição na linha
	{
		return x;
	}

	public void setX(int x) 
	{
		this.x = x;
	}

	public int getY() // Posição na coluna
	{
		return y;
	}

	public void setY(int y) 
	{
		this.y = y;
	}

	public int getIcone() // Retorna o ícone que marcará uma posição
	{
		return icone;
	}

	public void setIcone(int icone) // Marca a posição no tabuleiro
	{
		this.icone = icone;
	}
}
