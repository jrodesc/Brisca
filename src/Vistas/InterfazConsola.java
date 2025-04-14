package Vistas;


import EstructuraDatos.JugadorHumano;
import EstructuraDatos.Naipe;
import Utildiades.ES;

public class InterfazConsola {
    public void pedirCarta(JugadorHumano jugador1) {
        jugador1.getMano();
        jugador1.jugarCarta(ES.leerEntero("Elige la carta que deseas jugar: ", 1, jugador1.tamMano()));
    }

    public void resultadoRonda(String nombreGanador) {
         System.out.println(nombreGanador);
    }

    public void resultadoPartida(String nombreGanadorPartida, int puntos) {
        System.out.println("Ha ganado: "+nombreGanadorPartida + " \nCon: "+puntos);
    }

    public void estadoPartida(Naipe naipe, int cartasRestantes) {
        System.out.println("Carta de muestra:"+naipe.toString());
        System.out.println("Cartas restantes:"+cartasRestantes);
    }

    public void cartaJugadaOponente(String nombreJugadorB, Naipe naipe) {
        System.out.println("Nombre: "+nombreJugadorB);
        System.out.println("La carta jugada es: "+ naipe.toString());
    }
}
