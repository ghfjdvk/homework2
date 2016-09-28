import java.util.*;

class rp2_4{

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int total;
	double avg;
	System.out.print("국어 점수를 입력하세요 ");
	int kor = scanner.nextInt();
	System.out.print("영어 점수를 입력하세요 ");
	int eng = scanner.nextInt();
	System.out.print("수학 점수를 입력하세요 ");
	int math = scanner.nextInt();
	total = kor+eng+math;
	avg = total/3.0;
	System.out.println("입력하신 점수의 총점은 "+total+" 이고");
	System.out.println("평균은 "+avg+" 입니다");
	if(kor>=90)
		System.out.println("국어점수가 우수합니다");
	if(eng>=90)
		System.out.println("영어점수가 우수합니다");
	if(math>=90)
		System.out.println("수학점수가 우수합니다");
	}
}	
