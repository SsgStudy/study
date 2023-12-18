package BookCart;

public class BookCart {
    int index = 0;
    String[] bookList = new String[100];

    public void addBook(String bookId) {
        bookList[index] = bookId;
        index++;
    }

    public void showBooKList(Book[] allBookList) {
        for (String i : bookList) {
            for (Book j : allBookList) {
                if (j.getBookId().equals(i)) {
                    System.out.println(j);
                }
            }
        }
    }
}