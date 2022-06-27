/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Automovil;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // -------------------------
        String nombrePropiteario;
        String placa;
        // -------------------------
        int numeroGalones;
        double costoGalon;
        // -------------------------
        int numeroLitros;
        double costoLitros;
        double descuento;
        // -------------------------
        ArrayList<Automovil> autos = new ArrayList();

        // ------------------------------------------------------------------
        AutomovilGasolina autogas = new AutomovilGasolina();

        autogas.establecerNombrePropietario("David Carrion");
        autogas.establecerPlaca("LSD-1462");
        autogas.establecerNumeroGalones(15);
        autogas.establecerCostoGalon(500.50);
        autogas.calcularIVA();
        autogas.calcularValorCancelar();

        // System.out.println(autogas);
        AutomovilDiesel autodiesel = new AutomovilDiesel();

        autodiesel.establecerNombrePropietario("Jean");
        autodiesel.establecerPlaca("KJO-9284");
        autodiesel.establecerNumeroLitros(20);
        autodiesel.establecerCostoGalon(2);
        autodiesel.calcularDescuento(10);
        autodiesel.calcularValorCancelar();
         // System.out.println(autodiesel);

        // ------------------------------------------------------------------
        autos.add(autogas);
        autos.add(autodiesel);
        // System.out.println(autos);
        
        for (int i = 0; i < autos.size(); i++) {
            System.out.printf("%s\n---------------------------------------\n"
                    + "", autos.get(i));
        }

    }
}
