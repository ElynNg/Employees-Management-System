package com.vti.ultis;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
			String regex = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()){
				return email;
			}
		}
	}

    public static void nextLine() {
		scanner.nextLine();
    }

	public static String inputName() {
		boolean check = false;
		String name = null;
		while (!check){
			name = scanner.nextLine();
			if (name.length() < 6 || name.length() > 30){
				System.out.println("enter again in range (6, 30)");
			}
			check = true;
		}
		return name;
	}

	public static String inputPassword() {
		while (true) {
			String password = ScannerUltis.inputString();
			String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(password);
			if (matcher.matches()) {
				return password;
			}
		}
	}

}
