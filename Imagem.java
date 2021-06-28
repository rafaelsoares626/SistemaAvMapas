public class Imagem extends Object{
        
    public Cor[][] pixel;
    
    public Imagem(int altura, int largura) {        
        this.pixel = new Cor[altura][largura];
        for(int i = 0; i < this.pixel.length; i++){
            for(int j = 0; j < this.pixel[i].length; j++){
                this.pixel[i][j] = Cor.INICIALIZAR;
            }
        }
    }
    
    public int getAltura() {
        return this.pixel.length; 
    }    
    
    public int getLargura() {
        return this.pixel[0].length; 
    }    
    
    public Cor getPixel(int altura, int largura){
        return this.pixel[altura][largura];
    }    
    //@Override
    public String toString(){
        
        String s = "";
        for(int i = 0; i < this.getAltura(); i++){
            for(int j = 0; j < this.getLargura(); j++){
                if(j == 0){
                    s = s + "\n" + this.getPixel(i, j).getLuminosidade();
                }else{
                    s = s + this.getPixel(i, j).getLuminosidade();
                }
            }
        }
        return s;
    }
}
