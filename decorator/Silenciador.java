package coursera.lpoo2.decorator;

public class Silenciador extends ArmaDecorator{

	  public Silenciador(Arma arma){
	    super(arma);
	  }

	  @Override
	  public void montar(){
	    super.montar();
	    System.out.println("Adicionando silenciador a arma");
	  }

	}