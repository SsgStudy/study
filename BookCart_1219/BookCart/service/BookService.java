package BookCart.service;

import BookCart.vo.Book;
import BookCart.vo.User;

public class BookService {
    int index = 0;
    String[] bookList = new String[100];

    public void addBook(String bookId) {
        System.out.println(bookId);
        bookList[index] = bookId;
        index++;
    }

    public void showBooKList() {
        Book[] allBookList = bookList();
        for (String i : bookList) {
            for (Book j : allBookList) {
                if (j.getBookId().equals(i)) {
                    System.out.println(j);
                }
            }
        }
    }

    public Book[] bookList() {
        Book[] allBookList = new Book[3];
        allBookList[0] = new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍", "IT전문서", "2018/10/08");
        allBookList[1] = new Book("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서", "2022/01/22");
        allBookList[2] = new Book("ISBN1236", "스크래치", 22000, "고광일", "컴퓨팅 사고력을 키우는 블록 코딩", "컴퓨터 입문", "2019/06/10");

        return allBookList;
    }






}