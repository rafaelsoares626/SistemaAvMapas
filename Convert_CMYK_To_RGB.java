public class Convert_CMYK_To_RGB implements ConversorCor {
    
    public Imagem getNovoMapa(int altura, int largura){
        ImagemRGB novoMapa = new ImagemRGB(altura, largura);
        return novoMapa;
    }

    public Cor converter(Cor cor){        
        CorCMYK corConverter = (CorCMYK) cor;             
        CorRGB rgbConvertida =  cmykParaRgb(corConverter);        
        return rgbConvertida;
    }
    
    public CorRGB cmykParaRgb(CorCMYK pixel) {
        int red = (int)(255 * (1 - pixel.getUplaUm()/100) * (1 - pixel.getBlack()/100));
        int green = (int)(255 * (1 - pixel.getUplaDois()/100) * (1- pixel.getBlack()/100));
        int blue = (int)(255 * (1 - pixel.getUplaTres()/100) * (1 - pixel.getBlack()/100));
            
        CorRGB resultado = new CorRGB(red, green, blue);
        return resultado;
    }
}