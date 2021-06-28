public class App {
    private Atlas atlas1;
    
    public App(){
        this.atlas1 = new Atlas();
    }   
    
    public void testeCor(){
        System.out.println("################# Teste Cores - Minimo #################");       
    
        System.out.println("__________________________________________________");
        System.out.println("Cor RGB");
        CorRGB cor_RGB = new CorRGB(-37, 150, 390);
        System.out.println(cor_RGB.toString());
        
        System.out.println("__________________________________________________");
        System.out.println("Cor CMYK");
        CorCMYK cor_CMYK = new CorCMYK(-37, 150, 70, 50);
        System.out.println(cor_CMYK.toString());        
        
        System.out.println("#################### Fim teste ####################");   
    
    }
    
    public void testeImagem(){
        System.out.println(" ");        
        System.out.println("################## Teste Imagem ###################");        
    
        System.out.println("__________________________________________________");
        System.out.println("Inicializando uma Imagem RGB");  
        //Usando a cor RGB criada acima
        ImagemRGB imagemRGB1 = new ImagemRGB(5, 5);//new Imagem(altura, largura)
        System.out.println(imagemRGB1.toString());
        
        System.out.println("__________________________________________________");
        System.out.println("Inicializando uma Imagem CMYK");
        //Usando a cor CMYK criada acima
        ImagemCMYK imagemCMYK1 = new ImagemCMYK(10, 5);//new Imagem(altura, largura)
        System.out.println(imagemCMYK1.toString());

        System.out.println("__________________________________________________");
        System.out.println("Modificando pixels da Imagem, dado o pixel");
        CorRGB cor_RGB = new CorRGB(-37, 150, 390);
        imagemRGB1.setPixel(0, 0, cor_RGB);
        imagemRGB1.setPixel(0, 1, cor_RGB);
        imagemRGB1.setPixel(0, 2, cor_RGB);
        imagemRGB1.setPixel(1, 0, cor_RGB);
        imagemRGB1.setPixel(1, 1, cor_RGB);
        imagemRGB1.setPixel(1, 2, cor_RGB);
        System.out.println(imagemRGB1.toString());
            
    
    }
    
    public void testeAtlas(){
        System.out.println(" ");        
        System.out.println("################## Teste Atlas ###################"); 
        System.out.println("__________________________________________________");
        System.out.println("Impressão do vetor de mapas ou atlas");        

        ImagemRGB imagemRGB1 = new ImagemRGB(3, 5);
        
        CorRGB cor_RGB1 = new CorRGB(-37, 150, 390);
        imagemRGB1.setPixel(0, 0, cor_RGB1);
        imagemRGB1.setPixel(0, 1, cor_RGB1);
        imagemRGB1.setPixel(0, 2, cor_RGB1);
        imagemRGB1.setPixel(0, 3, cor_RGB1); 
        imagemRGB1.setPixel(0, 4, cor_RGB1);         
        imagemRGB1.setPixel(1, 0, cor_RGB1);
        imagemRGB1.setPixel(1, 1, cor_RGB1);
        imagemRGB1.setPixel(1, 2, cor_RGB1);
        imagemRGB1.setPixel(1, 3, cor_RGB1); 
        imagemRGB1.setPixel(1, 4, cor_RGB1);
        imagemRGB1.setPixel(2, 0, cor_RGB1);
        imagemRGB1.setPixel(2, 1, cor_RGB1);
        imagemRGB1.setPixel(2, 2, cor_RGB1);
        imagemRGB1.setPixel(2, 3, cor_RGB1); 
        imagemRGB1.setPixel(2, 4, cor_RGB1);
        this.atlas1.addImagem(imagemRGB1);
        
        ImagemRGB imagemRGB2 = new ImagemRGB(4, 5);
        this.atlas1.addImagem(imagemRGB2);
            
        ImagemCMYK imagemCMYK1 = new ImagemCMYK(3, 3);
        this.atlas1.addImagem(imagemCMYK1);
        
        ImagemRGB imagemRGB3 = new ImagemRGB(5, 5);
        this.atlas1.addImagem(imagemRGB3);
        
        ImagemRGB imagemRGB4 = new ImagemRGB(6, 5);
        this.atlas1.addImagem(imagemRGB4);
        
        ImagemRGB imagemRGB5 = new ImagemRGB(7, 5);
        this.atlas1.addImagem(imagemRGB5);

        ImagemRGB imagemRGB6 = new ImagemRGB(2, 2);
        this.atlas1.addImagem(imagemRGB6);
        
        ImagemCMYK imagemCMYK2 = new ImagemCMYK(4, 3);
        this.atlas1.addImagem(imagemCMYK2);
        
        System.out.println(this.atlas1.toString());          
        
        int result =  this.atlas1.getAtlasTam(); 
        System.out.println("Quantidade: " + result);
        System.out.println("__________________________________________________");
    }    
    
    
    public void testeSimilaridade(){    
        System.out.println("__________________________________________________");
        System.out.println("Impressão somente das imagens RGB");       
        
        Imagem[] resultado = this.atlas1.soRGB();
        int tamanho = this.atlas1.soRGB().length;
        System.out.println("Tamanho da parte RGB do atlas: " + tamanho);

        for(int i = 0; i < tamanho; i++){
            System.out.println(resultado[i]);
        }

        Imagem[] resultado2 = this.atlas1.getImagemPorLuminosidade(112, 112, 112, 0.5, 0.05);
        System.out.println("Imagens com pixels similares aos informados");
        for(int i = 0; i < resultado2.length; i++){            
            System.out.println(resultado2[i]);
        }

    }
    
    public static void main(String[] args) {
        
        App app = new App();      
        app.testeCor();
        app.testeImagem();        
        app.testeAtlas();
        app.testeSimilaridade();
        
    }
}

