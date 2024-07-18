package page01;

public class ArithmeticOperator02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.需求：假如还有59天放假，问：合XX星期零XX天
		
		int days = 59;
		int weeks = days / 7;
		int leftdays = days % 7;
		System.out.println(days + "天相当于" + weeks + "星期零" + leftdays + "天");

		
//		2.需求：定义变量double huaShi 保存华氏温度。
//		摄氏度=5/9（华氏温度-100）
		
		double huaShi = 1234.5;
		double sheShi = 5.0 / 9 * (huaShi - 100);
		System.out.println("华氏温度" + huaShi +" 对应的摄氏温度" + sheShi);
				
	}

}
