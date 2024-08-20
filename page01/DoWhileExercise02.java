package page01;
import java.util.Scanner;

public class DoWhileExercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("雷の呼吸、いちの型！" + "\n" + "还钱否？y/n");
			answer = myScanner.next().charAt(0);
			
		}while(answer != 'y');
		System.out.println("OK");
	}

}
