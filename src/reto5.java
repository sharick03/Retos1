import java.util.Scanner;
public class reto5{
    public static void main (String []args){
        int jugador, n=1; 
        int vidas =0, maquina;
        Scanner sc= new Scanner(System.in);

        while (n==1){ 
         vidas=3; 
        System.out.println("Bienvenido al juego");
        System.out.println("Tienes " + vidas + " vidas"); 
        /*math.ramdom, se toma el # aleatorio generado se * por 3 y
         se convierte a (int) se suma 1 para obtener un número entero aleatorio en el rango de 1 a 3 */
        maquina = (int) (Math.random() * 3) + 1; 
          
            do{
                System.out.println("Dijite la opcion con la que desea jugar \n1-Piedra \n2-Papel \n3-Tijera");
                jugador=sc.nextInt();
    
                if(jugador == maquina){
                    System.out.println("Empate");
        
                } else if ((jugador == 1 && maquina == 3) || (jugador == 2 && maquina == 1) || (jugador== 3 && maquina == 2)){
                System.out.println("Ganaste");
        
                } else {
                    vidas--;           
                    System.out.println("Perdiste, Te quedan " + vidas + " vidas"); 
                }
            }while(vidas>0);
            System.out.println("Desea volver a jugar \n1-Si \n2-No");
            n=sc.nextInt();
        }
        sc.close();    
}
}
    