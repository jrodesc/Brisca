package EstructuraDatos;

import java.util.InputMismatchException;

public class Naipe {
    private static String[] carta = {"UNO","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","SOTA","CABALLO","REY"};
    private int numero;
    private Palo palo;


    public Naipe(Palo palo, int numero) {
        this.palo = palo;
        try {
            this.numero = numero;
        } catch (InputMismatchException e) {
            System.out.println("Numero de la carta incorrecto");
        }
    }

    //metodo aqui abajo que en base al numero del naipe nos diga si es una sota, caballo...

    public Palo getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    //aqui lo que eremos saber es el valor de la carta haciendo uso de su numero
    public int getPuntuacion() {
        if (numero == 1) {
            return 11;
        } else if(numero ==3 ) {
            return 10;
        } else if(numero == 8 ) {
            return 2;
        } else if(numero ==9 ) {
            return 3;
        } else if(numero ==10 ) {
            return 4;
        } else {
            return 0;
        }
    }

    public String getCarta() {
        if (numero==1) {
            return carta[0];
        } else if(numero == 2) {
            return carta[1];
        } else if(numero == 3) {
            return carta[2];
        } else if(numero == 4) {
            return carta[3];
        } else if(numero == 5) {
            return carta[4];
        } else if(numero == 6) {
            return carta[5];
        } else if(numero == 7) {
            return carta[6];
        } else if(numero == 8) {
            return carta[7];
        } else if(numero == 9) {
            return carta[8];
        } else if(numero == 10) {
            return carta[9];
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        return getCarta()+" de "+ getPalo();
    }
}
