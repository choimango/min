package java_basic;

import java.util.Scanner;

public class Operation4 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		int firstInt = 0;
		int secondInt = 0;
		
		float sum=0;
		float minus=0;
		float multi=0;
		float div=0;
		int mock=0;
		int remainder=0;
		
		System.out.println("첫번째 정수 : ");
		firstInt=scann.nextInt();
		System.out.println("두번째 정수 : ");
		secondInt=scann.nextInt();
		
		sum = firstInt + secondInt;
		minus = firstInt - secondInt;
		multi = firstInt * secondInt;
		div = firstInt / (float)secondInt;
		
		mock = secondInt / firstInt;
		remainder = secondInt % firstInt;
		
		System.out.println(" 첫번째 정수 : " +firstInt);//float(over, flow)
		System.out.println(" 두번째 정수 : " +secondInt);
		System.out.println(" 더하기 : "+sum);
		System.out.println(" 빼기 : "+minus);
		System.out.println(" 곱하기 : "+multi);
		System.out.println(" 나누기 : "+div);
		System.out.println(" 몫 : "+mock);     //int 
		System.out.println(" 나머지 : "+remainder);

	}

}
