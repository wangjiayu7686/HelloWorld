package page01;
import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		该程序可以接收一个字符，如：a, b, c, d, e, f, g
//		a表示星期一，b表示星期二。。。
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符（a~g）:");
		char c1 = myScanner.next().charAt(0);
		//在Java中，只要有返回值，就是一个表达式
		switch(c1) {
			case 'a':
				System.out.println("星期一");
				break;
			case 'b':
				System.out.println("星期2");
				break;
			case 'c':
				System.out.println("星期3");
				break;
			default:
				System.out.println("ダメ");
		
		
		}
		
		System.out.println("退出了switch");

	}

}
