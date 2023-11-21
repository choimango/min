package java_basic;

public class Casting {

	public static void main(String[] args) {
		byte b = 13;
		short s = 3;
		int i = 2;
		long l = 9l;
		float f = 2f;
		double d = 1.2;
		
		b = (byte)i;
		//b = (byte)s;
		//s = b;
		
		//강제 캐스팅은 반드시 if문 사용
		
		/*long l = (long)c;//l에 c를 넣음
		int i = (int)l; //long보다 int가 작기 때문에 실행x */
		/*long l = c;
		  int i = l;  -> 실행 안됨 강제형변환을 해야함 (byte->short->int->iong->float->double)순으로 커짐*/
		
		
		System.out.println("몫 : "+ s/i);
		System.out.println("나머지 : "+ s%i);
		
		
		
		/*System.out.println(b);
		System.out.println(s+i);
		System.out.println(s/i);//(s+i)=int로 출력,  (s+f)=
		
		System.out.println(s+f);
		System.out.println(s/f);
		
		System.out.println(1/2);
		System.out.println(1/2f);*/

	}

}
