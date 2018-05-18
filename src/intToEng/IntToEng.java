package intToEng;

import java.util.Scanner;

public class IntToEng {

	static final String[] first = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	static final String[] second = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	static final String[] unit = { "thousand", "million", "billion"};

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(translateEng(input));
	}

	public static String translateEng(int n) {
		if(n == 0) return first[0];
		String[] number = new String[10];
		for(int i=0; i<10;i++) number[i] = "";
		int low, middle, high, count = 0;
		for (int i = n; i > 0; i = i / 1000) {
			low = i % 10;
			middle = (i / 10) % 10;
			high = (i / 100) % 10;
			if (high >= 1)
				number[count] += " " +first[high] + " hundred";
			if(low == 0 && middle == 0)  {
				count++;
				continue;
			}
			if (middle < 2)
				number[count] += " " + first[middle * 10 + low];
			else if(low == 0)
				number[count] += " " + second[middle];
			else {
				number[count] += " " + second[middle] + " " + first[low];
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
