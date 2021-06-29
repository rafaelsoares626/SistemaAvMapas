public class ImagemCMYK extends Imagem {
    
    public ImagemCMYK(int altura, int largura, CorCMYK cor) {
        super(altura, largura, cor);
    }

    public void setPixel(int altura, int largura, Cor pixel) {
        this.pixel[altura][largura] = (CorCMYK) pixel;
    }
}
