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
		
		//���� ĳ������ �ݵ�� if�� ���
		
		/*long l = (long)c;//l�� c�� ����
		int i = (int)l; //long���� int�� �۱� ������ ����x */
		/*long l = c;
		  int i = l;  -> ���� �ȵ� ��������ȯ�� �ؾ��� (byte->short->int->iong->float->double)������ Ŀ��*/
		
		
		System.out.println("�� : "+ s/i);
		System.out.println("������ : "+ s%i);
		
		
		
		/*System.out.println(b);
		System.out.println(s+i);
		System.out.println(s/i);//(s+i)=int�� ���,  (s+f)=
		
		System.out.println(s+f);
		System.out.println(s/f);
		
		System.out.println(1/2);
		System.out.println(1/2f);*/

	}

}
