/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {

    private int numeroGalones;
    private double costoGalon;
    private double iva;

    public void establecerNumeroGalones(int n) {
        numeroGalones = n;
    }

    public int obtenerNumeroGalones() {
        return numeroGalones;
    }

    public void establecerCostoGalon(double n) {
        costoGalon = n;
    }

    public double obtenerCostoGalon() {
        return costoGalon;
    }

    public void calcularIVA() {
        iva = ((costoGalon * numeroGalones) * 10) / 100;
    }

    public double obtenerIva() {
        return iva;
    }

    @Override
    public void calcularValorCancelar() {
        // (costo x galón) * (número de galones) + el iva de ((costo x galón) * 
        // (número de galones))
        valorCancelar = (costoGalon * numeroGalones) + iva;
    }

    @Override
    public String toString() {

        String cadena = String.format("%s\n"
                + "Datos Automovil De Gasolina \n\n"
                + "Numero De Galones: %d\n"
                + "Costo Del Galon: %.2f\n"
                + "Valor A Cancelar: %.2f\n",
                super.toString(),
                numeroGalones,
                costoGalon,
                obtenerValorCancelar());

        return cadena;

    }
}
