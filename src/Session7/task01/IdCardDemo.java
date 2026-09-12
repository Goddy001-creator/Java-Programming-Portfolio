package Session7.task01;

class IdCard {

    private static int nextNumber = 1000;
    private final int cardNumber;
    private final String holder;

    IdCard(String holder) {
        this.holder = holder;
        this.cardNumber = nextNumber;
        nextNumber++;
    }

    @Override
    public String toString() {
        return "Card #" + cardNumber + " - " + holder;
    }

    static int issued() {
        return nextNumber - 1000;
    }
}

public class IdCardDemo {

    public static void main(String[] args) {

        IdCard a = new IdCard("Ada");
        IdCard b = new IdCard("Bob");
        IdCard c = new IdCard("Cal");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("Total issued: " + IdCard.issued());
    }
}
