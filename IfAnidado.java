public class IfAnidado {
    public static void main(String[] args) {

        int edad = 20; // Edad de la persona
        boolean tieneLicencia = true; // Indica si tiene licencia

        if (edad >= 18) {
            if (tieneLicencia) {
                System.out.println("Puede conducir");
            } else {
                System.out.println("No tiene licencia");
            }
        } else {
            System.out.println("Es menor de edad");
        }

    }
}