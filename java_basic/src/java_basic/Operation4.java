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
		
		System.out.println("ù��° ���� : ");
		firstInt=scann.nextInt();
		System.out.println("�ι�° ���� : ");
		secondInt=scann.nextInt();
		
		sum = firstInt + secondInt;
		minus = firstInt - secondInt;
		multi = firstInt * secondInt;
		div = firstInt / (float)secondInt;
		
		mock = secondInt / firstInt;
		remainder = secondInt % firstInt;
		
		System.out.println(" ù��° ���� : " +firstInt);//float(over, flow)
		System.out.println(" �ι�° ���� : " +secondInt);
		System.out.println(" ���ϱ� : "+sum);
		System.out.println(" ���� : "+minus);
		System.out.println(" ���ϱ� : "+multi);
		System.out.println(" ������ : "+div);
		System.out.println(" �� : "+mock);     //int 
		System.out.println(" ������ : "+remainder);

	}

}
