package java_basic;

public class SubjectScore {

	public static void main(String[] args) {
		int kor =76 ;
		int eng = 80;
		int math = 90;
		int sci = 67;
		
		
		int total=0;
		float avg=0f;
		
		total = kor + eng + math +sci;
		avg = total/4f;
		avg = (int)(avg*100+5)/10/10f;
		
		System.out.println("±¹\t¿µ\t¼ö\t°ú\tÃÑÁ¡\tÆò±Õ");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%f",kor,eng,math,sci,total,avg);
		
		
	}

}
