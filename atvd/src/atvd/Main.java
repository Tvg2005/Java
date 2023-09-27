package atvd;

public class Main {
	public static void main(String[] args) {
		Futebol ftbol1 = new Futebol();
		ftbol1.setNome("Thiago");
		ftbol1.setTempo(90);
		ftbol1.setJogadores(11);
		ftbol1.setAltura((float) 1.80);
		
		Volei jgvol1 = new Volei();
		jgvol1.setNome("Giovana");
		jgvol1.setAltura((float) 1.60);
		jgvol1.setAltura_rede(2);
		jgvol1.setPosicao("Libero");
		
		Natacao jogador1 = new Natacao();
		jogador1.setNome("Livia");
		jogador1.setAltura((float) 1.50);
		jogador1.setProfundidade(2);
		jogador1.setRaia(3);
		
		Formula1 corredor1 = new Formula1();
		corredor1.setNome("Júlio");
		corredor1.setAltura((float) 1.78);
		corredor1.setVoltas(70);
		corredor1.setMarca("Redbull");
	}
}
