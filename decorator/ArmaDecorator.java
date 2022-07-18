package coursera.lpoo2.decorator;

public class ArmaDecorator implements Arma{

	  public Arma arma;

	  public ArmaDecorator(Arma arma){
	    this.arma = arma;
	  }

	  @Override
	  public void montar(){
	    this.arma.montar();
	  }

	}