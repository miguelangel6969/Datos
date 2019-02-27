package recursividad;

public class metodos {

    int aux, a, cont = 0;
    int maxA, maxB = 0;

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public void ordenar(int arr[], int cont) {
        for (int i = 0; i < arr.length; i++) {
            if (cont < arr.length - 1) {
                if (arr[cont] > arr[cont + 1]) {
                    aux = arr[cont];
                    arr[cont] = arr[cont + 1];
                    arr[cont + 1] = aux;
                    ordenar(arr, cont + 1);
                } else {
                    ordenar(arr, cont + 1);
                }

            }
        }
    }

    public int fac(int num, int suma) {
        if (num == 0) {
            return suma;
        } else {
            suma *= num;
            return fac(num - 1, suma);
        }

    }

    public int suma_natu(int limite, int suma, int numero) {
        if (numero == limite) {
            suma += limite;
            return suma;
        } else {
            suma += numero;
            return suma_natu(limite, suma, numero + 1);

        }
    }

    public int sumapares(int limite, int suma, int numero) {
        if (numero == limite) {
            return suma;
        } else {
            if (numero % 2 == 0) {
                suma += numero;
                return sumapares(limite, suma, numero + 1);
            } else {
                return sumapares(limite, suma, numero + 1);
            }
        }

    }

    public int MCD(int a, int b, int mcd, int cont) {
        if (cont == a || cont == b) {
            return mcd;
        } else {
            if (a % cont == 0) {
                maxA = cont;
            }
            if (b % cont == 0) {
                maxB = cont;
            }
            if (maxA == maxB) {
                mcd = cont;
            }
            return MCD(a, b, mcd, cont + 1);
        }
    }

    public void binario(int n) {
        if (n < 2) {
            System.out.print(n);
        } else {
            binario(n / 2);
            System.out.print(n % 2);

        }
    }

    public int sumaarr(int arr[], int suma, int cont) {
        if (cont == arr.length) {
            return suma;
        } else {
            suma += arr[cont];
            return sumaarr(arr, suma, cont + 1);
        }

    }

    public void invertir(int arr[], int cont, int cont1) {
        if (cont == cont1 || cont1 >= cont) {
            aux = arr[cont];
            arr[cont] = arr[cont1];
            arr[cont1] = aux;
            invertir(arr, cont + 1, cont1 - 1);
        }
    }

    public int f(int x) {
        if (x > 100) {
            return (x - 10);
        } else {

            return (f(f(x + 11)));
        }
    }

    public boolean polindromo(String a) {
        if (a.length() <= 1) {
            return true;
        } else {
            if (a.charAt(0) == a.charAt(a.length() - 1)) {
                return polindromo(a.substring(1, a.length() - 1));
            } else {
                return false;
            }
        }
    }

    public void suma(int numero, int operador) {
        int resta = numero - operador;
        if (resta >= operador) {
            System.out.println(numero + " = " + resta + " + " + operador);
            suma(numero, ++operador);
        }

    }
}
