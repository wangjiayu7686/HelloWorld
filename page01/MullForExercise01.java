package page01;
import java.util.Scanner;

public class MullForExercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//统计3个班成绩，每个班5个学生
		//求出各个班平均分和所有班平均分
		//统计三个班及格人数
		//统计60分以上的人数
		
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0; //全员总分
		int passNum = 0;
		for(int i = 1; i <= 3; i++) {
			double sum = 0; //一个班级的总分
			for(int j = 1; j <= 5; j++) {
				System.out.println("请数第" + i + "个班的第" + j + "个学生成绩");
				double score = myScanner.nextDouble();
				if(score >= 60) {
					passNum++;
				}
				sum += score;
				totalScore += score;
				System.out.println("成绩为：" + score);
			}
			System.out.println("sum=" + sum + " 平均分=" + sum/5);
		}
		System.out.println("totalScore=" + totalScore + " 平均分=" + totalScore/15);
		System.out.println("及格人数" + passNum);
	}

}
