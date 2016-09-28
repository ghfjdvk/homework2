import java.util.*;

class rp2_3{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int seconds;
	int m_count;
	System.out.print("날 수를 입력하세요 ");
	int days = scanner.nextInt();
	seconds = days * 24 * 60 * 60;
	System.out.println("날수에 해당되는 기간은 모두 "+seconds+" 초입니다.");
	m_count=seconds/1000000;
	if(m_count>0)
	System.out.println("100만 초가 모두 "+m_count+" 번이나 포함됩니다.");
	}
}	
