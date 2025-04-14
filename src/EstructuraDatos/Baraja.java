package EstructuraDatos;

import java.util.Collections;
import java.util.LinkedList;

public class Baraja {
    private String nombre;

    private LinkedList<Naipe> mazo;

    public Baraja(String nombre) {
        mazo = new LinkedList<Naipe>();
        this.nombre = nombre;
        // vamos a añadir a la baraja 40 cartas, 10 por palo
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                // aqui cambiando el valor de cada carta
                switch (i) {
                    case 0:
                        mazo.add(new Naipe(Palo.OROS, j+1));
                        break;
                    case 1:
                        mazo.add(new Naipe(Palo.BASTOS, j+1));
                        break;
                    case 2:
                        mazo.add(new Naipe(Palo.COPAS, j+1));
                        break;
                    case 3:
                        mazo.add(new Naipe(Palo.ESPADAS, j+1));
                        break;

                    default:
                        break;
                }

            }
        }

        Collections.shuffle(mazo);
    }
    public String getNombre() {
        return nombre;
    }

    public Naipe repartirCarta() {
        return mazo.removeLast();
    }

    public int cartasRestantes() {
        return mazo.size();
    }

    public String primeraCarta() {
        return mazo.getFirst().toString();
    }

    public Naipe copiaPrimeraCarta() {
        return mazo.getFirst();
    }
}
