public class Atlas {
    
    public Imagem[] atlas;

    public Atlas(){
        this.atlas = new Imagem[0];
    }    
        
    public void addImagem(Imagem imagem){
        Imagem[] novo = new Imagem[this.atlas.length + 1];
        for(int i = 0; i < this.atlas.length; i++){
            novo[i] = this.atlas[i];
        }
        novo[novo.length - 1] = imagem;
        this.atlas = novo;
    } 
    
    /*public Imagem[] getAtlas(){
        return this.atlas;
    }*/
    
    public int getAtlasTam(){
        return this.atlas.length;
    }
    
    public String toString(){        
        String s = "";
        for(int i = 0; i < this.getAtlasTam(); i++){
            s = s + this.atlas[i] + "\n";          
        }
        return s;
    }   
    
    
    public Imagem[] soRGB(){
        int qtdRGB = 0;
        for(int i = 0; i < this.atlas.length; i++){
            if(this.atlas[i] instanceof ImagemRGB){
                qtdRGB++;
            }
        }
        
        Imagem[] soImagemRGB = new Imagem[qtdRGB];
        int j = -1;
        for(int i = 0; i < this.atlas.length; i++){
            if(this.atlas[i] instanceof ImagemRGB){
                j++;
                soImagemRGB[j] = this.atlas[i];                
            }
        }
        return soImagemRGB;
    } 

    public Imagem[] getSimilares(double minimo, double maximo, double pctMinimo, Imagem[] atlasRGB){
        
        int qtdImagensSimilares = 0;
        int qtdPixelsSimilares = 0;
        
        for(int k = 0; k < atlasRGB.length; k++){
            qtdPixelsSimilares = 0;
            for(int i = 0; i < atlasRGB[k].getAltura(); i++){
                for(int j = 0; j < atlasRGB[k].getLargura(); j++){
                    if(atlasRGB[k].getPixel(i, j).getLuminosidade() >= minimo &&  atlasRGB[k].getPixel(i, j).getLuminosidade() <= maximo){
                        qtdPixelsSimilares++;
                    }
                }
            }
            double areaImagem = (double)(atlasRGB[k].getAltura() * atlasRGB[k].getLargura());
            if(qtdPixelsSimilares/areaImagem >= pctMinimo){
                qtdImagensSimilares++;
            }
        }
        
        int r = -1;
        Imagem[] soSimilaresRGB = new Imagem[qtdImagensSimilares];
        for(int k = 0; k < atlasRGB.length; k++){
            qtdPixelsSimilares = 0;
            for(int i = 0; i < atlasRGB[k].getAltura(); i++){
                for(int j = 0; j < atlasRGB[k].getLargura(); j++){
                    if(atlasRGB[k].getPixel(i, j).getLuminosidade() >= minimo &&  atlasRGB[k].getPixel(i, j).getLuminosidade() <= maximo){
                        qtdPixelsSimilares++;
                    }
                }
            }
            double areaImagem = (double)(atlasRGB[k].getAltura() * atlasRGB[k].getLargura());
            if(qtdPixelsSimilares/areaImagem >= pctMinimo){
                r++;
                soSimilaresRGB[r] = atlasRGB[k];
            }
        }
        return soSimilaresRGB; //soSimilaresRGB;
    }
    
    public Imagem[] getImagemPorLuminosidade(int red, int green, int blue, double pctMinimo, double limiarSimilaridade){
        //Filtrando as imagens RGB
        Imagem[] atlasRGB = this.atlas;
        atlasRGB = this.soRGB();
        
        //Construindo a cor e calculando a luminosidade
        CorRGB corRGB_parametro = new CorRGB(red, green, blue);
        int luminosidade = corRGB_parametro.getLuminosidade();
        
        //Valor mínimo do pixel
        double minimo = minLimiar(luminosidade, limiarSimilaridade);
        minimo = tratarMinimo(minimo);
        //Valor máximo do pixel
        double maximo = maxLimiar(luminosidade, limiarSimilaridade);
        maximo = tratarMaximo(maximo);
        
        Imagem[] atlasRGBSimilar = this.getSimilares(minimo, maximo, pctMinimo, atlasRGB);
        
        return atlasRGBSimilar;
    }

    public double tratarMinimo(double minimo){
        if(minimo < 0){
            minimo = 0;
        }
        return minimo;
    }
    
    public double tratarMaximo(double maximo){
        if(maximo > 255){
            maximo = 255;
        }
        return maximo;
    }
    
    public double minLimiar(int luminosidade, double limiarSimilaridade){
        double min = luminosidade - (luminosidade * limiarSimilaridade);
        return min;
    }
    
    public double maxLimiar(int luminosidade, double limiarSimilaridade){
        double max = luminosidade + (luminosidade * limiarSimilaridade);
        return max;
    }    
    
    
    
    
    
}
