import java.util.Scanner;
public class reto8 {
    public static void main(String[] args) {        
        int jug1 = 0, jug2 = 0;
        int vidas=3, n;
        Scanner lc= new Scanner(System.in);
         /*math.ramdom, se toma el # aleatorio generado se * por 6 y
         se convierte a (int) se suma 1 para obtener un número entero aleatorio en el rango de 1 a 6 */
        jug1=(int)(Math.random()*6 + 1);
        jug2=(int)(Math.random()*6 + 1);

        do{
            System.out.println("Jugador 1 oprima cualquier numero para lanzar el dado");
            n=lc.nextInt();
            System.out.println("Jugador 2 oprima cualquier numero para lanzar el dado");
            n=lc.nextInt();

            System.out.println("El jugador 1 lanzó el dado y obtuvo " + jug1 + ".");
            System.out.println("El jugador 2 lanzó el dado y obtuvo " + jug2 + ".");
            lc.nextLine();

            if (jug1 > jug2){
                System.out.println("El jugador 1 es el ganador");
            } else if (jug2 > jug1){
                System.out.println("El jugador 2 es el ganador");
            } else if (jug1 == jug2){
                System.out.println("¡Empate!");
            }
                 vidas--;           
                System.out.println("Solo tienen "+vidas+" oportunidades"); 
        }while(vidas>0);
        System.out.println("Fin del juego");
        n=lc.nextInt();
        lc.close();    
    }
}

        

        


            
    
