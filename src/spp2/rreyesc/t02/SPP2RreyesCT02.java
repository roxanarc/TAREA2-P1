/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rreyesc.t02;
import java.util.Scanner;
/**
 *
 * @author roxana
 */
public class SPP2RreyesCT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Roxana Reyes Córdoba A00820572(IIS)
        //Calculadora de salarios
    Scanner k = new Scanner (System.in);
    int count;
    
        System.out.println("¿Cuántos salarios quiere revisar?");
        count = k.nextInt();
        System.out.print("\n");
    
    while (count>0) {switch (pedirDatos("Categoría del trabajador (1-4)")) {
            case 1: 
                pago(30.00);
            break;
            
            case 2: 
                pago(38.00);
            break;
            
            case 3:
                pago(50.00);
            break;
            
            case 4:
                pago(70.00);
            break;
            
            default:
                System.out.println("Ingrese un valor entre 1 y 4 \n");
                
            
        }
    count = count - 1;
    }
    }

static int pedirDatos(String data){
    Scanner k = new Scanner (System.in);
    int d;
    
    System.out.print("Ingrese " + data + ": ");
    d = k.nextInt();
        
    return d;
}
static void pago(double ex){
    double pay,he,sue;
     
    sue = pedirDatos("el salario base");
    he = pedirDatos("las horas extra");
            
    pay = sue + (he * ex);
    System.out.println("El pago es de: $" + pay + "\n");
        
}

}
    
    

