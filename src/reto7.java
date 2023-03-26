import java.util.Scanner;
public class reto7 {
    public static void main(String []args){
        String nombre, apellido, email, td;
        int n=1,documento, celular, i=1;
        int clave;

        Scanner sc = new Scanner(System.in);
        System.out.println("Registrar Usuarios");
        while(n==1){
        do {
            System.out.println("Ingrese su nombre");
            nombre=sc.next();
            System.out.println("Ingrese su apellido");
            apellido=sc.next();
            System.out.println("Ingrese su correo");
            email=sc.next();
            System.out.println("Ingrese su tipo de documento");
            td=sc.next();
            System.out.println("Ingrese su numero de documento");
            documento=sc.nextInt();
            System.out.println("Ingrese su numero de celular");
            celular=sc.nextInt();
            System.out.println("Ingrese su clave");
            clave=sc.nextInt();
            System.out.println("Los datos se han registrado corrrectamente");
            System.out.println("Los datos registrados son" );
            System.out.println(i);
            System.out.println("Desea seguir registrando usuarios \n1-Si \n2-No");
            n=sc.nextInt();
            i++;
          
        } while (n==1);
        sc.close();
      }
    }
  }