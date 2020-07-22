public class Karolina {
public static void main(String...args) {
    assert args.length == 2:
            "Wymagana ilość argumentów 2";
    String arg1 = args[0];
    String arg2 = args[1];
String join = arg1.concat(" ");
    System.out.println(join.concat (arg2) );
}
}


