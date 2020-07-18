import javax.print.attribute.standard.MediaSize;

public class Zadanie5 {
    public static void main(String[] args) {
    AnimalsType type = AnimalsType.DOG;
    switch ( type ) {
        case DOG:
            System.out.println("Hauł");
            break;
        case CAT:
            System.out.println("Miau");
            break;
        default:
            System.out.println("Cisza");
    }



    }
    enum AnimalsType {
        DOG,
        CAT,
        OTHER,

    }
}
