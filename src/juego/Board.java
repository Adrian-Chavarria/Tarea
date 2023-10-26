package juego;
/**
 * Representa el tablero del juego.
 * almacena informacion sobre las combinaciones ganadoras de juego.
 * @author chava
 */

public class Board {

  
    public int[][] win;
    /**
     * Constructor 
     * Inicializa el tablero y las combinaciones ganadoras
     */
    public Board() {
     
       win = new int[][] { 
           {1,2,3},
           {4,5,6}, 
           {7,8,9}, 
           {7,8,9},
           {1,4,7},
           {2,5,8}, 
           {3,6,9},
           {1,5,9},
           {3,5,7}
       };
        
      
    }

}
              

   


  

