// pakiet, w której umieszczona jest klasa test. Pakiety tworzymy: prawy przycisk myszy na src -> new -> package -> nazwa pakietu ciągi liter (mogą być też cyfry) rozdzielone .
package pl.sda.test;

// import naszej klasy Human, która jest w innym pakiecie niż klasa Test
import pl.sda.humans.Human;

public class Test {
    /*
    Realizacja zadania 2 Test Human  z listy D1
     */
    public static void testHuman() { // prosta metoda statyczna do sprawdzenia jak zostanie wyświetlony Human
        Human person = new Human(1); // utworzenie obiektu klasy Human i przypisanie do zmiennej person
        person.setName("Tomasz"); // ustawienie imienia używając settera
        person.setSurname("Lis"); // ustawienie nazwiska używając settera
        person.setPersonalIdentityNumber("12357890"); // ustawienie peselu przy użyciu peselu
        System.out.println(person); // wyświetlenie obiektu klasy person. Ta wersja System.out.println sama wewnątrz wywołuje metodę person.toString();
    }

    //metoda main służy nam do wywołania metod "testowych", które wyświetlą nam tworzone obiekty
    public static void main(String[] args) {
        testHuman();// wywołanie metody do zadania 2
    }
}
