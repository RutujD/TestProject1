//問題1
package app01;

import java.io.IOException;
import java.util.Scanner;

public class InputEmployee1 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 
		//ユーザーさんから入力
		 Scanner scanner = new Scanner(System.in);
        

        
           System.out.print("社員番後を入力してください（例:0012)> "); 
            int num = scanner.nextInt();
            
            scanner.nextLine();
            
           System.out.print("姓を入力してください(例:赤井) > ");   
            String name1 = scanner.nextLine();
           System.out.print("名を入力してください(例:翠聖) > ");
            String name2 = scanner.nextLine();

            System.out.print("性別を選択してください(男:1 女:2) > "); 
            int gender = scanner.nextInt();
            
            scanner.nextLine();
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


            System.out.print("メールアドレスを入力してください(例:akai @uc.com) > ");  
            String email = scanner.nextLine();

           
			String name=name1+name2;
			
			
			//出力を表示する
			System.out.println("***** 社員情報 *****");  
			System.out.println("--------------------");
			System.out.println("社員番号:"+num);
			System.out.println("氏名 :"+name);
				if (gender==1) {
					System.out.println("性別 :男");
				} else if (gender==2) {
					System.out.println("性別 :女");
				} 
				
			
			System.out.println("生年月日:"+date);
			System.out.println("郵便番号: 〒"+code);
			System.out.println("住所1 :"+addr1+addr2);
			System.out.println("住所2 :"+addr3);
			System.out.println("メール :"+email);
			System.out.println("---------------------");
			scanner.close();
       
    }

}
