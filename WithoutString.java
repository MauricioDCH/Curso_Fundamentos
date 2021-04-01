
/**
 * Taller 7. 2. Base y eliminar.
 * 
 * @Mauricio David Correa H. 
 * Version original
 */

import java.util.*;
public class WithoutString
{
    public static void main(String[] args)
    {
        // Scanea una frase.
        Scanner entry = new Scanner(System.in);
        String word = entry.nextLine();
        String word1 = entry.nextLine();
        
        for(int i = 0;i < word.length(); i++)
        {
                for(int j = 0;j < word1.length(); j++)
                {
                    if(word.charAt(i) == word1.charAt(j))
                    {
                        break;
                    }
                    else if(word.charAt(i) != word1.charAt(j))
                    {
                        System.out.print(word.charAt(i));
                    }
                    
                }
        
        }
        System.out.println("\n");
    }
}
