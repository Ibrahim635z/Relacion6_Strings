package Relacion6_Strings;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
            String cadena="",subcadena="",cadena_prueba="";
            boolean es=false;


           System.out.println("Introduzca una cadena");
            cadena=entrada.nextLine();
            System.out.println("Introduzca una subcadena");
            subcadena=entrada.nextLine();
           
            boolean contenedor=false;

            contenedor=cadena.contains(subcadena);
            if (contenedor==true){
                System.out.println("SI ES");

            }else{
                System.out.println("no es");
            }
            /*for (int i =0; i <= cadena.length(); i++) {
                cadena_prueba=cadena.substring(i,subcadena.length()+i);
                System.out.println(cadena_prueba);
                if(cadena_prueba.equals(subcadena)){
                   es=true;
                   break;
                }  
                
            }
            if(es==true){
            System.out.println("es");
            }else{
                System.out.println("no es");
            }*/



         entrada.close();

    }
    
}
