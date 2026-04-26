import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

public class Main {

    // Función que valida si los paréntesis están balanceados
    public static boolean esValido(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        // Mapa de apertura -> cierre
        Map<Character, Character> mapa = new HashMap<>();
        mapa.put('(', ')');
        mapa.put('{', '}');
        mapa.put('[', ']');

        Stack<Character> pila = new Stack<>();

        // Recorremos cada carácter
        for (char c : s.toCharArray()) {
            if (mapa.containsKey(c)) {
                // Si es apertura, agregamos a la pila
                pila.push(c);
            } else if (mapa.containsValue(c)) {
                // Si es cierre, verificamos la pila
                if (pila.isEmpty()) {
                    return false; // cierre sin apertura
                }
                char abierto = pila.pop();
                if (!mapa.get(abierto).equals(c)) {
                    return false; // cierre no coincide
                }
            }
        }

        // Si la pila queda vacía, todos los paréntesis están balanceados
        return pila.isEmpty();
    }

    // Método principal
    public static void main(String[] args) {
        String prueba1 = "{[()]}";
        String prueba2 = "{[(])}";
        String prueba3 = "((()))";
        String prueba4 = "{[()[]{}]}";

        System.out.println(prueba1 + " -> " + esValido(prueba1));
        System.out.println(prueba2 + " -> " + esValido(prueba2));
        System.out.println(prueba3 + " -> " + esValido(prueba3));
        System.out.println(prueba4 + " -> " + esValido(prueba4));
    }
}