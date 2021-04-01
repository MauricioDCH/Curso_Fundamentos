
/**
 * Taller 7. 5. Substring más condicionales
 * 
 * @Mauricio David Correa H. 
 * Version original
 */

import java.util.*;
public class SubTextoMejorado
{
    public static void main(String[] args)
    {
        Scanner entry = new Scanner(System.in);
        String word = entry.nextLine();
        int start = entry.nextInt();
        int end = (entry.nextInt());
                
        if((end) >= word.length())
        {
            System.out.println("Error");
        }
        else if(start > end)
        {
            System.out.println("Error2");
        }
        else
        {
            System.out.println(word.substring(start,(end+1)));
        }
    }
}