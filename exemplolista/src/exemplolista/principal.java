package exemplolista;
import java.util.ArrayList;
public class principal {
	public static void main(String[] args) {
		figura f1 = new figura();
		f1.nome = "Quadradado";
		f1.nrlados = 4;
		f1.tipo = "Quadrilatero";
		
		figura f2 = new figura();
		f2.nome = "Pentagono";
		f2.nrlados = 5;
		f2.tipo = "forma geometrica";
		
		figura f3 = new figura();
		f3.nome = "hexagono";
		f3.nrlados = 6;
		f3.tipo = "Forma geometrica";
		
		figura f4 = new figura();
		f4.nome = "Triangulo";
		f4.nrlados = 3;
		f4.tipo = "Escaleno";
		
		figura f5 = new figura();
		f5.nome = "estrela";
		f5.nrlados = 10;
		f5.tipo = "desenho";
		
		ArrayList<figura> listadefiguras = new ArrayList<figura>();
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