package Session5.assignment05;

public class LibraryBook {

    private String title;
    private String author;
    private int copiesAvailable;
    private int copiesLent;

    public LibraryBook(String title, String author, int totalCopies) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = Math.max(totalCopies, 0);
        this.copiesLent = 0;
    }

    public void borrow() {
        if (copiesAvailable == 0) {
            System.out.println("\"" + title + "\": no copies available to borrow.");
        } else {
            copiesAvailable--;
            copiesLent++;

            System.out.println(
                    "Borrowed \"" + title + "\". Available: "
                            + copiesAvailable + ", Lent: " + copiesLent
            );
        }
    }

    public void returnCopy() {
        if (copiesLent == 0) {
            System.out.println("\"" + title + "\": no copies are currently lent.");
        } else {
            copiesLent--;
            copiesAvailable++;

            System.out.println(
                    "Returned \"" + title + "\". Available: "
                            + copiesAvailable + ", Lent: " + copiesLent
            );
        }
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public String status() {
        if (copiesAvailable == 0) {
            return "ALL OUT";
        }

        if (copiesLent == 0) {
            return "FULLY STOCKED";
        }

        return "PARTIALLY LENT";
    }

    @Override
    public String toString() {
        return String.format(
                "%s by %s [%s] (avail %d / lent %d)",
                title,
                author,
                status(),
                copiesAvailable,
                copiesLent
        );
    }

    public static void main(String[] args) {

        LibraryBook book =
                new LibraryBook("Effective Java", "Bloch", 2);

        book.borrow();
        book.borrow();
        book.borrow();

        book.returnCopy();
        book.returnCopy();
        book.returnCopy();

        System.out.println(book);
    }
}
