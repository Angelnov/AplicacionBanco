/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionbanco;

import java.util.Scanner;

/**
 *
 * @author Angelau
 */
public class CuentaBancaria {
    protected Persona titular;
    protected double saldo;
    protected String ncuenta;
    
    public CuentaBancaria(Persona titular, double saldo, String ncuenta){
        this.titular=titular;
        this.saldo=saldo;
        this.ncuenta=ncuenta;
    }
    
    
    
    public static boolean validarnum(String ncuenta){
       int dc1;
            int dc2;
            int restodiv;
            int restodiv2;
            int entidad=0;
            int suma=0;
            int suma2=0;
            int[] arraye= {4,8,5,10,9,7,3,6,0,0,1,2,4,8,5,10,9,7,3,6};
                    
            for(int i=0; i<8; i++){
            entidad=Integer.parseInt(ncuenta.substring(i, i+1));
            suma=suma+(entidad*arraye[i]);             
            
            }
        restodiv=suma%11;
        dc1=11-restodiv;
        if(dc1==10){
            dc1=1;
        }else if(dc1==11){
            dc1=0;
        }else{
            dc1=dc1;
          
        }
        
        
        for(int i=10; i<20;i++){
            entidad=Integer.parseInt(ncuenta.substring(i, i+1));
            suma2=suma2+(entidad*arraye[i]);
        }
        restodiv2=suma2%11;
        dc2=11-restodiv2;
        if(dc2==10){
            dc2=1;
        }else{
            dc2=dc2;
                       
   }       
     if((dc1==Integer.parseInt(ncuenta.substring(8, 9))) && (dc2==Integer.parseInt(ncuenta.substring(9, 10)))){
         return true;        
     }else{
         return false;
     }
}

    /**
     * @return the titular
     */
    public Persona getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the ncuenta
     */
    public String getNcuenta() {
        return ncuenta;
    }

    /**
     * @param ncuenta the ncuenta to set
     */
    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }
    
    public void ingresar(double ingreso)throws Exception{  
            if(ingreso>0){
              this.saldo=saldo+ingreso;
            }else{
                throw new Exception("Ingreso incorrecto");
            }   
    }
    public void retirar()throws Exception{
       Scanner snr=new Scanner(System.in);
       System.out.println("Introduzca una cantidad: ");
       int reintegro=snr.nextInt();
       if (reintegro<saldo){
           this.saldo-=reintegro;
       }else{
           throw new Exception("Cantidad insuficiente");
       }
      
   }
}