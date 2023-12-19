public class BookCart {
    private int index = 0;
    private String[] bookList = new String[100];

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