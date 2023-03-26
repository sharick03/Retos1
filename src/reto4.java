import java.util.Random;
import java.util.Scanner;
public class reto4 {
    public static void main(String []args) {
        int edad, jugador;

        Random sc= new Random();
        Scanner lc= new Scanner(System.in);
        int maquina = sc.nextInt();

        System.out.println("Digite su edad");
        edad=lc.nextInt();

        if (edad < 18 || edad > 100 ){
            System.out.println("usted no cumple con la edad mínima o máxima para jugar.");

        }else {
            System.out.println("Bienvenido al juego piedra papel o tijera");
            System.out.println("Dijite la opcion con a que desea jugar \n1-Piedra \n2-Papel \n3-Tijera");
            jugador=lc.nextInt();
    
        if(jugador == maquina){
            System.out.println("Empate");

        } else if ((jugador == 1 && maquina == 3) || (jugador == 2 && maquina == 1) || (jugador== 3 && maquina == 2)){
        System.out.println("La máquina gana");

        } else {
           System.out.println("El jugador gana");
           lc.close();
        }
    }
}   
}    
    
        

    