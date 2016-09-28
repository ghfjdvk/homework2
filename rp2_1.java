import java.util.*;

class rp2_1{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int age;
	System.out.print("태어난 년도를 입력하세요: ");
	int birth_year = scanner.nextInt();
	age = 2014 - birth_year + 1;
	if(age > 20)
		System.out.println("미성년자가 아닙니다");
	else
		System.out.println("미성년자 입니다");
	}
}	
