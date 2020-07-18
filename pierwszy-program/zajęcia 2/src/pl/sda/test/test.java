package pl.sda.test;

import pl.sda.czlowiek.ZadanieCzlowiek;

public class test {
    public static void testczlowiek (); {
        ZadanieCzlowiek person = new ZadanieCzlowiek ( "id"1);
        person.setName("Karolina");
        person.setSurname("Kosciuczyk");
        person.getPersonal(12345);
        System.out.println(person);
    }


    public static void main(String[] args) {
        testczlowiek();

    }

    public test()
    }
}
