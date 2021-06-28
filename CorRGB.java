public class CorRGB extends Cor{    
    
    public CorRGB(int red, int green, int blue) {       
        super(red, green, blue);        
    }

    public void setUplaUm(int uplaUm) {
        if(uplaUm < 0){
            uplaUm = 0;
        }else if(uplaUm > 255){
            uplaUm = 255;
        }
        this.uplaUm = uplaUm;
    }

    public void setUplaDois(int uplaDois) {
        if(uplaDois < 0){
            uplaDois = 0;
        }else if(uplaDois > 255){
            uplaDois = 255;
        }
        this.uplaDois = uplaDois;
    }
    
    public void setUplaTres(int uplaTres) {
        if(uplaTres < 0){
            uplaTres = 0;
        }else if(uplaTres > 255){
            uplaTres = 255;
        }
        this.uplaTres = uplaTres;
    }

    public String toString() {
        return "Red: " + this.getUplaUm() + "\nGreen: " + this.getUplaDois() + "\nBlue: " + this.getUplaTres() + "\nLuminosidade: " + this.getLuminosidade();
    }
}