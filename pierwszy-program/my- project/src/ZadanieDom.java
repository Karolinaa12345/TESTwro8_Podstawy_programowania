public class ZadanieDom {
    public static void main(String... args) {
        System.out.println("Zadanie dom");
        String tekst  = "Tekst";
        int liczba = 5;
        float liczbaPrzecinek = 1.5f;
        short liczbaMniejsza = 4;
        long liczbaWieksza = 6;
        double liczmaZmPrzecinkowa = 1.2;

        int liczbaA = 10;
        int liczbaB = 5;
          int wynik = liczbaA - liczbaB;
          System.out.println("Wynik odejmowania to " + wynik);

          liczbaA = 8;
        liczbaB = 3;
        wynik = liczbaA / liczbaB;
        System.out.println("Wtnik dzielenia"+ wynik);

        String name = "Karolina";
        String surname = "Kosciuczyk";
        String fullName = (name+" "  + surname);
        System.out.println(fullName);

        String wynik1 = "20".replace("10","5");
        char wynik2 = wynik1.charAt(1);
        String lacznie = (wynik1 + wynik2);
        System.out.println(lacznie);

        wynik1 = "50" .replace("30", "2");
        wynik2 = "25" .charAt(1);
        String razem = ( wynik1 + wynik2);
        System.out.println(razem);








    }
    }

