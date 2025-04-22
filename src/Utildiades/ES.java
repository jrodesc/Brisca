package Utildiades;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ES {
    private static Scanner teclado = new Scanner(System.in);

    public static int leerEntero(String texto, int minimo, int maximo) {
        int numero;
        do {
            try {
                System.out.println(texto);
                numero = teclado.nextInt();
                teclado.nextLine();
                if (numero<minimo || numero > maximo) {
                    System.out.println("Error, debe introducir solo numeros entre "+minimo+ " y "+maximo);
                } else {
                    return numero;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, solo debes usar numeros enteros");
                
            }
        } while(true);
    }

    public static String leerCadena(String texto) {
        System.out.println(texto);
        String respuesta = teclado.nextLine();
        return respuesta;
    }

    public static void guardarDatos(String texto) {
        File f;

        try {
            f  = new File("datos");
            PrintWriter pw = new PrintWriter(new FileWriter(f+".txt", true));
            pw.write(texto);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
