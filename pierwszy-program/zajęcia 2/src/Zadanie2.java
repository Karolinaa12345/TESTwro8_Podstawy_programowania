import java.util.Scanner;

public class Zadanie2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj float");
        float a = scanner.nextFloat();
        System.out.println("Podaj int");
        int b = scanner.nextInt ();
        System.out.println("Podaj znak");
        String string = scanner.next ();
        char c = string.charAt(0);
      boolean result = a != b;
      String message = "a != b to" + result;
      System.out.println(message);
      System.out.println("c <= b to"+ (c <= b );
      
        
       
        
    }
}
