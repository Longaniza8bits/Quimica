package tipo._de_enlace;

import java.util.Scanner;
import java.util.*;

public class Caracteristicas {  
public int ElectroNegatividad[]=new int[255];
   
Scanner Lectura=new Scanner(System.in);      

static void elementos() {
   int i=0,Svalencia;
   double operacion;
   
  String Elemento[]=new String[3]; 
  double electronegatividad[]=new double[2];
  int valencia[]=new int[2];
  Scanner entrada= new Scanner(System.in);
    System.out.println("Ingrese el nombre de su elemento");
    System.out.println("Ejemplo:H");
    Elemento[0]=entrada.next();
      System.out.println("Su Electronegatividad");
    System.out.println("Ejemplo:2.20");
    electronegatividad[0]=entrada.nextDouble();
     System.out.println("Ingrese su Valencia");
    System.out.println("Ejemplo:1");
    valencia[0]=entrada.nextInt();
    
    System.out.println("");
    System.out.println("Ahora Ingrese el Siguiente Compuesto");
     System.out.println("");
     
     System.out.println("Ingrese el nombre de su elemento");
    System.out.println("Ejemplo:H");
    Elemento[1]=entrada.next();
    System.out.println("Su Electronegatividad");
    System.out.println("Ejemplo:2.20");
    electronegatividad[1]=entrada.nextDouble();
    System.out.println("Ingrese su Valencia");
    System.out.println("Ejemplo:1");
    valencia[1]=entrada.nextInt();
    
    System.out.println("Su Compuesto es "+Elemento[0]+""+Elemento[1]);
    
    if(electronegatividad[1]>electronegatividad[0]){
    operacion=electronegatividad[1]-electronegatividad[0];
            
            }
    else{
    
    operacion=electronegatividad[0]-electronegatividad[1];
       
    }
    
    if(operacion<1.7&&operacion>0.4){
    System.out.println("Su Enlace es Covalente Polar");
    }
    else if(operacion>=0&&operacion<0.4){
    System.out.println("Su Enlace es Covalente No Polar");
    }
    else if(operacion>1.7){
    System.out.println("Su Enlace es de tipo Ionico");
    System.out.println("En Otro Caso te puedes dar cuenta por que uno de los"
            + " elementos es Metal y No Metal");
    }
   Svalencia=valencia[0]+valencia[1];
   if(Svalencia>14&&(operacion<1.7&&operacion>0.4)||Svalencia>14&&(operacion<0.4&&operacion>=0)){}
   System.out.println("Covalente Doble");
}
}
