public class StringComparator {
    public static void main(String... args) {
        String a = "";
        String b = new String("");
        boolean c = a == b;
        boolean d = a.equals(b);
        System.out.println(c + " " + d);
        String e = null;
        System.out.println(a.equals(e));
        System.out.println(e.equals(a));
    }
}
