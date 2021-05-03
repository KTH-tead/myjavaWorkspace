package Exercise2;

import java.util.Scanner;


/// 문제 확인 필요.... 
//public class BankApplication {
//	private static Account[] accountArray = new Account[100];
//    private static Scanner scanner = new Scanner(System.in);
//	
//	public static void mian(String[] args) {
//		boolean run = true;
//        while(run) {
//        	System.out.println("------------------------------------------");
//            System.out.println("1.계좌생성 | 2.계좌목록 |3. 예금 | 4. 출금 | 5.종료");
//            System.out.println("------------------------------------------");
//            System.out.print("선택> ");
//			
//		int selectNo = scanner.nextInt();
//		
//		if(selectNo == 1) {
//            createAccount();
//        } else if(selectNo == 2) {
//            accountList();
//        } else if(selectNo == 3) {
//            deposit();
//        } else if(selectNo == 4) {
//            withdraw();
//        } else if(selectNo == 5) {
//            run = false;
//        }
//	  }
//	  System.out.println("프로그램 종료");
//	}
//
//
//
//    //계좌생성하기
//    private static void createAccount() {
//        System.out.println("---------------");
//        System.out.println("계좌생성");
//        System.out.println("---------------");
//	
//		System.out.print("계좌번호 :"); 
//		String ano = scanner.next();
//		
//		System.out.print("계좌주 :"); 
//		String owner = scanner.next();
//		
//		System.out.print("최초잔고 :"); 
//		int balance = scanner.nextInt();
//	
//		Account account = new Account (ano, owner, balance);
//		
//			for (int i =0; i<accountArray.length; i++) {
//				if(accountArray[i] == null) {
//					accountArray[i] = account;
//					System.out.println("결과 : 계좌가 생성되었습니다.");
//					break;
//				}
//			}
//    }
////계좌목록보기
//private static void accountList() {
//	System.out.println("-------------");
//	System.out.println("계좌목록");
//	System.out.println("-------------");
//			
//	for(int i = 0; i < accountArray.length; i++)  {
//		    if(accountArray[i] == null) break;
//					//System.out.println("계좌가 없습니다.");
//					
//					System.out.println(accountArray[i].getAno() + "\t"
//							+ accountArray[i].getOwner() + "\t" +accountArray[i].getBalance());
//			}
//		}
//
//		//예금하기
//		private static void deposit() {
//			System.out.println("-------------");
//			System.out.println("예금");
//			System.out.println("-------------");
//			
//			System.out.print("계좌번호 :"); 
//			String ano = scanner.next();
//			
//			System.out.print("예금액 :"); 
//			int balance = scanner.nextInt();
//			
//			Account account = findAccount (ano);
//			
//			if(account == null) {
//				System.out.println("결과가 존재하지 않습니다.");
//				return;
//			}
//			
//			account.setBalance(account.getBalance()+balance);
//			System.out.println("결과 : 예금이 성공되었습니다.");
//		}
//
//		
//		//출금하기
//		private static void withdraw() {
//			System.out.println("-------------");
//			System.out.println("출금");
//			System.out.println("-------------");
//			
//			System.out.print("계좌번호 :"); 
//			String ano = scanner.next();
//			
//			System.out.print("출금액 :"); 
//			int balance = scanner.nextInt();
//			
//			Account account = findAccount (ano);
//			
//			if(account == null) {
//				System.out.println("결과가 존재하지 않습니다.");
//				return;
//			}
//			if (account.getBalance()< balance) {
//				System.out.println("예금액보다 많음 금액을 기입했습니다.");
//				return;
//			}
//			account.setBalance(account.getBalance() - balance);
//			System.out.println("결과: 출금이 성공되었습니다.");
//			
//		}
//		
//
//		//Account 배열에서 ano와 동일한 Account 객체 찾기 
//		private static Account findAccount(String ano) { 
//			Account account = null;
//			for (int i=0; i<accountArray.length; i++) {
//				if (accountArray[i] !=null) {
//					if(accountArray[i].getAno().equals(ano)) {
//						account = accountArray[i];
//						break;
//					}
//				}
//			}
//			return account;
//			
//		 
//		}	
//	
//
//}

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 |3. 예금 | 4. 출금 | 5.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택> ");
 
            int selectNo = scanner.nextInt();
 
            if(selectNo == 1) {
                createAccount();
            } else if(selectNo == 2) {
                accountList();
            } else if(selectNo == 3) {
                deposit();
            } else if(selectNo == 4) {
                withdraw();
            } else if(selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
 
    //계좌생성하기
    private static void createAccount() {
        System.out.println("---------------");
        System.out.println("계좌생성");
        System.out.println("---------------");
 
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        //  print 된 이후에 입력되는 내용을 scanner로 접수
 
        System.out.print("계좌주: ");
        String owner = scanner.next();
        // print 된 이후에 입력되는 내용을 scanner로 접수

 
        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();
     // print 된 이후에 입력되는 내용을 scanner로 접수
        
        //계좌 정보를 저장할 객체 생성(생성자를 통해 입력값으로 필드 초기화)
        Account account = new Account(ano, owner, balance);
        
        for(int i = 0; i < accountArray.length; i++) { // accountArray 배열 길이만큼 반복.)
            if(accountArray[i] == null) {
                accountArray[i] = account; 
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }        
    }
 
    //계좌목록보기
    private static void accountList() {
        System.out.println("---------------");
        System.out.println("계좌목록");
        System.out.println("---------------");
 
        for(int i = 0; i < accountArray.length; i++) {
            if(accountArray[i] == null) break;
            System.out.println(accountArray[i].getAno() + "\t" 
                    + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
        }
    }
 
    //예금하기
    private static void deposit() {
        System.out.println("---------------");
        System.out.println("예금");
        System.out.println("---------------");
 
        System.out.print("계좌번호: ");
        String ano = scanner.next();
 
        System.out.print("예금액: ");
        int balance = scanner.nextInt();    
 
        Account account = findAccount(ano);
 
        if(account == null) {
            System.out.println("결과: 계좌가 존재하지 않습니다.");
            return;
        }
        
        account.setBalance(account.getBalance() + balance);
        System.out.println("결과: 예금이 성공되었습니다.");    
    }
 
    //출금하기
    private static void withdraw() {
        System.out.println("---------------");
        System.out.println("출금");
        System.out.println("---------------");    
 
        System.out.print("계좌번호: ");
        String ano = scanner.next();
 
        System.out.print("출금액: ");
        int balance = scanner.nextInt();    
 
        Account account = findAccount(ano);
 
        if(account == null) {
            System.out.println("결과: 계좌가 존재하지 않습니다.");
            return;
        }
 
        if(account.getBalance() < balance) {
            System.out.println("예금액보다 많은 금액을 출금할 수 없습니다.");
            return;
        }
 
        account.setBalance(account.getBalance() - balance);
        System.out.println("결과: 출금이 성공되었습니다.");    
        
    }
 
    //Account 배열에서 ano와 동일한 Account 객체 찾기
    private static Account findAccount(String ano) {
        Account account = null;
        for(int i = 0; i < accountArray.length; i++) {
            if(accountArray[i] != null) {
                if(accountArray[i].getAno().equals(ano)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }
}


