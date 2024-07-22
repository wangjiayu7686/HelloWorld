package page01;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 99;
		
		int result = a > b ? a++ : b--;
		System.out.println(result);	//b-- 先返回b的值，再b-1; 返回99
		System.out.println(b);	//98

	}

}
