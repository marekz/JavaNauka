package GuessNumber;

import java.util.Scanner;

public class AskAboutNumber {
	
	public Integer AskQuestion() {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert value between 0 and 999");
		String newCheck = sc.next();
		Integer userValue = Integer.parseInt(newCheck);
		
		return userValue;
	}

}
