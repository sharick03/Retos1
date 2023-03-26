import java.util.Scanner;
public class reto2 {
public static void main(String []args){
    String nombre, eps, vacunador;
    double edad=0, peso=0, dosis;
    Scanner sc= new Scanner (System.in);
    
    System.out.print ("Digite el nombre del bebe");
    nombre=sc.next();
    System.out.print ("Digite los meses del bebe no mayor a 12");
    edad=sc.nextInt(); 
    System.out.print ("Digite el peso del bebe");
    peso=sc.nextInt();
    System.out.print ("Digite la EPS del bebe");
    eps=sc.next();
    System.out.println ("Digite el vacunador del bebe");
    vacunador=sc.next();

    dosis = (peso + 15) / (edad * 15) * 10;
    System.out.println("Al bebe "+ nombre +" se le debe aplicar "+ dosis +" de la vacuna, por el vacunador "+ vacunador +" y por a eps"+ eps);
    sc.close();
      
      }
    }

    
