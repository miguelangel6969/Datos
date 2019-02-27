package Datos_Placas;

import java.util.Scanner;

/**
 *
 * @author Miguel Hernandez
 */
public class TareaDeDatos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Metodos ob = new Metodos();

        System.out.println("Dijite que operacion decea:");
        System.out.println("1= carro");
        System.out.println("2= moto");
        System.out.println("3= fecha");
        System.out.println("4= casa");
        int op = leer.nextInt();
        switch (op) {
            case 1:
                System.out.println("Dijite la placa del carro");
                String carro = leer.next();
                ob.carro(carro);
                break;
            case 2:
                System.out.println("Dijite la placa de la moto");
                String moto = leer.next();
                ob.moto(moto);
                break;

            case 3:
                System.out.println("Dijite la fecha");
                String fecha = leer.next();
                break;
            case 4:
                System.out.println("Dijite el codigo de la casa ");
                String casa = leer.next();
                ob.casa(casa);
                break;

        }

    }

}
