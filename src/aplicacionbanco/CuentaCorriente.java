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
public abstract class CuentaCorriente extends CuentaBancaria {
    protected Hashtable <String,Integer> entidades = new Hashtable<String, Integer>();

    public CuentaCorriente(Hashtable entidades, Persona titular, double saldo, String ncuenta){
        super(titular, saldo, ncuenta);
        this.entidades=entidades;
    }
}
