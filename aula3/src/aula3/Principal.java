package aula3;
import java.util.ArrayList;
public class Principal {
	public static void main(String[] args) {
		Figura f1 = new Figura();
		f1.nome = "Quadradado";
		f1.nrlados = 4;
		f1.tipo = "Quadrilatero";
		
		Figura f2 = new Figura();
		f2.nome = "Pentagono";
		f2.nrlados = 5;
		f2.tipo = "forma geometrica";
		
		Figura f3 = new Figura();
		f3.nome = "hexagono";
		f3.nrlados = 6;
		f3.tipo = "Forma geometrica";
		
		Figura f4 = new Figura();
		f4.nome = "Triangulo";
		f4.nrlados = 3;
		f4.tipo = "Escaleno";
		
		Figura f5 = new Figura();
		f5.nome = "estrela";
		f5.nrlados = 10;
		f5.tipo = "desenho";
		
		ArrayList<Figura> listadefiguras = new ArrayList<Figura>();
		listadefiguras.add(f1);
		listadefiguras.add(f2);
		listadefiguras.add(f3);
		listadefiguras.add(f4);
		listadefiguras.add(f5);
		for (int i = 0; i < listadefiguras.size(); i++) {
			System.out.println(listadefiguras.get(i).nome);
			System.out.println(listadefiguras.get(i).nrlados);
		}
	}
}