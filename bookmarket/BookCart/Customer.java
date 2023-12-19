public class Customer {
    private String name;
    private String phoneNumber;
    private BookCart userBookCart;

    public Customer() {
        userBookCart = new BookCart();
    }
    //userBookCart는 BookCart라는 객체 생성

    public BookCart getUserBookCart() {
        return userBookCart;
    }

    //정보 확인 메서드
    public void checkUserInfo() {
        System.out.printf("이름 : %s\n", name);
        System.out.printf("전화번호 : %s\n", phoneNumber);
    }

    //getter , setter 선언
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
