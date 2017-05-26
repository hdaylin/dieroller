import java.util.Random; 
import java.util.Scanner; 

public class DieRoller{
    public static void main( String[] args )
    {
        int dienumber;
        Random rnd = new Random(); 
        
        dienumber = 1 + rnd.nextInt(7);
        
        System.out.println("Your die roll was : " + dienumber);
    }
 }