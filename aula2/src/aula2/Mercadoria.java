package aula2;

public class Mercadoria {
	public int codigo;
	public double preco;
	public String nome;
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nPre�o: " + this.preco + "\nC�digo: " + this.codigo;
	}
}
