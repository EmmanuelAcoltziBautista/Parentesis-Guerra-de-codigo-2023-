/*
Guerra de codigos
Creado por: Emmanuel Acoltzi Bautista
Fecha de creacion: 05/10/2023
Correo:basedeemma@gmail.com
 */
import java.util.*;
public class Corchetes {
    public static void main(String args[]){
    Scanner ENTRADA=new Scanner(System.in);
  
//recibo la cadena de caracteres

      System.out.println("Ingresa una cadena: ");
        String cadena=ENTRADA.nextLine();

//cuantos caracteres tiene la cadena

       int contador=cadena.length();

//creo las variables de abierto y cerrado

       String llaveAbierta="(";
       String llavecerrada=")";

//establesco contadores

       int contadorAbierto = 0;
       int contadorCerrado=0;

//un cliclo para que revise caracter por caracter 

      for(int i=0;i<=contador-1;i++){
        String llave=cadena.substring(i, i+1);//desde hasta
                 //System.out.println(llave);

        if(llave.equals(llaveAbierta)){//si ve un parentesis abierto suma lo que esta en el contador y un mas 1
        contadorAbierto=contadorAbierto+1;
  
        }
        if(llave.equals(llavecerrada)){//si ve un parentesis cerrado lo suma con el contador
           contadorCerrado=contadorCerrado+1;
        }
    }


/*

()
Abre y cierra
entonces ambos deben de ser 1
como coinciden imprimo un 1

pero si  es: 
(
un cero ya que no cerro

*/


       if(contadorCerrado==contadorAbierto){//si es igual
           System.out.println("1");
       }else{//si no
           System.out.println("0");
       }
}
}