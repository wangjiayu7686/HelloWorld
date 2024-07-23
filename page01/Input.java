package page01;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建Scanner对象
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名字：");
		String name = myScanner.next();
		System.out.println("请输入年龄：");
		int age = myScanner.nextInt();
		System.out.println("请输入薪水：");
		double sal = myScanner.nextDouble();
		System.out.println("信息如下：" + "\n" + "name:" 
						+ name + " age:" + age + " sal:" + sal );

	}

}
