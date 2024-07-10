package page01;

public class FloatDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		float num1 = 1.1; //だめ
		float num2 = 1.1f;
		double num3 = 1.1;
		double num4 = 1.1F;
		
		double num5 = .123;	// ==0.123
		System.out.println(num5);
		
		//科学计数法
		System.out.println(5.12e2);	//512.0  5.12乘10的2次方（因为5.12是double，所以计算结果为double类型）
		System.out.println(5.12e-2);	//0.0512 除
		
		//double比float精确
		double num9 = 2.123456789;
		float num10 = 2.123456789f;
		System.out.println(num9);	//2.123456789
		System.out.println(num10);	//2.1234567
		
		//浮点数使用陷阱
		double num11 = 2.7;
		double num12 = 8.1/3;
		
		System.out.println(num12); //2.6999999999999997
		
		if(Math.abs(num11 - num12) < 0.00001) {
			System.out.println("认为相等");
		}
		

	}

}
