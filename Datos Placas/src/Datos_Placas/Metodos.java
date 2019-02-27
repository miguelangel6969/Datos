package Datos_Placas;

/**
 *
 * @author Miguel Hernandez
 */
public class Metodos {

    public String condicional_carro = "[A-Z][A-Z][A-Z][0-9][0-9][0-9]";
    public String condicional_moto = "[A-Z][A-Z][A-Z][0-9][0-9][A-Z]";
    public String condicional_fecha = "[0-3][0-1][/][0-1][0-9][/][0-2][0][0-1][0-8]";
    public String condicional_casa = "[A-Z][A-Z][0-9][0-9][0-9][A-Z][A-Z][A-Z][A-Z][A-Z][A-Z][A-Z]";

    public void carro(String placa) {
        if (placa.matches(condicional_carro)) {
            System.out.println("Es correcto");
        } else {
            System.out.println("Es incorrecto");
        }
    }

    public void moto(String placa) {
        if (placa.matches(condicional_moto)) {
            System.out.println("Es correcto");
        } else {
            System.out.println("Es incorrecto");
        }
    }

    public void fecha(String fecha) {
        if (fecha.matches(condicional_fecha)) {
            System.out.println("Es correcto");
        } else {
            System.out.println("Es incorrecto");
        }

    }

    public void casa(String casa) {
        if (casa.matches(condicional_casa)) {
            System.out.println("Es correcto");
        } else {
            System.out.println("Es incorrecto");
        }
    }
}
