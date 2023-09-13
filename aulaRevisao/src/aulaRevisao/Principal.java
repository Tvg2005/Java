package aulaRevisao;
import java.util.HashMap;
import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		Disciplina d1 = new Disciplina();
		d1.nome = "Estrutura de Dados";
		d1.codigo = 123;
		d1.quantidade = 30;
		
		Disciplina d2 = new Disciplina();
		d2.nome = "Banco de Dados";
		d2.codigo = 124;
		d2.quantidade = 50;
		
		Disciplina d3 = new Disciplina();
		d3.nome = "Algebra";
		d3.codigo = 125;
		d3.quantidade = 10;
		
		Disciplina d4 = new Disciplina();
		d4.nome = "Sistemas operacionais";
		d4.codigo = 126;
		d4.quantidade = 5;
		
		ArrayList<Disciplina> primeiroSemestre = new ArrayList<>();
		ArrayList<Disciplina> segundoSemestre = new ArrayList<>();
		ArrayList<Disciplina> sextoSemestre = new ArrayList<>();
		
		primeiroSemestre.add(d1);
		segundoSemestre.add(d2);
		segundoSemestre.add(d3);
		sextoSemestre.add(d4);
		
		for(int i = 0; i < segundoSemestre.size(); i++) {
			if(segundoSemestre.get(i).quantidade >= 20) {
				System.out.println(segundoSemestre.get(i).toString());
		}
		}
		
		HashMap<Integer, ArrayList<Disciplina>> lista = new HashMap<>();
		lista.put(1, primeiroSemestre);
		lista.put(2, segundoSemestre);
		lista.put(6, sextoSemestre);
	}
}
