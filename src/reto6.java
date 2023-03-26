import java.util.Scanner;
public class reto6 {
    public static void main (String []args){
    int vidas=0;
    String palabraSe="pajaro";
    Scanner sc = new Scanner(System.in);
    vidas=3;
    System.out.println("Bienvenido al juego descubre la palabra");

        do{
            System.out.println("Tiene dos patitas y no tiene pies.\nPlumas de colores y pico también.\nCuando tiene hambre dice pio \nCuando tiene frío se mete en el nido.\n ¿Que es? ");
            palabraSe=sc.nextLine();
    
        if((palabraSe.equals("pajaro"))){
            System.out.println("Correcto");
                
        }else {
            vidas--;
            System.out.println("Te quedan "+vidas+" vidas");
    
        }
        }while(vidas>0);
        System.out.println("sigue intentando");
        sc.close();
      
    }     
}
   
    
        
    

