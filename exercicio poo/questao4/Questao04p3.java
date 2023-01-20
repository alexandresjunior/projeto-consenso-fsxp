package questao4;

public class Questao04p3 extends Questao04{
    private int selo;

	public int getSelo() {
	    return selo;
	}

	public void setSelo(int selo) {
	    this.selo = selo;
	}

	@Override
	public int getIdentificador(){
	    return this.selo;
	}

}
