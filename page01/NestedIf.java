package page01;
import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		参加歌手比赛，如初赛成绩大于8.0进入决赛
//		否则提示淘汰，并根据性别提示进入男子组或女子组
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入歌手成绩：");
		double score = myScanner.nextDouble();
		if(score > 8.0) {
			System.out.println("请输入歌手性别：");
			char gender = myScanner.next().charAt(0);
			if(gender =='男') {
				System.out.println("进入男子组");
			}else {
				System.out.println("进入女子组");
			}
		}else {
			System.out.println("成绩不及格");
		}
		

	}

}
