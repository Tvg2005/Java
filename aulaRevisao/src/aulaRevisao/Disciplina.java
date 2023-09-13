package aulaRevisao;

public class Disciplina {
	public String nome;
	public int codigo;
	public int quantidade;
	
	@Override
	public String toString() {
		return nome + " - " + quantidade;
}
}
