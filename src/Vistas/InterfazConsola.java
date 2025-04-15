package Vistas;


import EstructuraDatos.Jugador;
import EstructuraDatos.JugadorHumano;
import EstructuraDatos.Naipe;
import Utildiades.ES;

public class InterfazConsola {
    public static void pedirCarta(JugadorHumano jugadorA) {
        jugadorA.getMano();
        jugadorA.jugarCarta(ES.leerEntero("Elige la carta que deseas jugar: ", 1, jugadorA.tamMano()));
    }

    public static void resultadoRonda(String nombreGanador) {
         System.out.println(nombreGanador);
    }

    public static void resultadoPartida(String nombreGanadorPartida, int puntos) {
        System.out.println("Ha ganado: "+nombreGanadorPartida + " \nCon: "+puntos);
    }

    public static void estadoPartida(Naipe naipe, int cartasRestantes) {
        System.out.println("Carta de muestra:"+naipe.toString());
        System.out.println("Cartas restantes:"+cartasRestantes);
    }

    public static void cartaJugadaOponente(String nombreJugadorB, Naipe naipe) {
        System.out.println("Nombre: "+nombreJugadorB);
        System.out.println("La carta jugada es: "+ naipe.toString());
    }
}
