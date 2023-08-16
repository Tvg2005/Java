package aula3;

import java.util.ArrayList;
public class Main {
	public static void main (String[] args) {
		
	Pessoa p1 = new Pessoa();
	p1.nome = "Thiago";
	p1.ra = "22307398";
	System.out.println(p1.nome);
	
	System.out.println();
	
	Pessoa p2 = new Pessoa();
	p2.nome = "Giovana";
	System.out.println(p2.nome);

	Pessoa p3 = new Pessoa();
	p3.nome = "Maria";
	p3.idade = 20;
	
	ArrayList<Pessoa> listapessoas = new ArrayList<Pessoa>();
	
	
	System.out.println("O tamanho da lista é: "+ listapessoas.size());
	
	listapessoas.add(p1);
	listapessoas.add(p2);
	listapessoas.add(p3);
	
	System.out.println("O tamanho da lista é: "+ listapessoas.size());
	for (int i = 0; i < listapessoas.size(); i++) {
		System.out.println(listapessoas.get(i).nome);
	}
	for (int i = 0; i < 10; i++) {
	System.out.printf("5 X %d: %d\n", i+1, (1+i)*5);
	}
	}
}
