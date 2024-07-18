package page01;

public class LogicOperator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//&&短路与 and &逻辑与
		int age = 50;
		if(age > 20 && age <90) {
			System.out.println("ok");
		}
		
		//区别
		int a = 4;
		int b = 9;
		//对于&&短路与，如果第一个条件为false，后面不执行;&逻辑与的话后面继续执行
		if(a < 1 && ++b < 50) {
			System.out.println("ok111");
		}
		System.out.println("a=" + a + " b=" + b);	//a=4 b=9
		
		
		//||短路或 and ｜逻辑或
		int c = 4;
		int d = 9;
		//对于||短路或，如果第一个条件为true，后面不执行;｜逻辑或的话后面继续执行
		if(c > 1 || ++d > 5) {
			System.out.println("ok222");
		}
		System.out.println("c=" + c + " d=" + d);	//c=4 d=9


	}

}
