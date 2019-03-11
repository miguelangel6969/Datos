package parcial;

/**
 *
 * @author Miguel Hernandez
 */
public class Lista {

    private Producto inicio;
    private int tamanio;
    private int cantidad;

    public void Lista() {
        inicio = null;
        tamanio = 0;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregarAlInicio(int valor, int cantidad) {

        Producto nuevo = new Producto();

        nuevo.setValor(valor, cantidad);
        if (esVacia()) {
            inicio = nuevo;
        } else {

            nuevo.setSiguiente(inicio);

            inicio = nuevo;
        }

        tamanio++;
    }

    public void listar() {

        if (!esVacia()) {

            Producto aux = inicio;

            int i = 0;
            System.out.println("   Productos ----- Cantidad-------Valor ");
            while (aux != null) {

                System.out.println(i + "   Produnto " + i + "      [ " + aux.getCantidad() + " ]" + "        [" + aux.getValor() + " ]");

                aux = aux.getSiguiente();

                i++;
            }
        }
    }

    public void removerPorPosicion(int posicion) {

        if (posicion >= 0 && posicion < tamanio) {

            if (posicion == 0) {

                inicio = inicio.getSiguiente();
            } else {

                Producto aux = inicio;

                for (int i = 0; i < posicion - 1; i++) {
                    aux = aux.getSiguiente();

                }

                Producto siguiente = aux.getSiguiente();

                aux.setSiguiente(siguiente.getSiguiente());
            }

            tamanio--;
        }
    }

    public double restar(int pos, double suma) {

        Producto aux = inicio;
        for (int i = 0; i < pos; i++) {
            aux = aux.getSiguiente();
        }
        int auxiliar_canti = aux.getCantidad();
        int auxiliar_valor = aux.getValor();
        int suma2 = 0;
        System.out.println(auxiliar_valor);
        System.out.println( auxiliar_canti);
        System.out.println(suma);
        suma2 = auxiliar_valor * auxiliar_canti;
        suma -= suma2;
        return suma;
    }

    public void intercambio(int pos1, int pos2) {
        Producto aux = inicio;
        Producto aux1 = inicio;
        Producto aux2 = inicio;
        for (int i = 0; i < pos2; i++) {
            aux2 = aux2.getSiguiente();
        }
        int auxiliar_canti = aux2.getCantidad();
        int auxiliar_valor = aux2.getValor();

        if (pos1 >= 0 && pos1 < tamanio) {
            if (pos1 == 0) {
                int valor1 = aux1.getValor();
                int cantidad1 = aux1.getCantidad();
                inicio.setValor(auxiliar_valor, auxiliar_canti);
                aux2.setValor(valor1, cantidad1);
            } else {
                for (int i = 0; i < pos1; i++) {
                    aux = aux.getSiguiente();
                }
                int valor1 = aux.getValor();
                int cantidad1 = aux.getCantidad();
                aux.setValor(auxiliar_valor, auxiliar_canti);
                aux2.setValor(valor1, cantidad1);
            }
        }
    }

    public void total(double suma) {
        System.out.println("Total                               " + suma);
        double iva = suma * 0.19;
        System.out.println("Impuesto                            " + iva);
        double total = (short) iva + suma;
        System.out.println("Total a Pagar                       " + total);
    }

}
