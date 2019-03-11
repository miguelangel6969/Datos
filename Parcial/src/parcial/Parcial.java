package parcial;

import java.util.Scanner;
import java.math.*;

/**
 *
 * @author Miguel Hernandez
 */
public class Parcial {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Lista lista = new Lista();
        short op = 0;
        int precio = 0;
        int cantidad = 0;
        double suma = 0;
        int total_compra = 0;
        int iva = 0;

        while (op != 5) {
            System.out.println("\n1. Agregar elementos a la Factura  "
                    + "\n2. Eliminar Elementos "
                    + "\n3. Modificar los Elementos Cambiar el producto 1 por el 2 "
                    + "\n4. Recalcular la Factura  "
                    + "\n5. Salir");
            System.out.println("Que accion decea ejecutar");
            op = leer.nextShort();
            
            switch (op) {
                case 1:
                    precio = (int) ((Math.random() * 100) + 1);
                    cantidad = (int) ((Math.random() * 20) + 1);
                    suma += precio * cantidad;
                    lista.agregarAlInicio(precio, cantidad);
                    System.out.println("          <<-- Lista -->>");
                    System.out.println("");
                    lista.listar();
                    lista.total(suma);
                    break;
                case 2:
                    System.out.println("\nCual pocion deces eliminar");
                    int pos = leer.nextInt();
                    lista.removerPorPosicion(pos);
                    suma = lista.restar(pos,suma);
                    
                    System.out.println("          <<-- Lista -->>\n¡Listo!");
                    lista.listar();
                    lista.total(suma);
                    break;
                case 3:
                    System.out.println("Cual Poscion decea sustituir");
                    int opcion1 = leer.nextInt();
                    System.out.println("Por cual");
                    int opcion2 = leer.nextInt();
                    lista.intercambio(opcion1, opcion2);
                    lista.listar();
                    lista.total(suma);
                    break;
                case 4:
                    lista.listar();
                    lista.total(suma);
                    break;

            }
        }
    }

}
