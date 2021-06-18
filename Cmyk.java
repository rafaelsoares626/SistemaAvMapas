public class Cmyk extends Cor
{
    private int black;
    
    public Cmyk(int cyan, int magenta, int yellow, int black) {       
        super(cyan, magenta, yellow);     
        this.setBlack(black);
    }
    
    public int getCyan() {
        return this.corUm;
    }

    public int getMagenta() {
        return this.corDois;
    }

    public int getYellow() {
        return this.corTres;
    }
    
    private void setBlack(int black) {
	this.black = black;
    }
    
    public int getBlack() {
        return this.black;
    }

    public int getLuminosidade() {
        return (int)(this.getBlack() * 255 / 100);
    }
}
