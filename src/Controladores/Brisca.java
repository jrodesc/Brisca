package Controladores;

import EstructuraDatos.Baraja;
import EstructuraDatos.Jugable;
import EstructuraDatos.JugadorHumano;
import EstructuraDatos.JugadorPC;
import EstructuraDatos.Naipe;
import Vistas.InterfazConsola;

public class Brisca implements Jugable{
    private JugadorHumano jugadorA;
    private JugadorPC jugadorB;

    private Baraja baraja;

    private Naipe muestra;

    public Brisca(String nombre, String dificultad) {
        nombre = jugadorA.getNombre();
        baraja = new Baraja("Española");
    }

    public void ronda(boolean quienEmpieza) {
        //si boolean true empieza jugadorA
        InterfazConsola.cartaJugadaOponente(jugadorB.getNombre(), muestra);
        InterfazConsola.pedirCarta(jugadorA);

    }

    @Override
    public void inizializar() {
        //se inicializa el juego reparte 3 cartas a cada jugador
        for(int i = 0; i<3; i++) {
            jugadorA.recibirCarta(baraja.repartirCarta());
            jugadorB.recibirCarta(baraja.repartirCarta());
        }
        muestra = baraja.copiaPrimeraCarta();

        jugar();
    }

    @Override
    public void jugar() {
        do {
            jugadorA.getMano();
            ronda(true);
            if (baraja.cartasRestantes()>0) {
                baraja.repartirCarta();
            }
            comprobarGanador();
        } while(baraja.cartasRestantes() > 0);
    }

    @Override
    public void comprobarGanador() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comprobarGanador'");
    }

    public boolean ganadorMano(Naipe naipeA, Naipe naipeB, boolean quienEmpezo) {
        if (naipeA.getPuntuacion() > naipeB.getPuntuacion()) {
            return true;
        } else {
            return false;
        }
    }
}
