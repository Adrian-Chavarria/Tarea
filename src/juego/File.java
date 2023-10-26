package juego;

/**
 * Representa el tipo de ficha que va a obtener el jugador "X" o "O"
 * @author chava
 */

public class File {

    private String typeFile = "X";
    
   
/**
 * Constructor que recibe un tipo de archivo y lo inicializa.
 * @param typeFile puede ser "X" o "O".
 */
    public File(String typeFile) {
              
              this.typeFile = typeFile;
        }
       
        
    
/**
 * Constructor vacio que inicializa la ficha con "X" por defecto por si se 
 * llegara a crear una instancia de la clase file
 */
    public File() {
    }
    
    /**
     * Obtiene el tipo de ficha.
     * @return tipo de ficha "X" o "O".
     */
    public String getTypefile() {
        return typeFile;
    }
/**
 * Establece el tipo de archivo " X".
 * @param typefile Se establece como X de manera inicial.
 */
    public void setTypefile(String typefile) {
        
     this.typeFile = typeFile;
    }
    
     /**
     * Cambia el tipo de archivo de "X" a "O" o viseversa, alternando.
     */
     public void ChangeShift(){
         
         if (typeFile.equals("X")){
             typeFile = "O";
           
           
    
         }else{
             typeFile = "X";
         
         }
       
     }
}
