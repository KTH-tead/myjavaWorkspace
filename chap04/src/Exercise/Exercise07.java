package Exercise;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        boolean run = true;

        int balance =0;

        Scanner scanner = new Scanner(System.in);
        while(run) {
            System.out.println("----------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------");
            System.out.println("선택>");

        int selectNum = scanner.nextInt(); // nextInt라는 걸 몰라서 다른 값으로 받으려다가 한참 찾아봄.

//            switch 활용
//            switch(selectNum) {
//            case 1:
//                System.out.println("예금액>");
//                int in=scanner.nextInt();
//                balance += in;
//                System.out.println();
//                break;
//            case 2:
//                System.out.println("출금액>");
//                int out=scanner.nextInt();
////                break; // 처음 만들었던 형태 => 마이너스 금액..bug 발생 => 0 이하 관련  if 문 하기 추가.
//                if(balance - out <0) {
//                    System.out.println("잔액이 부족합니다");
//                } else {
//                    balance -= out;
//                }
//                System.out.println();
//                break;
//            case 3:
//                System.out.println("잔고>" + balance);
//                System.out.println();
//                break;
//            case 4:
//                run = false;
//                System.out.println();
//                break;
//            }

//            if 활용
            if (selectNum == 1) {
                System.out.println("예금액>");
                int in=scanner.nextInt();
                balance += in;
            } else if ( selectNum == 2) {
                System.out.println("출금액>");
                int out=scanner.nextInt();
                if(balance - out <0) {
                    System.out.println("잔액이 부족합니다");
                } else {
                    balance -= out;
                }
            } else if (selectNum == 3) {
                System.out.println("잔고>" + balance);
            } else {
                break;
            }

        }

        System.out.println("프로그램 종료");
         scanner.close(); //Resource leak: 'scanner' is never closed 문구보고 추가.
    }
}