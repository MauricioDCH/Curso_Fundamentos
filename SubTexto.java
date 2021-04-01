
/**
 * Taller 7. 4. Substring
 * 
 * @Mauricio David Correa H. 
 * Version original
 */

import java.util.*;
public class SubTexto
{
    public static void main(String[] args)
    {
        Scanner entry = new Scanner(System.in);
        String word = entry.nextLine();
        int start = entry.nextInt();
        int finish = entry.nextInt()+1;
        
        String word1 = word.substring(start,finish);
        
        System.out.println(word1);
    }
}