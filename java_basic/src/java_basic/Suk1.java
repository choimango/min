package java_basic;

import java.util.Scanner;

public class Suk1 {

	public static void main(String[] args) {
		// 4�ڸ� ������ �Է¹޾� �� �ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		
		Scanner scann = new Scanner(System.in);
		
		int number = 0;
		double num1 =0;
		double num2 =0;
		double num3 =0;
		double num4 =0;
		
		System.out.println("4�ڸ� �����Է��Ͻÿ� :");
		number = scann.nextInt();
		
		num1 = (number*0.001);
		num2 = ((number*0.001-(int)num1)*10);
		num3 = (((number*0.001-(int)num1)*10-(int)num2)*10);
		num4 = (((number*0.001-(int)num1)*10-(int)num2)*10-(int)num3)*10;
		
		System.out.println("ù��°"+(int)num1);
		System.out.println("�ι�°"+(int)num2);
		System.out.println("����°"+(int)num3);
		System.out.println("�׹�°"+(int)num4);
	}

}
