public class ImagemCMYK extends Imagem {
    
    public ImagemCMYK(int altura, int largura) {
        super(altura, largura);
    }

    public void setPixel(int altura, int largura, CorCMYK pixel) {
        this.pixel[altura][largura] = pixel;
    }
}
