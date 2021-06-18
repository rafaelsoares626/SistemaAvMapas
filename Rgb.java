public class Rgb extends Cor
{
    public Rgb(int red, int green, int blue) {       
        super(red, green, blue);        
    }
    
    public int getRed() {
        return this.corUm;
    }

    public int getGreen() {
        return this.corDois;
    }

    public int getBlue() {
        return this.corTres;
    }
    
    public int getLuminosidade() {
        return (int)(this.getRed() * 0.3 +this.getGreen() * 0.59 + this.getBlue() * 0.11);
    }
}