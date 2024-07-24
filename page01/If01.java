package page01;
import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**输入人的年龄，如果年龄大于18，
		 * 则输出“年龄大于18”
		 */
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄：");
		int age = myScanner.nextInt();
		if(age > 18) {
			System.out.println("年龄大于18");
		}

	}

}
