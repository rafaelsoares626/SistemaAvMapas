public class CorCMYK extends Cor{
    private int black;
    
    public CorCMYK(int cyan, int magenta, int yellow, int black) {       
        super(cyan, magenta, yellow);     
        this.setBlack(black);
    }

    public int tratarUplaUm(int uplaUm){
        //cyan
        if(uplaUm < 0){
            uplaUm = 0;
        }else if(uplaUm > 100){
            uplaUm = 100;
        }
        return uplaUm;
    }
    
    public int tratarUplaDois(int uplaDois){
        //magenta
        if(uplaDois < 0){
            uplaDois = 0;
        }else if(uplaDois > 100){
            uplaDois = 100;
        }
        return uplaDois;
    }
    
    public int tratarUplaTres(int uplaTres){
        //yellow
        if(uplaTres < 0){
            uplaTres = 0;
        }else if(uplaTres > 100){
            uplaTres = 100;
        }
        return uplaTres;
    }
    
    private void setBlack(int black) {
        if(black < 0){
            black = 0;
        }else if(black > 100){
            black = 100;
        }
        this.black = black;
    }
    
    public int getCyan() {
        return this.uplaUm;
    }

    public int getMagenta() {
        return this.uplaDois;
    }

    public int getYellow() {
        return this.uplaTres;
    }
    
    public int getBlack() {
        return this.black;
    }

    public int getLuminosidade() {
        return (int)(this.getBlack() * 255 / 100);
    }
    
    //@Override
    public String toString() {
        return "Cyan: " + this.getCyan() + "\nMagenta: " + this.getMagenta() + "\nYellow: " + this.getYellow() + "\nBlack: " + this.getBlack() + "\nLuminosidade: " + this.getLuminosidade();
    }
}