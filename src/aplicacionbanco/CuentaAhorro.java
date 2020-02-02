/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionbanco;

/**
 *
 * @author Angelau
 */
public class CuentaAhorro extends CuentaBancaria {
    private double tipointeres;
    
    public CuentaAhorro(double tipointeres, Persona titular, double saldo, String ncuenta){
        super(titular, saldo, ncuenta);
        this.tipointeres=tipointeres;
    }
    
}
