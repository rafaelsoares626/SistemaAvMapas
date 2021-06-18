public abstract class Cor{
    
    protected int uplaUm;    
    protected int uplaDois;    
    protected int uplaTres;    
    
    public Cor(int uplaUm, int uplaDois, int uplaTres) {
        this.setUplaUm(uplaUm);
        this.setUplaDois(uplaDois);
        this.setUplaTres(uplaTres);
    }
     
    private void setUplaUm(int uplaUm) {
        this.uplaUm = uplaUm;
    }

    private void setUplaDois(int uplaDois) {
        this.uplaDois = uplaDois;
    }
    
    private void setUplaTres(int uplaTres) {
        this.uplaTres = uplaTres;
    }
}
