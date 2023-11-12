//問題３

package app03.com.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {


		 private String lastName;
		 private String firstName;
		 private int gender;
		 private LocalDate dateOfBirth;

		    // コンストラクタ
		 public Person(String lastName, String firstName, int gender, String dateOfBirth) {
		        this.lastName = lastName;
		        this.firstName = firstName;
		        this.gender = gender;
		        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		        
		        
	}
		// アクセサメソッド
	public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public int getGender() {
			return gender;
		}

		public void setGender(int gender) {
			this.gender = gender;
		}

		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

	public static void main(String[] args) {
		

	}

}
