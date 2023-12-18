package BookCart;

import java.util.Scanner;

public class BookMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        Book[] allBookList = new Book[3];


        allBookList[0] = new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍", "IT전문서", "2018/10/08");
        allBookList[1] = new Book("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서", "2022/01/22");
        allBookList[2] = new Book("ISBN1236", "스크래치", 22000, "고광일", "컴퓨팅 사고력을 키우는 블록 코딩", "컴퓨터 입문", "2019/06/10");
        //고객 정보 입력
        System.out.println("당신의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("연락처를 입력하세요 : ");
        String phoneNumber = sc.nextLine();
        //customer1 고객 객체 생성
        Customer customer1 = new Customer();
        //고객 정보 기입
        customer1.setName(name);
        customer1.setPhoneNumber(phoneNumber);
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
                    customer1.checkUserInfo();
                }
                case 2 -> {
                    //장바구니 상품 목록 보기
                    customer1.userBookCart.showBooKList(allBookList);
                }
                case 3 -> {
                    //바구니에 항목 추가하기
                    for (Book i : allBookList) { //모든 책 정보 출력
                        System.out.println(i);
                    }
                    System.out.println("장바구니에 추가할 도서의 ID를 입력하세요 :");
                    String inputBookId = sc.next();
                    System.out.println("장바구니에 추가하시겠습니까? Y | N");
                    String confirm = sc.next();
                    if (confirm.equals("Y") || confirm.equals("y")) {
                        customer1.userBookCart.addBook(inputBookId);
                        System.out.printf("%s 도서가 장바구니에 추가되었습니다.\n", inputBookId);
                    } else {
                        System.out.println("장바구니 추가를 취소하였습니다.");
                    }
                }
                case 4 -> {
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