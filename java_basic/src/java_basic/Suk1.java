package java_basic;

import java.util.Scanner;

public class Suk1 {

	public static void main(String[] args) {
		// 4자리 정수를 입력받아 각 자리수를 출력하는 프로그램을 작성하시오
		
		Scanner scann = new Scanner(System.in);
		
		int number = 0;
		double num1 =0;
		double num2 =0;
		double num3 =0;
		double num4 =0;
		
		System.out.println("4자리 정수입력하시오 :");
		number = scann.nextInt();
		
		num1 = (number*0.001);
		num2 = ((number*0.001-(int)num1)*10);
		num3 = (((number*0.001-(int)num1)*10-(int)num2)*10);
		num4 = (((number*0.001-(int)num1)*10-(int)num2)*10-(int)num3)*10;
		
		System.out.println("첫번째"+(int)num1);
		System.out.println("두번째"+(int)num2);
		System.out.println("세번째"+(int)num3);
		System.out.println("네번째"+(int)num4);
	}

}
