public class ImagemRGB extends Imagem {    
    
    public ImagemRGB(int altura, int largura, CorRGB cor) {
        super(altura, largura, cor);
    }

    public void setPixel(int altura, int largura, Cor pixel) {
        this.pixel[altura][largura] = (CorRGB) pixel;
    }
}    
    
