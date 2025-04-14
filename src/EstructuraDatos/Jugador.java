package EstructuraDatos;

import java.util.ArrayList;

public abstract class Jugador {
    private String nombre;

    protected ArrayList<Naipe> mano;

    protected ArrayList<Naipe> cartasGanadas;


    public Jugador(String nombre) {
        this.nombre = nombre;

        mano = new ArrayList<Naipe>();

        cartasGanadas = new ArrayList<Naipe>();
    }

    public void recibirCarta(Naipe carta) {
        mano.add(carta);
    }

    public void cartaGanada(Naipe cartaA, Naipe cartaB) {
        cartasGanadas.add(cartaA);
        cartasGanadas.add(cartaB);
    }

    public String getNombre() {
        return nombre;
    }

    public String getMano() {
        int contador=1;
        String texto="";
        for (Naipe naipe : mano) {
            texto += (contador+". "+naipe.toString()+"\n");
            contador++;
        }
        return texto;
    }

    public int getPuntos() {
        int resultado=0;
        for (Naipe naipe : cartasGanadas) {
            resultado += naipe.getPuntuacion();
        }
        return resultado;
    }

    public abstract Naipe jugarCarta(int numero);
}
