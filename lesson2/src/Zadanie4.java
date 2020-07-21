import java.util.Scanner;

/*
    Realizacja przykładowa zadania:
    1. Program witający uczestnika imprezy powyżej 18 lat
    z listy C1

    Zadanie te robiliście samodzielnie. Warto porównać sobie czy każdy tak samo je zinterpretował.
 */
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // tradycyjnie już inicjalizacja skanera w celu pobrania wartości
        System.out.println("Witam! Proszę podać wiek"); // pytanie o wiek
        int wiek = scanner.nextInt(); // pobranie wieku jako wartości int
        if (wiek >= 18) { // konstrukcja if z warunkiem wymagającym wiek większy lub równy 18 lat
            System.out.println("Zapraszam na imprezę!"); // w przypadku spełnienia warunku zaproszenie na imprezę
        } else { //  przeciwnym wypadku
            System.out.println("Proszę wrócić do domu"); // wyświetlenie prośby o udanie się do domu
        }
    }
}
