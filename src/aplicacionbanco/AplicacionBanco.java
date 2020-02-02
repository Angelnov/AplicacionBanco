/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionbanco;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

    
public class AplicacionBanco {
        
    public static Persona nuevoTitular(){
        
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduca su nombre");
        String nombre=sn.nextLine();
        System.out.println("Introduca su Apellido");
        String apellido=sn.nextLine();
        System.out.println("Introduca su fecha de nacimiento");
        String fnacimiento=sn.nextLine();
        Persona P1 = new Persona(nombre, apellido, fnacimiento);
        return P1;
        
}
   /* public static CuentaBancaria NuevaCuenta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige un tipo de cuenta");
        System.out.println("1. Cuenta Ahorro");
        System.out.println("2. Cuenta Corriente Personal");
        System.out.println("3. Cuenta Corriente Empresa");
        int opcion=sc.nextInt();
        sc.nextLine();
        switch(opcion){
            case 1: 
                Persona canfillo1 = nuevoTitular();
                System.out.println("Introduzca numero de cuenta");
                String ncuenta=sc.nextLine();
                System.out.println("Introduzca el saldo");
                double saldo=sc.nextDouble();
                System.out.println("Introduzca el tipo de interes");
                double tipointeres=sc.nextDouble();
                if(CuentaBancaria.validarnum(ncuenta)==true){
                CuentaBancaria C1=new CuentaAhorro(tipointeres, canfillo1 , saldo, ncuenta);
                return C1;
        }
       
    }
         return null;
    }*/
    
    
    public static CuentaBancaria nuevaCuenta(){
        Scanner sc = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        
        Persona P1 = nuevoTitular();
        System.out.println("Introduzca numero de cuenta");
        String ncuenta=sc.nextLine();
        if(CuentaBancaria.validarnum(ncuenta)==false){
            //TODO arreglar
        }
        System.out.println("Introduzca el saldo");
        double saldo=sc.nextDouble();
        System.out.println("Elige un tipo de cuenta");
        System.out.println("1. Cuenta Ahorro");
        System.out.println("2. Cuenta Corriente Personal");
        System.out.println("3. Cuenta Corriente Empresa");
        
       
        boolean flag=true;          
        Hashtable <String, Double> entidades=new Hashtable<String, Double>();
        int opcion=sc.nextInt();
        sc.nextLine();
        CuentaBancaria C1;
        switch(opcion){
            case 1:                 
                System.out.println("Introduzca el tipo de interes");
                double tipointeres=sc.nextDouble();              
                 C1=new CuentaAhorro(tipointeres, P1 , saldo, ncuenta);
                
            break;
            case 2:
                System.out.println("Introduzca la comision");
                double comisionman=sc.nextDouble();
                

                while(flag){
                    System.out.println("Introduzca la entidad autorizada");
                    String entidadau = sc.nextLine();
                    System.out.println("Introduzca maximo recibo");
                    double maxrecibo = sn.nextDouble();
                    entidades.put(entidadau, maxrecibo);
                    System.out.println("¿Desea añadir otra entidad?");
                    flag=sc.nextBoolean();
                }
            
                
                     C1=new CuentaCorrientePersonal(comisionman, entidades , P1, saldo, ncuenta);
                
                break;
            case 3:
                System.out.println("Introduzca maximo descubierto");
                double maxdescubierto = sn.nextDouble();
                System.out.println("Introduzca interes descubierto");
                double interesdescubierto = sn.nextDouble();
                while(flag){
                    System.out.println("Introduzca la entidad autorizada");
                    String entidadau = sc.nextLine();
                    System.out.println("Introduzca maximo recibo");
                    double maxrecibo = sn.nextDouble();
                    entidades.put(entidadau, maxrecibo);
                    System.out.println("¿Desea añadir otra entidad?");
                    flag=sc.nextBoolean();
                }
                
                     C1=new CuentaCorrienteEmpresa(maxdescubierto, interesdescubierto, entidades , P1, saldo, ncuenta);
                
                
                break;
            default:
                C1= null;
                
         
        }
        return C1; 
    }
    
    public static void main(String[] args) {
    
    ArrayList<CuentaBancaria> listacuentas = new ArrayList<CuentaBancaria>();
    
    
    System.out.println("Eliga una se las siguientes opciones.");
    System.out.println("Abrir una nueva cuenta.");
    System.out.println("Ver un listado de las cuentas disponibles");
    System.out.println("Obtener los datos de una cuenta concreta.");
    System.out.println("Realizar un ingreso en una cuenta.");
    System.out.println("Retirar efectivo de una cuenta.");
    System.out.println("Consultar el saldo actual de una cuenta.");
    System.out.println("Salir de la aplicación.");
    
    Scanner so = new Scanner(System.in);
    int optiontemp = so.nextInt();
    switch(optiontemp){
        case 1:
            CuentaBancaria cuenta1= nuevaCuenta();    
            listacuentas.add(cuenta1);
            break;
        case 2:
            System.out.println("Introduzca el numero de cuenta a encontrar.");
            String cuentatemp= so.nextLine();
            for (CuentaBancaria cuenta : listacuentas) {
                if (cuenta.getNcuenta()==cuentatemp){
                System.out.println("Numero cuenta: "+cuenta.getNcuenta());
                System.out.println("Saldo: "+cuenta.getSaldo());
                System.out.println("Titular: "+cuenta.getTitular().getNombre());
                }
            }
    }
   
    //TO
        
        
}
}