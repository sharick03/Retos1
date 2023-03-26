import java.util.Random;
import java.util.Scanner;
public class reto3 {
public static void main(String [] args ) {
   int edad, jugador;
   
   Random sc = new Random();
   Scanner lc =new Scanner(System.in);
   int maquina = sc.nextInt();

    System.out.println("Digite su edad");
    edad=lc.nextInt();

    if (edad < 18 || edad > 100){
        System.out.println("Usted no cuenta con la edad maxima o minima para jugar");
    }else {
      System.out.println("Escoja la opción con la que desea jugar \n1->Cara \n2->Sello ");
      jugador=lc.nextInt();
    
    if (jugador == maquina) {
        System.out.println("Empate");
     } else if (jugador == 1 && maquina == 2  ) {
        System.out.println("La máquina gana");
     } else {
        System.out.println("El jugador gana");
        lc.close();
     }

     } }
    }

  

   


  
      
  
  