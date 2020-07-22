import java.util.Scanner;

/*
    realizacja zadania:
    3. Porównanie typów numerycznych
    z listy B2
 */
public class Zadanie2 {
    public static void main(String[] args) {
        // potrzebowaliśmy zainicializować obiekt skanera aby pobrać wartości
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj float "); // wiadomość, że oczekujemy float
        float a = scanner.nextFloat(); // pobranie float i przypisanie do zmiennej
        System.out.println("Podaj int "); // informacja, że następnie oczekujemy int
        int b = scanner.nextInt(); // pobranie inta i przypisanie do zmiennej
        System.out.println("Podaj znak"); // prośba o podanie znaku
        String string = scanner.next(); // pobranie Stringa i przypisanie zmiennej referencyjnej
        char c = string.charAt(0); // pobranie pierwszego znaku ze stringa i przypisanie do zmiennej char
        boolean result = a != b; // porównanie inta z floatem, warość zależy od tego co podasz.
        String message = "a != b to " + result; // konkatenacja wiadomości o wyniku
        System.out.println(message); // wyświetlenie wiadomości message
        System.out.println("c <= b to " + (c <= b)); // porównanie inta z charem. Wartościowanie będzie zależało od podanych wartości
        // zachęcam do przećwiczenia zadania z różnymi wartościowaniami a, b, c
        // zinterpretuj wyniki. Dla tych, którzy nie byli obecni: pamiętamy, że znak umieszczony w char jest powiązany
        // wartością numeryczną. Są różne rodzaje kodowania, ale najczęściej stosuje się  https://pl.wikipedia.org/wiki/ASCII
        // zachęcam do poczytania i interpretacji wyniku przy użyciu wartości z artukułu
        // W interpretacji mogą pomóc poniższe linie
        System.out.println("Pobrany char: " + c);
        System.out.println("Char rzutowany do int: " + (int)c);
    }
}
