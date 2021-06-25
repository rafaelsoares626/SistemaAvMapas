public abstract class Cor{
    
    protected int uplaUm;    
    protected int uplaDois;    
    protected int uplaTres;    
    
    public Cor(int uplaUm, int uplaDois, int uplaTres) {
        this.setUplaUm(uplaUm);
        this.setUplaDois(uplaDois);
        this.setUplaTres(uplaTres);
    }
     
    public abstract int tratarUplaUm(int uplaUm);
    public abstract int tratarUplaDois(int uplaDois);
    public abstract int tratarUplaTres(int uplatres);
    public abstract int getLuminosidade();
    
    private void setUplaUm(int uplaUm) {
        uplaUm = tratarUplaUm(uplaUm);
        this.uplaUm = uplaUm;
    }

    private void setUplaDois(int uplaDois) {
        uplaDois = tratarUplaDois(uplaDois);
        this.uplaDois = uplaDois;
    }
    
    private void setUplaTres(int uplaTres) {
        uplaTres = tratarUplaTres(uplaTres);
        this.uplaTres = uplaTres;
    }
}