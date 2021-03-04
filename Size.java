/**
 * Este enumerado contêm as caraterísticas de cada chávena, sendo que existem 3 tipos, SMALL, MEDIUM e LARGE.
 * 
 */
public enum Size {

    SMALL(32, 36, "Pequeno",'S'),
    MEDIUM(37, 44, "Médio",'M'),
    LARGE(45, 52, "Grande",'L'); 
 
     private final String description;
     private final int minValue;
     private final int maxValue;
     private final char code;
    
     /**
      * Este construtor recebe os valores dependendo do tipo do enumerado Size.
      * Dá valores aos atributos do enumerdo Size.
      */
    private Size(int minValue, int maxValue, String description, char code){
       this.description=description;
       this.minValue=minValue;
       this.maxValue=maxValue;
       this.code=code;
    }
    
    /**
     * Este método retorna a descrição do tamanho (Size) da chávena
     * 
     * @return description
     */
   @Override
    public String toString() {
      return this.description;
    }
    
    /**
     * Este método retorna a descrição do tamanho (Size) da chávena
     * 
     * @return description
     */
    public String getDescription() {
       return description;
    }
    
    /**
     * Este método retorna o valor mínimo para o tamanho (Size) da chávena
     * 
     * @return minValue
     */
    public int getMinValue() {
       return minValue;
    }
    
    /**
     * Este método retorna o valor máximo para o tamanho (Size) da chávena
     * 
     * @return maxValue
     */
    public int getMaxValue() {
       return maxValue;
    }
    
    /**
     * Este método retorna o código atríbuido ao tamanho (Size) da chávena
     * 
     * @return code
     */
    public char getCode() {
       return code;
    }

}