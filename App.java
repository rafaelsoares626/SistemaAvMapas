public class App {
    public static void main(String[] args) {
        System.out.println("################# Teste Cores - Minimo #################");       
    
        System.out.println("__________________________________________________");
        System.out.println("Cor RGB");
        CorRGB cor_RGB = new CorRGB(-37, 150, 390);
        System.out.println(cor_RGB.toString());
        
        System.out.println("__________________________________________________");
        System.out.println("Cor CMYK");
        CorCMYK cor_CMYK = new CorCMYK(-37, 150, 70, 50);
        System.out.println(cor_CMYK.toString());        
        
        /*System.out.println("__________________________________________________");
        System.out.println("Criando uma cor BRANCA");        
        Rgb corBRANCA = Rgb.BRANCA;
        System.out.println(corBRANCA.toString());*/        
        System.out.println("#################### Fim teste ####################");        
        
        System.out.println(" ");
        
        System.out.println("################## Teste Imagem ###################");        
    
        System.out.println("__________________________________________________");
        System.out.println("Criando uma Imagem RGB");  
        //CorRGB cor_RGB1 = new CorRGB(-37, 150, 390);
        ImagemRGB imagemRGB1 = new ImagemRGB(5, 5);//new Imagem(altura, largura)
        System.out.println(imagemRGB1.toString());
        
        System.out.println("__________________________________________________");
        System.out.println("Criando uma Imagem CMYK");        
        ImagemCMYK imagemCMYK1 = new ImagemCMYK(10, 5);//new Imagem(altura, largura)
        System.out.println(imagemCMYK1.toString());

        System.out.println("__________________________________________________");
        System.out.println("Modificando pixels da Imagem, dado o pixel");
        //CorRGB pixel1 = new CorRGB(37, 150, 190);
        imagemRGB1.setPixel(0, 0, cor_RGB);
        imagemRGB1.setPixel(0, 1, cor_RGB);
        imagemRGB1.setPixel(0, 2, cor_RGB);
        imagemRGB1.setPixel(1, 0, cor_RGB);
        imagemRGB1.setPixel(1, 1, cor_RGB);
        imagemRGB1.setPixel(1, 2, cor_RGB);
        System.out.println(imagemRGB1.toString());
    }
}

