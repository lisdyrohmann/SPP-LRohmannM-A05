/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lrohmannm.a05;
import java.util.Scanner;
/**
 *
 * @author Lisdy Nadine Rohmann Martínez
 * 513659
 * IIS
 */
public class SPPLRohmannMA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lisdy Nadine Rohmann Martínez
        //513659
        // Carrera: IIS
       
        solicitarEntero("la edad");
        solicitarCadena("una materia");
        solicitarDouble("promedio de una materia");
        solicitarLong("un número grande que no contenga decimal");        
    }
    
    
    static int  solicitarEntero (String mensaje){
        Scanner Sc = new Scanner (System.in);
        int x=0;
        boolean flag;
        do{      
            try{
                System.out.println("Introduce "+mensaje);
                x = Sc.nextInt(); 
                flag = true;
            }catch (Exception ex) {
                flag = false;
                System.out.println("El número insertado no es entero" +ex);
                Sc.nextLine();   
            }        
        }while(flag==false);
        return x;
    }
    
    
    static String solicitarCadena (String mensaje){
        Scanner Sc = new Scanner (System.in);
        String x= "";
        boolean flag;
        do{      
            try{
                System.out.println("Introduce "+mensaje);
                x = Sc.nextLine(); 
                flag = true;
            }catch (Exception ex) {
                flag = false;
                System.out.println("El dato insertado no es un dato del tipo String " +ex);
                Sc.nextLine();   
            }     
        }while(flag==false); 
        return x;
    }
    
    
    static double solicitarDouble (String mensaje){
        Scanner Sc = new Scanner (System.in);
        double x = 0;
        boolean flag;
        do{      
            try{
                System.out.println("Introduce "+mensaje);
                x = Sc.nextDouble(); 
                flag = true;
            }catch (Exception ex) {
                flag = false;
                System.out.println("El valor insertado no es un dato del tipo Double" +ex);
                Sc.nextLine();   
            }   
        }while(flag==false);
        return x;
    }
    
    
    static long solicitarLong (String mensaje){
        Scanner Sc = new Scanner (System.in);
        long x = 0;
        boolean flag;
        do{      
            try{
                System.out.println("Introduce "+mensaje);
                x = Sc.nextLong(); 
                flag = true;
            }catch (Exception ex) {
                flag = false;
                System.out.println("El dato insertado no es del tipo Long" +ex);
                Sc.nextLine();   
            }     
        }while(flag==false);
        return x;
        
        
    }
    
}
