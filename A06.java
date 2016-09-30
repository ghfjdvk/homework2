import java.util.*;

class A06{

	public static void main(String[] args){
	double avg;
	Scanner scanner = new Scanner(System.in);
	System.out.print("이름 : ");
	String name = scanner.next();
	System.out.print("국어점수 입력 : ");
	int kor = scanner.nextInt();
	System.out.print("수학점수 입력 : ");
	int math = scanner.nextInt();
	System.out.print("영어점수 입력 : ");
	int eng = scanner.nextInt();
	avg = (kor+math+eng)/3.0;
	System.out.println("["+name+"]님은");
	System.out.println("평균은 "+avg+"이고");
	if(avg<60)
		System.out.println("학점은 F 입니다.");
	else if(avg>=60 && avg<65)
		System.out.println("학점은 D 입니다.");
	else if(avg>=65 && avg<70)
		System.out.println("학점은 D+ 입니다.");
	else if(avg>=70 && avg<75)
		System.out.println("학점은 C 입니다.");
	else if(avg>=75 && avg<80)
		System.out.println("학점은 C+ 입니다.");
	else if(avg>=80 && avg<85)
		System.out.println("학점은 B 입니다.");
	else if(avg>=85 && avg<90)
		System.out.println("학점은 B+ 입니다.");
	else if(avg>=90 && avg<95)
		System.out.println("학점은 A 입니다.");
	else
		System.out.println("학점은 A+ 입니다.");
	
	}
}	





