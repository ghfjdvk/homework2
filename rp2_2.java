import java.util.*;

class rp2_2{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	double output_degree;
	System.out.print("온도를 입력하세요 ");
	double input_degree = scanner.nextDouble();
	System.out.print("입력하신 온도가 섭씨온도이면 C를"
	+ "화씨온도이면 F를 입력하세요 ");
	String kind = scanner.next();
	if("C".equals(kind))
	{
		output_degree = (input_degree* 1.8 + 32);
		System.out.println("변환된 온도는 "+output_degree+" 입니다.");
	}	
	if("F".equals(kind))
	{
		output_degree = (input_degree - 32) / 1.8;
		System.out.println("변환된 온도는 "+output_degree+" 입니다.");
	}
}
}

