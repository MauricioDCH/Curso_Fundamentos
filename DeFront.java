
/**
 * Taller 7. 3. Cadena sin los dos primeros caracteres
 * 
 * @Mauricio David Correa H. 
 * Version original
 */

import java.util.*;
public class DeFront
{
    public static void main(String[] args)
    {
        Scanner entry = new Scanner(System.in);
        String word = entry.nextLine();
        //String word = "Away";
        String word1 = word.toLowerCase();
        
        for(int i = 0; i < word1.length(); i++)
        {
            switch(i)
            {
                case 0:
                    if(word1.charAt(0) == 'a')
                    {
                        System.out.print(word1.charAt(0));
                    }
                    else
                    {
                        continue;
                    }
                    break;
                    
                case 1:
                    if(word1.charAt(1) == 'b')
                    {
                        System.out.print(word1.charAt(1));
                    }
                    else
                    {
                        continue;
                    }
                    break;
                    
                    
                default:
                    System.out.print(word1.charAt(i));
            }
        }
    }
}