package page01;

public class InverseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//！取反操作
		System.out.println(6 > 2);
		System.out.println(!(6 > 2));
		
		//a^b:逻辑或异，当a和b不同时，结果为true，否则为false
		boolean b = (10 > 1) ^ (3 > 5);
		System.out.println("b=" + b);

	}

}
