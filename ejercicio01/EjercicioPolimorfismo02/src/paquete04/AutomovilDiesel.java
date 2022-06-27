/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {

    private int numeroLitros;
    private double costoLitros;
    private double descuento;

    public void establecerNumeroLitros(int n) {
        numeroLitros = n;
    }

    public int obtenerNumeroLitros() {
        return numeroLitros;
    }

    public void establecerCostoGalon(double n) {
        costoLitros = n;
    }

    public double obtenerCostoGalon() {
        return costoLitros;
    }

    public void calcularDescuento(double d) {
        descuento = (numeroLitros * d) / 100;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public void calcularValorCancelar() {

        valorCancelar = costoLitros * (numeroLitros - descuento);
    }

    @Override
    public String toString() {

        String cadena = String.format("%s\n"
                + "Datos Automovil De Diesel \n\n"
                + "Numero De Litros: %d\n"
                + "Costo Del Litro: %.2f\n"
                + "Valor A Cancelar: %.2f\n",
                super.toString(),
                numeroLitros,
                costoLitros,
                obtenerValorCancelar());

        return cadena;

    }
}
