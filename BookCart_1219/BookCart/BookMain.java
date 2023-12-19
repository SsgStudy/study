package BookCart;

import BookCart.service.BookService;
import BookCart.service.UserServiceImpl;
import BookCart.vo.Book;
import BookCart.vo.User;

import java.util.Scanner;

public class BookMain {
    static Scanner sc = new Scanner(System.in);
    static User mUser;

    static UserServiceImpl userService;
    static BookService bookService;

    public static void main(String[] args) {
        //고객 정보 입력
        System.out.println("당신의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("연락처를 입력하세요 : ");
        String phoneNumber = sc.nextLine();

        //customer1 고객 객체 생성 & 기입
        User user1 = new User(name, phoneNumber);
        System.out.println(user1.getName() + " " + user1.getPhoneNumber());

        printWelcome();

        while (true) {
            //메뉴 선택
            printMenu();
            //선택 번호 입력
            int chNumber = sc.nextInt();
            //번호별 메뉴 실행
            switch (chNumber) {
                //고객 정보 확인하기
                case 1 -> {
                    userService.menuGuestInfo(user1);
                }
                case 2 -> {
                    //장바구니 상품 목록 보기
                    user1.getUserBookCart().showBooKList();
                }
                case 3 -> {
                    //바구니에 항목 추가하기
                    for (Book i : bookService.bookList()) { //모든 책 정보 출력
                        System.out.println(i);
                    }
                    System.out.println("장바구니에 추가할 도서의 ID를 입력하세요 :");
                    String inputBookId = sc.next();
                    System.out.println("장바구니에 추가하시겠습니까? Y | N");
                    String confirm = sc.next();
                    if (confirm.equals("Y") || confirm.equals("y")) {
                        user1.getUserBookCart().addBook(inputBookId);
//                        user1.userBookCart.addBook(inputBookId);
                        System.out.printf("%s 도서가 장바구니에 추가되었습니다.\n", inputBookId);
                    } else {
                        System.out.println("장바구니 추가를 취소하였습니다.");
                    }
                }
                case 4 -> {
                    System.out.println("연락처를 입력하세요 : ");

                }
                case 5 -> {
                    //종료
                    System.out.println("종료되었습니다.");
                    return;
                }

            }
        }
    }

    public static void printWelcome() {
        System.out.println("***********************************");
        System.out.println("        Welcome to Shopping Mall");
        System.out.println("        Welcome to Book Market!");
    }

    public static void printMenu() {
        System.out.println("***********************************");
        System.out.println("1. 고객 정보 확인하기");
        System.out.println("2. 장바구니 상품 목록 보기");
        System.out.println("3. 바구니에 항목 추가하기");
        System.out.println("4. 종료");
        System.out.println("***********************************");
    }
}