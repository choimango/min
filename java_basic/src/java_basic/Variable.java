package java_basic;

public class Variable {

	public static void main(String[] args) {
		
		byte b;
		short s;
		int i;
		long l;
		char c;
		String str;
		
		b=Byte.MAX_VALUE; //.MAX_VALUE�� ���� �ִ��� �˼�����
		s=Short.MAX_VALUE;
		i=Integer.MAX_VALUE;
		l=Long.MAX_VALUE;
		str="\n\"�谡 \" \t\" ������\""; // \n : enter, \t : tab , \"" : ""�ֱ�
		
		c='A';
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.printf("���� : "+ c); //("%c",c) -> ���� ���
		System.out.printf("\n���� : "+(int)c);
		System.out.println(str);
	}

}
