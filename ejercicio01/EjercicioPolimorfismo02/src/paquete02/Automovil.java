/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {

    protected String nombrePropietario;
    protected String placa;
    protected double valorCancelar;

    public void establecerNombrePropietario(String n) {
        nombrePropietario = n;
    }

    public String obtenerNombrePropietario() {
        return nombrePropietario;
    }

    public void establecerPlaca(String n) {
        placa = n;
    }

    public String obtenerPlaca() {
        return placa;
    }

    public abstract void calcularValorCancelar();

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos Generales\n\n"
                + "Nombre Propietario: %s\n"
                + "Placa: %s\n",
                nombrePropietario,
                placa);

        return cadena;

    }

}
