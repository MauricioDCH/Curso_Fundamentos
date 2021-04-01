
/**
 * Taller 7. 1. Imprimir longitud de la palabra y posición primer letra 'a'.
 * 
 * @Mauricio David Correa H. 
 * Version original
 */

import java.util.*;

// Clase Word.
// Imrime longitud de la palabra y posición primer letra 'a'
public class Word
{
    public static void main(String[] args)
    {
        // Scanea una frase.
        Scanner entry = new Scanner(System.in);
        String word = entry.nextLine();
        
        // Pone la frase en minúsculas.
        String word1 = word.toLowerCase();
        
        // Imprime longitud de la palabra y la posición de la primer letra 'a'
        System.out.println(word1.length());
        System.out.println(word1.indexOf("a"));
        System.out.println("Hola");
    }
}
