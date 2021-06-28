public class ImagemRGB extends Imagem {    
    
    public ImagemRGB(int altura, int largura) {
        super(altura, largura);
    }

    public void setPixel(int altura, int largura, CorRGB pixel) {
        this.pixel[altura][largura] = pixel;
    }
}    
    