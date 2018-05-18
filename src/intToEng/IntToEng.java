package intToEng;

import java.util.Scanner;

public class IntToEng {

	static final String[] first = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	static final String[] second = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	static final String[] unit = { "thousand", "million", "billion" };

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int input = sc.nextInt();
		System.out.println(translateEng(12));

	}

	static String translateEng(int n) {
		String[] number = new String[10];
		for(int i=0; i<10;i++) number[i] = "";
		int a, b, c, count = 0;
		for (int i = n; i > 0; i = i / 1000) {
			a = i % 10;
			b = (i / 10) % 10;
			c = (i / 100) % 10;
			if (c >= 1)
				number[count] += " " +first[c] + " hundred";
			if (b < 2)
				number[count] += " " + first[b * 10 + a];
			else {
				number[count] = " " + second[b] + " " + first[a];
			}
			if(count>=1) number[count] += " " +unit[count-1];
			count++;
		}
		for(int i=count; i>-1; i--) {
			number[count] += number[i];
		}
		return number[count];
	}

}
