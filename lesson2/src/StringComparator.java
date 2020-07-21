/*
    Rozwiązanie zadania:
    2. Porównanie obiektów String
    z listy B2
 */
public class StringComparator {
    public static void main(String... args) {
        String a = ""; // inicjalizacja obiektem z puli. Jeśli zainicjalizujemy dwie zmienne używając bezpośrednio "" oznacza to referencję do tego samego obiektu
        String b = new String(""); // stworzenie nowego obiektu klasy String przy pomocy "" jako parametru. Oznacza to nowy String, który jest innym obiektem, ale wartość jest równa ""
        boolean c = a == b; // w naszym przypadku nie jest to ten sam obiekt. Wartość wyrażenia a == b wynosi false i taka wartość będzie podstawiona pod c
        boolean d = a.equals(b); // oba obiekty przechowują taki sam ciąg znaków zatem porównanie przy pomocy equals zwraca true
        System.out.println(c + " " + d); // w tym miejscu oczekujemy zatem "false true"
        // zachęcam do zmiany inicjalizacji referencji b na: String b = ""; i sprawdzenie jaki będzie wynik porównania c
        String e = null; // inicjalizacja nullem - oznacza to, że e nie przechowuje żadnego obiektu
        System.out.println(a.equals(e)); // porównianie istniejącego obiektu w zmiennej a z nullem zwróci nam false
        System.out.println(e.equals(a)); // nie można wywołać metody na null'u zatem otrzymamy null pointer exception
        // na zajęciach mówiliśmy sobie, że aby uniknąć null pointer należy zainicializować zmienną e obiektem klasy String
    }
}
