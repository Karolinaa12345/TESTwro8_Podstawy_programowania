import java.util.Scanner;


public class Karola {
    public static void main(String... args) {
        System.out.println("Witaj w programi");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String string = scanner.next ();
        System.out.println("Podaj pozycję znaku");
        int index = scanner.nextInt();



        System.out.println("Ciąg" + string + "zawiera"
                + string.charAt(index) + "na pozycji"
                + index);
    }
    
    
}




