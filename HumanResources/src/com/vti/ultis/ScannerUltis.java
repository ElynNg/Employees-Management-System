package com.vti.ultis;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class ScannerUltis {

	static Scanner scanner = new Scanner(System.in);

	public static int inputInt() {
		while (true) {
			try {
				return Integer.parseInt(scanner.next().trim());
			} catch (Exception e) {
				System.out.println("enter again:");
			}
		}
	}

	public static String inputString() {
		String string;
		while (true) {
			string = scanner.nextLine().trim();
			if (!string.isEmpty()) {
				return string;
			} else {
				System.out.println("enter again:");
			}
		}
	}

	public static LocalDate inputDate() {
		String input;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		while (true) {
			try {
				input = scanner.next().trim();
				if (format.parse(input) != null) {
					LocalDate localDate = LocalDate.parse(input);
					return localDate;
				}
			} catch (Exception e) {
				System.out.println("enter again:");
			}
		}
	}

	public static int inputIntPositive() {
		while (true) {
			try {
				int intPositive = Integer.parseInt(scanner.next().trim());
				if (intPositive > 0){
					return intPositive;
				}else throw new Exception();
			} catch (Exception e) {
				System.out.println("enter again:");
			}
		}
	}

	public static String inputEmail(){
		while (true){
			String email = ScannerUltis.inputString();
			if (email == null || !email.contains("@")){
				System.out.println("enter again");
			}else return email;
		}
	}


}
