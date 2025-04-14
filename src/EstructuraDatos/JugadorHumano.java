package EstructuraDatos;

public class JugadorHumano extends Jugador{
    public JugadorHumano(String nombre) {
        super(nombre);
    }

    @Override
    public Naipe jugarCarta(int numero) {
        return mano.remove(numero);
    }

    public int tamMano() {
        return mano.size();
    }
}
