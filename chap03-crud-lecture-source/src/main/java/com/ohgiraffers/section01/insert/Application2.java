package com.ohgiraffers.section01.insert;

import java.util.Scanner;

/* 설명.
 *  Service 계층과 Repository 계층을 구분하고 XML 파일에서부터 쿼리를 불러와서
 *  insert 해보기
* */
public class Application2 {

    /* 설명. view이자 controller개념(하나의 Menu 객체로 만들기)인 main에서부터 시작 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("메뉴의 이름을 입력하세요: ");
        String menuName = scanner.nextLine();
        System.out.println("메뉴의 가격을 입력하세요: ");
        int menuPrice = scanner.nextInt();
        System.out.println("카테고리 코드를 입력하세요: ");
        int categoryCode = scanner.nextInt();
        System.out.println("판매 상태를 입력하세요(Y/N): ");
        scanner.nextLine();
        String orderableStatus = scanner.nextLine();

        Menu registMenu = new Menu(menuName, menuPrice, categoryCode, orderableStatus);

        MenuService service = new MenuService();
        service.registMenu(registMenu);
    }
}
