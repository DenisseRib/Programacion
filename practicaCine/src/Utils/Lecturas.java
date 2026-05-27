package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lecturas {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static String leerString(String mensaje) {
        String valor = "";
        while (valor.isEmpty()) {
            System.out.print(mensaje);
            try {
                valor = br.readLine().trim();
                if (valor.isEmpty()) {
                    System.out.println("ERROR: El campo no puede estar vacío.");
                }
            } catch (IOException e) {
                System.out.println("ERROR: Problema al leer la entrada.");
            }
        }
        return valor;
    }


    public static int leerEntero(String mensaje) {
        int valor = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print(mensaje);
            try {
                valor = Integer.parseInt(br.readLine().trim());
                valido = true;
            } catch (IOException e) {
                System.out.println("ERROR: Problema al leer la entrada.");
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Introduce un número entero válido.");
            }
        }
        return valor;
    }


    public static double leerDouble(String mensaje) {
        double valor = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print(mensaje);
            try {
                valor = Double.parseDouble(br.readLine().trim().replace(",", "."));
                valido = true;
            } catch (IOException e) {
                System.out.println("ERROR: Problema al leer la entrada.");
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Introduce un número decimal válido.");
            }
        }
        return valor;
    }


    public static int leerEnteroEnRango(String mensaje, int min, int max) {
        int valor;
        do {
            valor = leerEntero(mensaje);
            if (valor < min || valor > max) {
                System.out.println("ERROR: El valor debe estar entre " + min + " y " + max + ".");
            }
        } while (valor < min || valor > max);
        return valor;
    }


    public static String leerEmail(String mensaje) {
        String valor = "";
        boolean valido = false;
        while (!valido) {
            valor = leerString(mensaje);
            if (valor.matches("^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$")) {
                valido = true;
            } else {
                System.out.println("ERROR: El email no tiene un formato correcto.");
            }
        }
        return valor;
    }
}
