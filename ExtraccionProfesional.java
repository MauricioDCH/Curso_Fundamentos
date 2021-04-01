/**
 * Taller 7. 6. Estracción tipo Google/Bing
 * 
 * @Mauricio David Correa H. 
 * Version original
 */

import java.util.*;
public class ExtraccionProfesional
{
    public static void main(String[] args)
    {
        Scanner entry = new Scanner(System.in);
        String HTML = entry.nextLine();
        
        int num_name = HTML.indexOf("name");
        String name = HTML.substring(num_name + 6, HTML.indexOf("<", num_name));
        
        int num_last = HTML.indexOf("lastname",num_name);
        String lastname = HTML.substring(num_last + 10, HTML.indexOf("<", num_last));
        
        System.out.print(name);
        System.out.println(lastname);
    }
}