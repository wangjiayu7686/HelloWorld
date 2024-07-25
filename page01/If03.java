package page01;
import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//输入保国同志的信用分，100对应输出 信用极好；
//		(80, 99]>> 信用优秀
//		[60, 80]>> 信用一般
//		其他情况>> 信用不及格
		Scanner baoguo = new Scanner(System.in);
		System.out.println("请输入保国的分数：");
		int baoguo_fen = baoguo.nextInt();
		if(baoguo_fen >= 0 && baoguo_fen <= 100) {
			if(baoguo_fen == 100) {
				System.out.println("信用极好");
			}else if(baoguo_fen > 80 && baoguo_fen <= 99) {
				System.out.println("信用优秀");
			}else if(baoguo_fen >= 60 && baoguo_fen <= 80) {
				System.out.println("信用一般");
			}else {
				System.out.println("信用不及格");
			}
		}else {
			System.out.println("输入格式不对");
		}

	}

}
