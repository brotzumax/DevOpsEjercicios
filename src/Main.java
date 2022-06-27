
import java.util.Scanner;

/**
 *
 * @author brotz
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        primerEjercicio();
        segundoEjercicio();
        tercerEjercicio();
    }

    public static void primerEjercicio() {
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = sc.nextLine();

        System.out.println("Primeras dos letras: " + cadena.charAt(0) + cadena.charAt(1));
        System.out.println("Primeras tres letras: " + cadena.charAt(0) + cadena.charAt(1) + cadena.charAt(2));
        System.out.println("Ultimas dos letras: " + cadena.charAt(cadena.length() - 2) + cadena.charAt(cadena.length() - 1));
        System.out.println("Ultima letra: " + cadena.charAt(cadena.length() - 1));
        System.out.println("------------------------------");
    }

    public static void segundoEjercicio() {
        double costoDelMenu, cantidadPersonas, porcentajePropina, porcentajeImpuestos, totalAPagar;
        porcentajeImpuestos = 20;

        System.out.print("Indique el costo de la comida: ");
        costoDelMenu = sc.nextInt();
        System.out.print("Indique la cantidad de personas a dividir la cuenta: ");
        cantidadPersonas = sc.nextInt();
        System.out.print("Indique el porcentaje que desea dar de propina: ");
        porcentajePropina = sc.nextInt();

        totalAPagar = costoDelMenu + (costoDelMenu * (porcentajePropina / 100)) + (costoDelMenu * (porcentajeImpuestos / 100));
        System.out.println("La cantidad a pagar de cada persona es de: " + (totalAPagar / cantidadPersonas));
        sc.nextLine();
        System.out.println("------------------------------");
    }

    public static void tercerEjercicio() {
        String nombre;
        int edad;

        System.out.print("Ingresa tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingresa tu edad: ");
        edad = sc.nextInt();

        System.out.println(nombre + ": El año pasado tenias " + (edad - 1) + " años, y el proximo año cumpliras " + (edad + 1) + " años.");
        System.out.println("------------------------------");
    }
}
