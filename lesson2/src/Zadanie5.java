/*
 Wykonanie zadania:
 2. Wykorzystanie typu wyliczeniowego w switch
 z listy C1
 */
public class Zadanie5 {
    // implementacje typu wyliczeniowego (enuma)
    enum AnimalsType { // słowo kluczowe  i nazwa enuma
        DOG, // wartość 1 enuma
        CAT, // wartość  2 enuma
        OTHER // wartość 3 enuma
    } // nawias zamykający enuma

    public static void main(String[] args) {
        AnimalsType type = AnimalsType.CAT; // inicjalizacja zmiennej referencyjnej wartością enuma CAT
        System.out.println("Wybrane zwierze " + type); // wyświetlenie wybranego enuma
        switch (type) { // switch na wyrażeniu ze zmiennej. Można robić też switcha na int, String, char, byte, short
            case DOG: // case dla psa
                System.out.println("Hau!"); // zachowanie dla psa - wyświetlenie Hau!
                break; // zakończenie zachowania dla psa - instrukcja break;
            case CAT: // case dla kota
                System.out.println("Miau!"); // zachowanie dla kota - Miau!
                break; // zakończenie zachowania dla kota
            default: // case domyślny
                System.out.println("Cisza"); // zachowanie domyślne "Cisza"
        }
    }
}
