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
public class CuentaCorrienteEmpresa extends CuentaCorriente {
    private double maxdescubierto;
    private double interesdescubierto;
    
    
    public CuentaCorrienteEmpresa(double maxdescubierto, double interesdescubierto, Hashtable entidades, Persona titular, double saldo, String ncuenta)throws Exception{
        super(entidades, titular, saldo, ncuenta);
        this.maxdescubierto=maxdescubierto;
        this.interesdescubierto=interesdescubierto;
        if(this.maxdescubierto>=0){throw new Exception("Maximo incorrecto");
        } 
        if(this.saldo<this.maxdescubierto) throw new Exception("Saldo insuficiente");
    }
    
}
