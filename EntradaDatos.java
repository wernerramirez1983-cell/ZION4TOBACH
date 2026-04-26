import java.util.Scanner; // Importa la clase Scanner

public class EntradaDatos {
   public static void main (String[] args) {
   
   // Se crea el objeto Scanner para leer datos
   Scanner sc = new Scanner (System.in);
   
   //solicita el nombre al usuario
   System.out.println("Ingrese su nombre: ");
   String nombre = sc.nextLine(); // Lee texto
   
   //Solicita la edad
   System.out.println("Ingrese su edad: ");
   int edad = sc.nextInt(); // Lee numero entero
   
   // Muestra los datos del ingresados
    System.out.println("Hola" + nombre + ", tienes " + edad + "años.");
    
    // Cierra el Scanner
    sc.close();
    }
   }