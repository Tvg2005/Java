package aula2;

public class Mercadoria {
	public int codigo;
	public double preco;
	public String nome;
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nPreço: " + this.preco + "\nCódigo: " + this.codigo;
	}
}
