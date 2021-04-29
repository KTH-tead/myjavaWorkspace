package sec0;

import java.util.Scanner;


public class DoWhileExample {
	public static void main(String[] args) {
        System.out.println("메세지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do {
            System.out.print(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        } while ( ! inputString.equals("q")); // equals : 문자열 비교

        System.out.println();
        System.out.println("프로그램 종료");
        scanner.close(); //추가
    }
}
