package com.example.string2;

import java.util.Scanner;

public class String9125_ex {

    static Scanner scanner = new Scanner(System.in); // 입력용 Scanner 객체 생성

    public static void main(String[] args) {
        String[] str = {"champion", "tel", "pencil", "jungol", "olympiad", "class", "information", "lesson", "book", "lion"};

        processInput(str, "문자를 입력하세요. "); // 첫 번째 입력 처리
        processInput(str, "문자열을 입력하세요. "); // 두 번째 입력 처리
    }

    private static void processInput(String[] str, String message) {
        System.out.print(message); // 입력 메시지 출력
        String targetStr = scanner.nextLine(); // 사용자로부터 문자열 입력 받음

        int count = 0; // 일치하는 문자열의 개수를 세는 카운터
        for (String s : str) { // 배열 str을 돌면서 변수 s 사용
            if (s.contains(targetStr)) { // s.contains(valueOf(targetStr.charAt(0)))
                System.out.println(s); // 조건에 맞는 문자열 출력
                count++; // 일치하는 문자열의 개수 증가
            }
        }

        if (count == 0) {
            System.out.print("찾는 단어가 없습니다.\n"); // 일치하는 문자열이 없는 경우 메시지 출력
        }
    }
}
