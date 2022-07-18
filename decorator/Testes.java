package coursera.lpoo2.decorator;
//https://pt.wikipedia.org/wiki/Decorator
public class Testes {
	public static void main(String[] args) {
		/* Monta uma arma com mira e silenciador */
		Arma armaCompleta = new Silenciador(new Mira(new ArmaBase()));
		armaCompleta.montar();

		/* Monta uma arma sem acessórios */
		Arma armaB = new ArmaBase();
		armaB.montar();

		/* Monta uma arma com silenciador */
		Arma armaComSilenciador = new Silenciador(armaB);
		armaComSilenciador.montar();

		/* Monta uma arma com mira */
		Arma armaComMira = new Mira(armaB);
		armaComMira.montar();
	}

}