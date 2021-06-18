public class Cmyk extends Cor{
    private int black;
    
    public Cmyk(int cyan, int magenta, int yellow, int black) {       
        super(cyan, magenta, yellow);     
        this.setBlack(black);
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
