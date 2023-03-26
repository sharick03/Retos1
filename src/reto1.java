import java.util.Scanner;
public class reto1{
    //METODO DE EJECUCIÓN//
    public static void main (String []args){
    double fahrenheit, celsius, kelvin ;
    Scanner sc= new Scanner (System.in);

    System.out.print("Digite la temperatura de su horno en grados Centigrados: ");
    celsius=sc.nextDouble(); //CAPTURAR DATO
    
        fahrenheit = (celsius * 9/5) + 32+100;
        kelvin = celsius + 273.15+100; 
        
        System.out.println(celsius + " °C equivale a " + fahrenheit+ " °F y" + kelvin+ " °K ");
        System.out.println("La temperatura final que necesita la abuela para preparar su torta es: "  + fahrenheit+ " °F  o "+ kelvin+ " °K ");
        sc.close();

       }
    }


    
    

