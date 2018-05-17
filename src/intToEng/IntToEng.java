package intToEng;

import java.util.Scanner;

public class IntToEng {
	
	static final String[] first = {
			"zero",
			"one",
			"two",
			"three",
			"four",
			"five",
			"six",
			"seven",
			"eight",
			"nine",
			"ten",
			"eleven",
			"twelve",
			"thirteen",
			"fourteen",
			"fifteen",
			"sixteen",
			"seventeen",
			"eighteen",
			"nineteen"
	};

	static final String[] second = {
		"",
		"",
		"twenty",
		"thirty",
		"fourty",
		"fifty",
		"sixty",
		"seventy",
		"eighty",
		"ninety"
	};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

	}
	
	static String translateEng(int n) {
        String[] number = {};
		int a,b;
		for(int i=n; i>0; i = i/100) {
		a = i%10;
		b = a%10;
		if(b<2) number[0] = first[b*10+a];
		else {
			number[0] = first[a];
			number[1] = second[b];
		 }
		}
		return "";
    }

}
