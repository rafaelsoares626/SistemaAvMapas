public class Cor extends Object{    
    
    public static Cor INICIALIZAR = new Cor(0, 0, 0);
    
    protected int uplaUm;    
    protected int uplaDois;    
    protected int uplaTres;    
    
    public Cor(int uplaUm, int uplaDois, int uplaTres) {
        this.setUplaUm(uplaUm);
        this.setUplaDois(uplaDois);
        this.setUplaTres(uplaTres);
    }
    
    public void setUplaUm(int uplaUm) {        
        uplaUm = 0; 
        this.uplaUm = uplaUm;
    }

    public void setUplaDois(int uplaDois) {        
        uplaDois = 0;
        this.uplaDois = uplaDois;
    }
    
    public void setUplaTres(int uplaTres) {      
        uplaTres = 0;
        this.uplaTres = uplaTres;
    }

    public int getUplaUm() {
        return this.uplaUm;
    }

    public int getUplaDois() {
        return this.uplaDois;
    }

    public int getUplaTres() {
        return this.uplaTres;
    }

    public int getLuminosidade() {
        return (int)(this.getUplaUm() * 0.3 +this.getUplaDois() * 0.59 + this.getUplaTres() * 0.11);
    }
}