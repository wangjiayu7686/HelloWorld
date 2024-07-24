package page01;

public class BitOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1       00000000 00000000 00000000 00000001
		// 1右移2位 00000000 00000000 00000000 00000000
		System.out.println(1 >> 2); //0
		
		// 1       00000000 00000000 00000000 00000001
		// 1左移2位 00000000 00000000 00000000 00000100
		System.out.println(1 << 2); //4
		
		System.out.println(4 << 3); //4 * 2 * 2 * 2 = 32
		System.out.println(15 >> 2); //15 / 2 / 2 = 3

	}

}
