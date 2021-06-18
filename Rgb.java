public class Rgb extends Cor{
    
    public Rgb(int red, int green, int blue) {       
        super(red, green, blue);        
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
}