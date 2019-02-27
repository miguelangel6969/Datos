package recursividad;

import java.util.Scanner;

public class recursicidad {

    public static void main(String[] args) {
        metodos objeto = new metodos();
        Scanner leer = new Scanner(System.in);
        System.out.println("cual ejercicio quiere revisar");
        System.out.println("1 = Fibonacci");
        System.out.println("2 = Factorial");
        System.out.println("3 = Ordenar arreglo");
        System.out.println("4 = Suma de N numeros ");
        System.out.println("5 = Suma de numeros pares ");
        System.out.println("6 = MCD");
        System.out.println("7 = De entero a Binario ");
        System.out.println("8 = null");
        System.out.println("9 = Suma de un  arreglo ");
        System.out.println("10 = Invertir numeros de un arreglo ");
        System.out.println("11 = Distintos valores de X ");
        System.out.println("12 = Polindromo");
        System.out.println("13 = Desconponer un numero");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1: {
                int a[] = new int[]{1, 2, 3, 4, 5};
                objeto.ordenar(a, 0);
                for (int i = 0; i < a.length; i++) {
                    System.out.println("[" + a[i] + "]");
                }
                break;
            }
            case 2: {
                System.out.println("Dijite el numero ");
                int num = leer.nextInt();
                int rts = objeto.fac(num, 1);
                System.out.println("El factorial de numero es " + rts);
                break;
            }
            case 3: {
                System.out.println(objeto.fibonacci(5));
                break;
            }
            case 4: {
                System.out.println("dijite la cantidad de enteros");
                int nume = leer.nextInt();
                System.out.println(objeto.suma_natu(nume, 0, 0));
                break;
            }
            case 5: {
                System.out.println("dijite el numero");
                int numero2 = leer.nextInt();
                if (numero2 % 2 != 0) {
                    System.out.println("error ");
                } else {
                    System.out.println(objeto.sumapares(numero2, 0, 0));
                }
                break;
            }
            case 6: {
                System.out.println("dijite el numero 1º");
                int num1 = leer.nextInt();
                System.out.println("dijite el numero º2 ");
                int num2 = leer.nextInt();
                System.out.println(objeto.MCD(num1, num2, 0, 1));

                break;
            }
            case 7: {
                System.out.print("dijite el nuemro numero > 0: ");
                int n = leer.nextInt();
                System.out.print("numero binario es : ");
                objeto.binario(n);
                System.out.println("");
                break;
            }
            case 8: {

                break;
            }
            case 9: {
                int a[] = new int[]{1, 2, 3, 4, 5};
                System.out.println(objeto.sumaarr(a, 0, 0));
                break;
            }
            case 10: {
                int a[] = new int[]{1, 2, 3, 4, 5};
                objeto.invertir(a, 0, a.length - 1);
                for (int i = 0; i < a.length; i++) {
                    System.out.println(a[i]);
                }
                break;
            }
            case 11: {
                System.out.println(objeto.f(25));
                System.out.println("esta funcion recursiva se encarga de siempre poder transformar el numero ingresado a un 111  \n"
                        + "y por fin le descuenta 20 por el codigo que tiene en el else se tranforma en 91");
                break;
            }
            case 12: {
                String nombre = "holaaloh";
                if (objeto.polindromo(nombre) == true) {
                    System.out.println("es polindromo");
                } else {
                    System.out.println("no es polindromo");
                }
                break;
            }
            case 13: {
                System.out.println("dijite el numero");
                int num = leer.nextInt();
                objeto.suma(num, 1);
                break;
            }
        }

    }
}
