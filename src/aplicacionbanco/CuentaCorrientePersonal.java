/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionbanco;

import java.util.Hashtable;

/**
 *
 * @author Angelau
 */
public class CuentaCorrientePersonal extends CuentaCorriente {
    private double comisionman;
    
    public CuentaCorrientePersonal(double comisionman, Hashtable entidades, Persona titular, double saldo, String ncuenta){
        super(entidades, titular, saldo, ncuenta);
        this.comisionman=comisionman;
    }
    
}
