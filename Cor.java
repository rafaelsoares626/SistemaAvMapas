public abstract class Cor
{
    protected int corUm;    
    protected int corDois;    
    protected int corTres;    
    
    public Cor(int corUm, int corDois, int corTres) {
        this.setCorUm(corUm);
        this.setCorDois(corDois);
        this.setCorTres(corTres);
    }
     
    private void setCorUm(int corUm) {
	 this.corUm = corUm;
    }

    private void setCorDois(int corDois) {
	 this.corDois = corDois;
    }
    
    private void setCorTres(int corTres) {
	 this.corTres = corTres;
    }
}
