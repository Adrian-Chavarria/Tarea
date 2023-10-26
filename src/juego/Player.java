package juego;


/**
 * Representa a un jugador en un juego y posee dos atributos para el nombre de 
 * los jugadores y un atributo para la ficha que se le va asignar a cada 
 * jugador.
 * @author chava
 */

public class Player {

    private String nameplayer1;
    private String nameplayer2;
    private File file;

    /**
     * Constructor que recibe los nombres de los jugadores.
     * @param nameplayer1 //Nombre del primer jugador .
     * @param nameplayer2 //Nombre del segundo jugador.
     * @param file //objeto para el jugador.
     */
    public Player(String nameplayer1, String nameplayer2, File file) {
       
        this.nameplayer1 = nameplayer1;
        this.nameplayer2 = nameplayer2;
        this.file = file;
    }
   
       /**
        * Constructor vacio.
        */

    public Player() {
    }
    /**
     * Obtiene el nombre del primer jugador.
     * @return Nombre del primer jugador.
     */

    public String getNameplayer1() {
        return nameplayer1;
    }
    
    /**
     * Establece el nombre del primer jugador.
     * @param nameplayer1 Nuevo nombre del primer jugador.
     */
    public void setNameplayer1(String nameplayer1) {
        this.nameplayer1 = nameplayer1;
    }
/**
 * Obtiene el nombre del segundo jugador.
 * @return Nombre del segundo jugador.
 */
    public String getNameplayer2() {
        return nameplayer2;
    }
/**
 * Establece el nombre del segundo jugador.
 * @param nameplayer2 Nuevo nombre del segundo jugador.
 */
    public void setNameplayer2(String nameplayer2) {
        this.nameplayer2 = nameplayer2;
    }
/**
 * obtiene la ficha asociada al jugador.
 * 
 * @return La ficha asociada al jugador.
 */
    public File getFile() {
        return file;
    }
/**
 * 
 * @param file Nueva ficha asociada al jugador.
 */
    public void setFile(File file) {
        this.file = file;
    }


}
