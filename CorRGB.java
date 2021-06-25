public class CorRGB extends Cor{
    
    public static final CorRGB BRANCA = new CorRGB(255,255,255);
    
    public CorRGB(int red, int green, int blue) {       
        super(red, green, blue);        
    }
    
    public int tratarUplaUm(int uplaUm){
        //red
        if(uplaUm < 0){
            uplaUm = 0;
        }else if(uplaUm > 255){
            uplaUm = 255;
        }
        return uplaUm;
    }
    
    public int tratarUplaDois(int uplaDois){
        //green
        if(uplaDois < 0){
            uplaDois = 0;
        }else if(uplaDois > 255){
            uplaDois = 255;
        }
        return uplaDois;
    }
    
    public int tratarUplaTres(int uplaTres){
        //blue
        if(uplaTres < 0){
            uplaTres = 0;
        }else if(uplaTres > 255){
            uplaTres = 255;
        }
        return uplaTres;
    }
    
    public int getRed() {
        return this.uplaUm;
    }

    public int getGreen() {
        return this.uplaDois;
    }

    public int getBlue() {
        return this.uplaTres;
    }
    
    public int getLuminosidade() {
        return (int)(this.getRed() * 0.3 +this.getGreen() * 0.59 + this.getBlue() * 0.11);
    }
    
    //@Override
    public String toString() {
        return "Red: " + this.getRed() + "\nGreen: " + this.getGreen() + "\nBlue: " + this.getBlue() + "\nLuminosidade: " + this.getLuminosidade();
    }
}