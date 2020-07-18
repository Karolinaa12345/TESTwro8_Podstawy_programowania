public class zad7<args> {
    public static void main(String[] args) {
        for (String a : args) {
            System.out.println(a);
        }
        for (int a = 0; a < args.length; a = ++) {
            System.out.println(args[a]);
        }
        int a = 0;
        do {
            System.out.println(args[a]);
            a++;
        }
        while (a < args.length);

        int i = 0;
        while (i < args.length); {
            System.out.println(args[i]);
            i++;

        }
    }
}

