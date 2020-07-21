/*
    Wykonanie zadania:
    1. Nasza pierwsza iteracja
    z listy C2

    częściowo robiliście samodzielnie ale warto sobie utrwalić.
    Dodam dla Was też rozwiązanie zadania 3 Ciąg fibonacciego jako przykład później.
    Resztę zadań zróbcie dla utrwalenia w ramach zadania domowego.
    W razie pytań śmiało piszcie na slacku.
 */
public class Zadanie6 {
    public static void main(String[] args) {
        for (String a : args) { // przykłąd wykonania for each na tablicy parametrów wejściowych
            System.out.println(a); // wyświetlenie każdego argumentu osobno
        }

        // args.length to wielkość tablicy
        for (int a = 0; a < args.length; a++) { // przykład standardowej pętli for realizującej te samo zadanie co for each
            // int a = 0; - to inicjalizacja zmiennej iteracyjnej
            // a < args.lengh to warunek kroku iteracji - jeśli spełniony realizowana jest kolejna iteracja
            // a++ - krok iteracyjny. tu inkrementacja ale może być to inna operacja zwiększająca zmienną iteracyjną
            System.out.println(args[a]); // pobranie arguentu na indeksie równym a - z każdym krokiem iteracji a przyjmuje kolejne wartości 0, 1, 2, ..
            // wartości oczywiście wyświetlamy
        }

        /*
            Dalej samodzielnie próbowaliście wykonać takie samo zachowanie używając pętli do-while
            razem potem wypracowaliśmy poniższe rozwiązanie
         */
        int a = 0; // inicjalizacja zmiennej indeksu
        do {
            System.out.println(args[a]); // pobranie wartości na indeksie a i wyświetlenie
            a++; // inkrementacja zmiennej a
        }
        while (a < args.length); // jeśli warunek spełniony powtórzone będzie ciało w bloku kodu "do"


        // wykonaliśmy sobie wydrukowanie parametrów w odwrotnej kolejności używając pętli while
        int i = args.length - 1; // zaczynamy od indeksu ostatniego. wielkość tablicy - 1 (pamiętamy indeksowanie od 0)
        while (i >= 0) { // wykonujemy dopóki indeks jest większy od zera (jak myślicie dlaczego)
            System.out.println(args[i]); // wyświetlenie wartość na indeksie i z tablicy argumetów
            i--; // dekrementacja indeksu
        }

    }
}
