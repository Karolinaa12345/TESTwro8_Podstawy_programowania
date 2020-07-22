import java.util.Scanner;

/*
    Rozwiązanie zadania:
    4. Kredyt
    z listy B2
 */
public class Zadanie3 {

    /* Stałe */
    public static final int ILOSC_MIESIECY_W_ROKU = 12;
    public static final int ILOSC_RAT = 5;
    public static final float OPROCENTOWANIE = 0.05f; // 5% czyli 5/100. f na końcu oznacza, że wartość w oprocentowaniu to float
    public static final int UBEZPIECZENIE_NIEPARZYSTE = 5; // osobno dałem zmienną ubezpieczenia w miesiące nieparzyste
    public static final int DODATEK = 10; // dodatek do wartości ubezpieczenia w miesiące nieparzyste
    public static final float PROMOCJA = 0.80f; // procentowa wartość promocji na ubezpieczenie w ostatnim miesiącu kredytu

    /**
     * metoda wylicza wartość raty nieparzystej dla poniższych parametrów:
     * @param wartoscKredytu - wartość całego kredytu
     * @param numerRaty - informacja, którą ratę wyliczamy. Typ danej to int
     * @return
     */
    public static float wartoscRatyNiepazystej(float wartoscKredytu, int numerRaty){ // metoda statyczna - dlatego można ją wywołać bez inicjalizacji obiektu, w szczególności w metodzie main
        float kapitalRaty = kapitalPojedynczejRaty(wartoscKredytu); // wywołanie innej metody statycznej aby policzyć kapitał dla pojedynczej raty i podstawić pod zmienną
        float pozostaloDoSplaty = wartoscKredytu - kapitalRaty * (numerRaty - 1);  // pozostałą część kapitału obliczamy przez wrotość kredytu - ilość kapitału spłaconego w poprzednich ratach
        float odsetki = OPROCENTOWANIE * pozostaloDoSplaty / ILOSC_MIESIECY_W_ROKU; // odsetki to oprocentowanie pomnożone przez pozostałą część kapitału. Oprocentowanie jest w skali roku, czyli dzielimy przez ilość miesięcy w roku (kożystamy ze stałej w klasie)
        return kapitalRaty + odsetki + UBEZPIECZENIE_NIEPARZYSTE; // wartość raty nieparzystej to kapitał przypadający pojedynczej racie + odsetki od pozostałego kapitału + ubezpieczenie raty nieparzystej
    }

    public static float wartoscRatyOstatniej(float wartoscKredytu, int numerRaty){// metoda statyczna - dlatego można ją wywołać bez inicjalizacji obiektu
        float kapitalRaty = kapitalPojedynczejRaty(wartoscKredytu);// wywołanie innej metody statycznej aby policzyć kapitał dla pojedynczej raty i podstawić pod zmienną
        float pozostaloDoSplaty = wartoscKredytu - kapitalRaty * (numerRaty - 1); // pozostałą część kapitału obliczamy przez wrotość kredytu - ilość kapitału spłaconego w poprzednich ratach
        float odsetki = OPROCENTOWANIE * pozostaloDoSplaty / ILOSC_MIESIECY_W_ROKU;// odsetki to oprocentowanie pomnożone przez pozostałą część kapitału. Oprocentowanie jest w skali roku, czyli dzielimy przez ilość miesięcy w roku (kożystamy ze stałej w klasie)
        return kapitalRaty + odsetki + UBEZPIECZENIE_NIEPARZYSTE * PROMOCJA; // ostatnia rata jest nieparzysta i ma promocję 20% na ubezpieczeniu zatem
        // wartość ostatniej raty to kapitał przypadający pojedynczej racie + odsetki od pozostałego kapitału + 80% ubezpieczenia raty nieparzystej
    }

    public static float wartoscParzystejRaty(float wartoscKredytu, int numerRaty){ // metoda statyczna - dlatego można ją wywołać bez inicjalizacji obiektu
        float kapitalRaty = kapitalPojedynczejRaty(wartoscKredytu);// wywołanie innej metody statycznej aby policzyć kapitał dla pojedynczej raty i podstawić pod zmienną
        float pozostaloDoSplaty = wartoscKredytu - kapitalRaty * (numerRaty - 1); // pozostałą część kapitału obliczamy przez wrotość kredytu - ilość kapitału spłaconego w poprzednich ratach
        float odsetki = OPROCENTOWANIE * pozostaloDoSplaty / ILOSC_MIESIECY_W_ROKU;// odsetki to oprocentowanie pomnożone przez pozostałą część kapitału. Oprocentowanie jest w skali roku, czyli dzielimy przez ilość miesięcy w roku (kożystamy ze stałej w klasie)
        return kapitalRaty + odsetki + UBEZPIECZENIE_NIEPARZYSTE + DODATEK; // wartość raty parzystej to kapitał przypadający pojedynczej racie + odsetki od pozostałego kapitału + ubezpieczenia raty nieparzystej + dodatek do ubezpieczenia równy 10 zł
    }


    private static float kapitalPojedynczejRaty(float wartoscKredytu) {
        return wartoscKredytu / ILOSC_RAT; // kapitał pojedynczej raty to wartość kredytu podzielona przez ilość rat. Zakładamy raty z równym kapitałem ( w kredytach mówi się o ratach "malejących")
    }

    /*
        W tej klasie jedynie metoda main jest wykonywalna
     */
    public static void main(String[] args) {
        System.out.println("Wprowadź kapitał: "); // prosimy o wartość kredytu
        Scanner scanner = new Scanner(System.in); // inicjalizujemy scanner
        float wartoscKredytu = scanner.nextFloat(); // pobieramy float
        float rata1 = wartoscRatyNiepazystej(wartoscKredytu, 1); // liczymy wartość raty pierwszej wywołując metodę statyczną wartoscRatyNiepazystej
        float rata2 = wartoscParzystejRaty(wartoscKredytu, 2); // liczymy wartość raty drugiej wywołując metodę statyczną wartoscParzystejRaty
        float rata3 = wartoscRatyNiepazystej(wartoscKredytu, 3); // liczymy wartość raty trzeciej wywołując metodę statyczną wartoscRatyNiepazystej
        float rata4 = wartoscParzystejRaty(wartoscKredytu, 4); // liczymy wartość raty czwartej wywołując metodę statyczną wartoscParzystejRaty
        float rata5 = wartoscRatyOstatniej(wartoscKredytu, 5); // liczymy wartość raty piątej (ostatniej) wywołując metodę statyczną wartoscRatyOstatniej
        // wyświetlamy wszystkie raty
        System.out.println("Rata1: " + rata1);
        System.out.println("Rata2: " + rata2);
        System.out.println("Rata3: " + rata3);
        System.out.println("Rata4: " + rata4);
        System.out.println("Rata5: " + rata5);
    }

    // zachęcam do zastanowienia się jak:
    // 1. zmienić program tak aby ostatnia rata mogła być parzysta
    // 2. można było by decydować ile rat będzie miał kredyt
    // można zauważyć, że część kodu w metodach się powtarza. Zaproponujcie co jeszcze możemy wydzielić do osobnych metod w celu uniknięcia redundancji kodu
}
