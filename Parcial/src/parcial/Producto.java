package parcial;

/**
 *
 * @author Miguel Hernandez
 */
public class Producto {

    private int valor;
    private int cant;
    private Producto siguiente;

    public void Producto() {
        this.valor = 0;
        this.cant = 0;
        this.siguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public int getCantidad() {
        return cant;
    }

    public void setValor(int valor, int canti) {
        this.valor = valor;
        this.cant = canti;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Producto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Producto siguiente) {
        this.siguiente = siguiente;
    }
}
