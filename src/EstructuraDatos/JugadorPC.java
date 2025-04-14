package EstructuraDatos;

public class JugadorPC extends Jugador{
    private String dificultad;

    public JugadorPC(String nombre, String dificultad) {
        super(nombre);
        this.dificultad = dificultad;
    }


    public Naipe jugarCarta(int numero) {
        return mano.remove(0);
    }

    public String getDificultad() {
        return dificultad;
    }

}
