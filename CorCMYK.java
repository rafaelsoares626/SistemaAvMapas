public class CorCMYK extends Cor{
    
    private int black;
    
    public CorCMYK(int cyan, int magenta, int yellow, int black) {       
        super(cyan, magenta, yellow);     
        this.setBlack(black);
    }
    
    public void setUplaUm(int uplaUm) {
        if(uplaUm < 0){
            uplaUm = 0;
        }else if(uplaUm > 100){
            uplaUm = 100;
        }
        this.uplaUm = uplaUm;
    }

    public void setUplaDois(int uplaDois) {
        if(uplaDois < 0){
            uplaDois = 0;
        }else if(uplaDois > 100){
            uplaDois = 100;
        }
        this.uplaDois = uplaDois;
    }
    
    public void setUplaTres(int uplaTres) {
        if(uplaTres < 0){
            uplaTres = 0;
        }else if(uplaTres > 100){
            uplaTres = 100;
        }
        this.uplaTres = uplaTres;
    }

    private void setBlack(int black) {
        if(black < 0){
            black = 0;
        }else if(black > 100){
            black = 100;
        }
        this.black = black;
    }
    
    public int getBlack() {
        return this.black;
    }

    public int getLuminosidade() {
        return (int)(this.getBlack() * 255 / 100);
    }    
    //@Override
    public String toString() {
        return "Cyan: " + this.getUplaUm() + "\nMagenta: " + this.getUplaDois() + "\nYellow: " + this.getUplaTres() + "\nBlack: " + this.getBlack() + "\nLuminosidade: " + this.getLuminosidade();
    }
}