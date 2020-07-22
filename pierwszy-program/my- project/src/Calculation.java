import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe zimenno-przeczinkowa");
        Scanner scanner = new Scanner (System.in);
        float a = scanner.nextFloat();
        System.out.println(a);
        short liczbaZm = (short) a;
        String liczbaString = String.valueOf(liczbaZm);
        System.out.println("Wynik: " + liczbaString);
        if (liczbaZm > 5) {
            System.out.println(liczbaZm > 5);
        }
            String message = ("Wynik %a - %b =%c")
         .replace("%a", liczbaString);

            System.out.println(message);





       /* short b = (short) a;
        int c = a - b;
        String aString = String.valueOf(a);
        String bString = String.valueOf(b);
        String cString = String.valueOf(c);
        char target; */
        //target;
        /*System.out.println("Wyniki %a - %b = %c"
                .replace(target "%a" , aString)
                .replace(target "łb", bString)
                .replace(target"łc",cString)*/
    }
}
