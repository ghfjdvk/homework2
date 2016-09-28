import java.util.*;

class rp2_5{

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int age;
	System.out.print("태어난 연도를 입력하세요 ");
	int birth_year = scanner.nextInt();
	age = 2012 - birth_year + 1;
	if(age<7)
		System.out.println("유아입니다.");
	else if(7<=age && age<13)	
		System.out.println("어린이입니다.");
	else if(13<=age && age<20)
		System.out.println("청소년입니다.");
	else if(20<=age && age<30)
		System.out.println("청년입니다.");
	else if(30<=age && age<60)
		System.out.println("중년입니다.");
	else
		System.out.println("노년입니다.");
	}
}	
