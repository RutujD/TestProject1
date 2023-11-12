package app02.com.test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputEmployee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String empId;
        String firstName = "";
        String lastName = "";
        String gender="";
        String email;
        String genderText="";
      //ユーザーさんから入力
      while (true) {
            System.out.print("社員番後を入力してください（例:0012)> ");
            empId = scanner.nextLine();
            if (empId.length() != 4) {
                System.out.println("半角4桁の社員番号を入力してください＞");
            } else {
                break;
            }
        }

        while (firstName.isEmpty()) {
            System.out.print("姓を入力してください(例:赤井) > ");
            firstName = scanner.nextLine();
        }

        while (lastName.isEmpty()) {
            System.out.print("名を入力してください(例:翠聖) >");
            lastName = scanner.nextLine();
        }

        while (!(gender.equals("1") || gender.equals("2"))) {
            System.out.print("Enter Gender (1 for Male, 2 for Female): ");
            gender = scanner.nextLine();
            
            if (!(gender.equals("1") || gender.equals("2"))) {
                System.out.println("Please enter 1 for Male or 2 for Female.");
            }
        }
        // Mapping gender input to respective text
        if (gender.equals("1")) {
            genderText = "男";
        } else if (gender.equals("2")) {
            genderText = "女";
        }
        System.out.print("生年月日を入力してください(例:1980/01/01) >  ");  
		String date = scanner.nextLine();

		System.out.print("郵便番号を入力してください(例:160-0022) >  ");  
		String code = scanner.nextLine();
		System.out.print("都道府県を入力してください(例:東京都) > ");  
		String addr1 = scanner.nextLine();

		System.out.print("区市町村を入力してください(例:新宿区) >   ");  
		String addr2 = scanner.nextLine();

		System.out.print("番地・建物を入力してください(例:新宿三丁目京王追分ビル) > ");  
		String addr3 = scanner.nextLine();

       
		while (true) {
            System.out.print("メールアドレスを入力してください: ");
            email = scanner.nextLine();

            if (email.matches("^[\\p{Alnum}]*@[\\p{Alnum}]*$")) {
                System.out.println("有効なメールアドレスです。");
                break;
            } else {
                System.out.println("＠記号の前後に半角英数字でメールアドレスを入力してください。");
            }
        }
        // 
        System.out.println("\n***** 社員情報 *****");
        System.out.println("社員番号: " + empId);
        System.out.println("氏名 : " + firstName+ lastName);
        System.out.println("性別 : " + genderText);
        System.out.println("生年月日:"+date);
		System.out.println("郵便番号: 〒"+code);
		System.out.println("住所1 :"+addr1+addr2);
		System.out.println("住所2 :"+addr3);
        System.out.println("Address: " + email);

        scanner.close(); 

        
	}

}

	
