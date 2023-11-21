package java_basic;

public class Variable {

	public static void main(String[] args) {
		
		byte b;
		short s;
		int i;
		long l;
		char c;
		String str;
		
		b=Byte.MAX_VALUE; //.MAX_VALUE를 쓰면 최댓값을 알수있음
		s=Short.MAX_VALUE;
		i=Integer.MAX_VALUE;
		l=Long.MAX_VALUE;
		str="\n\"배가 \" \t\" 고프다\""; // \n : enter, \t : tab , \"" : ""넣기
		
		c='A';
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.printf("문자 : "+ c); //("%c",c) -> 문자 출력
		System.out.printf("\n숫자 : "+(int)c);
		System.out.println(str);
	}

}
