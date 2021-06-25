public abstract class Imagem {
    
    protected Cor[][] pixel;
	
    public Imagem(int altura, int largura) {
	this.pixel = new Cor[altura][largura];
        for(int i = 0; i < this.pixel.length; i++){
            for(int j = 0; j < this.pixel[i].length; j++){
                this.pixel[i][j] = null;
            }
        }
    }

    public int getAltura() {
        return this.pixel.length; 
    }	
    
    public int getLargura() {
        return this.pixel[0].length; 
    }
    
    public void setPixel(int altura, int largura, Cor pixel) {
        this.pixel[altura][largura] = pixel;
    }
	
    public Cor getPixel(int altura, int largura){
        return this.pixel[altura][largura];
    }
    
    //@Override
    public String toString(){
        String s = "";
        for(int k = 0; k < this.pixel.length; k++){
            for(int w = 0; w < this.pixel[k].length; w++){
                if(w == 0){
                    if(this.pixel[k][w] == null){
                        s = s + "\n" + this.pixel[k][w];
                    }else{
                        s = s + "\n" + this.pixel[k][w].getLuminosidade();
                    }                    
                }else{
                    if(this.pixel[k][w] == null){
                        s = s + this.pixel[k][w];
                    }else{
                        s = s + this.pixel[k][w].getLuminosidade();
                    }
                }
            }
        }
        return s;
    }
}
