package page01;

public class IfExercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//声明2个double并赋值，判断第一个数大于10.0且第二个数小于20.0,打印两数只和
		double d1 = 12.0;
		double d2 = 12.0;
		
		if(d1 > 10.0 && d2 < 20.0) {
			System.out.println(d1 + d2);
		}else {
			System.out.println("不对，重新输入");
		}
		
		
		//定义两个int,判断两者的和是否能被3又能被5整除，打印结果
		int i1 = 14;
		int i2 = 1;
		if((i1 + i2) % 3 == 0 && (i1 + i2) % 5 == 0) {
			System.out.println(i1 + "和" + i2 + "的和能被3和5整除");
		}else {
			System.out.println("no");
		}
		

	}

}
