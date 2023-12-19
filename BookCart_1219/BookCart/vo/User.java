package BookCart.vo;

import BookCart.service.BookService;

public class User extends Person {

    private BookService userBookCart;

    public User(String name, String phoneNumber) {
        super(name, phoneNumber);
        userBookCart = new BookService();
    }

    public User(String username, String phoneNumber, String address) {
        super(username, phoneNumber, address);
        userBookCart = new BookService();
    }

    public BookService getUserBookCart() {
        return userBookCart;
    }

    public void setUserBookCart(BookService userBookCart) {
        this.userBookCart = userBookCart;
    }

}
