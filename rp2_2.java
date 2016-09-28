import java.util.*;

class rp2_2{

	public static void main(String[] args){
	double c = 0;
	double f = 0;
	Scanner scanner = new Scanner(System.in);
	System.out.print("온도를 입력하세요 ");
	double input_degree = scanner.nextDouble();
	System.out.print("입력하신 온도가 섭씨온도이면 C를"
	+ "화씨온도이면 F를 입력하세요 ");
	String kind = scanner.next();
	if("C".equals(kind))
	{
		f = (input_degree* 1.8 + 32);
		System.out.println("변환된 온도는 "+f+" 입니다.");
	}	
	if("F".equals(kind))
	{
		c = (input_degree - 32) / 1.8;
		System.out.println("변환된 온도는 "+c+" 입니다.");
	}
	}
}

